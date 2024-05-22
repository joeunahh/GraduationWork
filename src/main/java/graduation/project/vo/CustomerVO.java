package graduation.project.vo;

import javax.validation.constraints.NotEmpty;

public class CustomerVO {
	
	@NotEmpty(message = "필수 항목입니다.")
	private String id;
	@NotEmpty(message = "필수 항목입니다.")
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
