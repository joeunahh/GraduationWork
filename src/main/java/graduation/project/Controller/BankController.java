package graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BankController {
	
	@RequestMapping("bank/")
	public String bankMain() {
		return "bankMain";
	}
	
	

}
