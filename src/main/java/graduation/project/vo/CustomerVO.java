package graduation.project.vo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerVO {
	
	@NotEmpty(message = "필수 항목입니다.")
	@Size(min = 4, message = "아이디는 최소 4자 이상이어야 합니다.")
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "아이디는 영어와 숫자로만 가입가능합니다.")
	private String id;
	
	@NotEmpty(message = "필수 항목입니다.")
	@Size(min = 8, message = "비밀번호는 최소 8자이상이어야 합니다.")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$", message = "비밀번호는 영어와 숫자를 포함해야 가입가능합니다")
	private String pwd;
	
	@NotEmpty(message = "필수 항목입니다.")
	private String name;
	@NotEmpty(message = "필수 항목입니다.")
	private String phone;
	@NotEmpty(message = "필수 항목입니다.")
	private String register_num;
	
	
	public CustomerVO(String id, String pwd, String name, String phone, String register_num) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.register_num = register_num;
	}
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegister_num() {
		return register_num;
	}
	public void setRegister_num(String register_num) {
		this.register_num = register_num;
	}
	
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone + ", register_num="
				+ register_num + "]";
	}
}
