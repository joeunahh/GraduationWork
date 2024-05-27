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
public class CustomerController {
	
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
}
