package graduation.project.vo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


public class AccountVO {

	private int accNo;
	@Digits(integer = 4, fraction = 0, message = "비밀번호는 숫자 4자리로 입력하세요.")
	@NotNull(message = "필수 항목입니다.")
	private int accPwd;
	private String name;
	private String accName;
	private String id;
	private int balance;
	
	public AccountVO() {
	}
	
	public AccountVO(int accNo, int accPwd, String name, String accName, String id, int balance) {
		super();
		this.accNo = accNo;
		this.accPwd = accPwd;
		this.name = name;
		this.accName = accName;
		this.id = id;
		this.balance = balance;
	}
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getAccPwd() {
		return accPwd;
	}
	public void setAccPwd(int accPwd) {
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
	
	@Override
	public String toString() {
		return "AccountVO [accNo=" + accNo + ", accPwd=" + accPwd + ", name=" + name + ", accName=" + accName + ", id="
				+ id + ", balance=" + balance + "]";
	}
	
	
}
