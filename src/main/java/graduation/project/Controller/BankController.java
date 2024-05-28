package graduation.project.Controller;

import java.util.Random;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import graduation.project.service.AccountService;
import graduation.project.vo.AccountVO;
import graduation.project.vo.CustomerVO;

@Controller
@RequestMapping("/")
public class BankController { //은행 
	
	private AccountService service;
	
	@RequestMapping("bank/")
	public String bankMain() {
		return "bankMain";
	} //메인페이지 
	
	@RequestMapping("about")
	public String about() {
		return "example/about";
	} // 
	
	@RequestMapping("work")
	public String work() {
		return "example/work";
	} // 
	
	@RequestMapping("work-single")
	public String workSingle() {
		return "example/work-single";
		
	} //

	public String pricing() {
		return "example/pricing";
	} //
	
	public String contact() {
		return "example/contact";
	}
	
	@GetMapping("accountOpen")
	public String openAcc(HttpSession session, Model model) {
		CustomerVO customer = (CustomerVO)session.getAttribute("logVO");
		
		AccountVO acc = new AccountVO();
		acc.setName(customer.getName());
		model.addAttribute("accVO", acc);
		return "bank/openAccount";
	}
	
	@PostMapping("accountOpen")
	public String openAcc(@Valid AccountVO acc, BindingResult result, HttpSession session) throws Exception{
		if(result.hasErrors()) {
			return "bank/openAccount";
		}else {
			Random r = new Random();
			int no = 0;
			for(int i = 0; i < 9; i++) {
	            int digit = r.nextInt(10);
	            no = no * 10 + digit;
	        }
			
			CustomerVO log = (CustomerVO)session.getAttribute("logVO");
			
			acc.setId(log.getId());
			acc.setAccNo(no);
			if(acc.getAccName().equals("")) {
				acc.setAccName(null);
			}
			System.out.println(acc);
			service.openAccount(acc);
			return "redirect:/";
		}
	}
}
