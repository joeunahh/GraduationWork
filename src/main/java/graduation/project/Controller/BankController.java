package graduation.project.Controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import graduation.project.service.AccountService;
import graduation.project.vo.AccountVO;
import graduation.project.vo.CustomerVO;
import graduation.project.vo.HistoryVO;

@Controller
@RequestMapping("/")
public class BankController { //은행 
	
	@Autowired
	private AccountService service;
	
	@GetMapping("accountOpen")
	public String openAccForm(HttpSession session, Model model) {
		CustomerVO customer = (CustomerVO)session.getAttribute("logVO");
		
		AccountVO acc = new AccountVO();
		acc.setName(customer.getName());
		model.addAttribute("accVO", acc);
		return "bank/openAccount";
	}
	
	@PostMapping("accountOpen")
	public String openAcc(@Valid @ModelAttribute("accVO") AccountVO acc, BindingResult result, HttpSession session) throws Exception{
		if(result.hasErrors()) {
			return "bank/openAccount";
		}else {
			Random r = new Random();
			StringBuilder no = new StringBuilder();
			for(int i = 0; i < 12; i++) {
	            no.append(r.nextInt(9) + 1);
	        }
			
			String accNo = no.toString();
			
			CustomerVO log = (CustomerVO)session.getAttribute("logVO");
			
			acc.setId(log.getId());
			acc.setAccNo(accNo);
			if(!acc.getAccName().equals("")) {
				acc.setAccName(acc.getAccName());
			}
			service.openAccount(acc);
			return "redirect:/";
		}
	}
	
	@GetMapping("accountList")
	public String accountList(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		CustomerVO get = (CustomerVO)session.getAttribute("logVO");
		List<AccountVO> list = service.selectAccMy(get.getId());
		
		request.setAttribute("account", list);
		
		return "bank/accList";
	}
	
	@GetMapping("history/{no}")
	public String accHistory(@PathVariable("no") String accNo, HttpServletRequest request) throws Exception{
		List<HistoryVO> list = service.selectMyHis(accNo);
		request.setAttribute("history", list);
		
		return "bank/accHistory";
	}
	
	@GetMapping("accHistory")
	public String historyAll(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		CustomerVO log = (CustomerVO)session.getAttribute("logVO");
		String id = log.getId();
		
		List<HistoryVO> list = service.allHistory(id);
		request.setAttribute("historyAll", list);
		
		return "bank/allAccHistory";
	}
	
	@GetMapping("transfer")
	public String transferForm() throws Exception{
		

        return "bank/transfer";
	}
}
