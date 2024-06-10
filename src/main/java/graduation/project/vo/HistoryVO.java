package graduation.project.vo;

public class HistoryVO {

	private int no;
	private int accNo;
	private String category;
	private int amount;
	private String date;
	private String name;
	
	public HistoryVO() {
		super();
	}

	public HistoryVO(int no, int accNo, String catrgory, int amount, String date, String name) {
		super();
		this.no = no;
		this.accNo = accNo;
		this.category = catrgory;
		this.amount = amount;
		this.date = date;
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getCatrgory() {
		return category;
	}

	public void setCatrgory(String catrgory) {
		this.category = catrgory;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "HistoryVO [no=" + no + ", accNo=" + accNo + ", catrgory=" + category + ", amount=" + amount + ", date="
				+ date + ", name=" + name + "]";
	}
}
