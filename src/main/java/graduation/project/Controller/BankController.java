package graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {
	
	@RequestMapping("bank/")
	public String bankMain() {
		return "bankMain";
	} //bankMain 뷰 제공 
	
	@RequestMapping("about")
	public String about() {
		return "example/about";
	} //
	
	//컨트롤러를 몇 개 만들지...
	//
	
	
	
	
	
	
	
	
	
	

}
