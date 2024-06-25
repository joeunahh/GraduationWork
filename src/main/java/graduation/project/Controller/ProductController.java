package graduation.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import graduation.project.service.ProductService;
import graduation.project.vo.ProductVO;

@Controller
public class ProductController {
	
	//상품 등록 페이지 이동 
	@GetMapping("register")
	public String productRegisterForm(ProductVO product, Model model) {
		model.addAttribute("p", new ProductVO());
		return "product/register";
	}
	
	//회원용 상품 목록 조회
//	@GetMapping("view")
//	public String viewProductList(Model model) {
//		try {
//			model.addAttribute("products", ProductService.selectAllProducts());
//			return "product/viewList";
//		} catch(Exception e) {
//			model.addAttribute("message", "목록을 불러오는데 실패했습니다.");
//			return "error";
//		}
//	}
//	
	
	
	
	
	
	

}
