package graduation.project.vo;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class AccountVO {

	private String accNo;
	@Length(min = 4, max = 4, message = "비밀번호는 4자리의 숫자를 입력해주세요.")
	@NotEmpty(message = "비밀번호는 필수항목입니다.")
	private String accPwd;
	private String name;
	private String accName;
	private String id;
	private int balance;
	private String date;
	
	public AccountVO() {
	}
	
	public AccountVO(String accNo, String accPwd, String name, String accName, String id, int balance, String date) {
		super();
		this.accNo = accNo;
		this.accPwd = accPwd;
		this.name = name;
		this.accName = accName;
		this.id = id;
		this.balance = balance;
		this.date = date;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccPwd() {
		return accPwd;
	}
	public void setAccPwd(String accPwd) {
		this.accPwd = accPwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "AccountVO [accNo=" + accNo + ", accPwd=" + accPwd + ", name=" + name + ", accName=" + accName + ", id="
				+ id + ", balance=" + balance + ", date=" + date + "]";
	}
	
	
}
