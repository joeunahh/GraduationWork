package graduation.project.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import graduation.project.service.CustomerService;
import graduation.project.vo.CustomerVO;

@Controller
public class CustomerController { // 사용자 로그인 로그아웃 회원가입
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/login")
	public String loginForm() {
		return "customer/login";
	}
	
	@PostMapping("/login")
	public String login(CustomerVO customer, HttpSession session) throws Exception{
		CustomerVO log = service.login(customer);
		if(log != null) {
			session.setAttribute("logVO", log);
			return "redirect:/";
		}else {
			return "customer/login";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	@GetMapping("/signUp")
	public String signUpForm(Model model) {
		CustomerVO customer = new CustomerVO();
		model.addAttribute("customerVO", customer);
		return "customer/signUp";
	}
	
	@PostMapping("/signUp")
	public String signUp(@Valid CustomerVO customer, BindingResult result) throws Exception{
		List<CustomerVO> idCheck = service.checkID(customer);
		if(result.hasErrors()) {
			return "customer/signUp";			
		}else if(idCheck.size() == 0) {
			service.signUp(customer);
			return "redirect:/";
		}else {
			return "customer/signUp";
		}
	}
	
	@GetMapping("updateForm")
	public String updateForm(Model model, HttpSession session) {
		CustomerVO userVO = (CustomerVO) session.getAttribute("userVO");
		if(userVO==null) return "customer/login";	// 로그아웃 버튼은 로그인시에 나오기때문에 이줄 코드는 딱히 필요없음
		model.addAttribute("service", userVO);
		return "customer/updateForm";
	}
	
	//@GetMapping("deleteForm")
	//public String deleteForm() {
		//CustomerVO userVO = (CustomerVO) session.getAttribute("userVO");
		
	//}
}
