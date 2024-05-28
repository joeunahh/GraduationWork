package graduation.project.vo;

public class BankManagerVO {
	private String managerId;
	private String managerPwd;
	
	
	

	
	private String id;
	private String pwd;
	public BankManagerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankManagerVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
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
	@Override
	public String toString() {
		return "BankManagerVO [id=" + id + ", pwd=" + pwd + "]";
	}
}
