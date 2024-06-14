package graduation.project.Controller;

<<<<<<< HEAD
//<<<<<<< HEAD
//import java.util.HashMap;
=======
import java.util.HashMap;
>>>>>>> 1f162aa5e9f0a01092573c177074b984c87b86d2
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		CustomerVO idCheck = service.checkID(customer.getId());
		if(result.hasErrors()) {
			return "customer/signUp";			
		}else if(idCheck == null) {
			service.signUp(customer);
			return "redirect:/";
		}else {
			return "customer/signUp";
		}
	}
	
	@GetMapping("/updateForm")
	public String updateForm(Model model, HttpSession session) {
		CustomerVO userVO = (CustomerVO) session.getAttribute("userVO");
		model.addAttribute("service", userVO);
		return "customer/updateForm";
	}
	
<<<<<<< HEAD
	@RequestMapping("/login") 
		@ResponseBody
		public Map<Object, Object> idcheck(@RequestBody String userid) {
			int count = 0;
//			Map<Object, Object> map = new HashMap<Object, Object>();
			
			//count = CustomerService.idcheck(userid);
//			map.put("cnt", count);
			
//			return map;
	}
	
	
=======
>>>>>>> 1f162aa5e9f0a01092573c177074b984c87b86d2
	//@GetMapping("deleteForm")
	//public String deleteForm() {
		//CustomerVO userVO = (CustomerVO) session.getAttribute("userVO");
		
	//}
	
	@PostMapping("/checkId")
	@ResponseBody
	public boolean checkId(@RequestBody String id) throws Exception {
		CustomerVO check = service.checkID(id); 
		if(check != null) {
			return false;
		}else {
			return true;
		}
	}
}
