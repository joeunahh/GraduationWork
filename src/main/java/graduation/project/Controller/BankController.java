package graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController { //은행 
	
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
}
