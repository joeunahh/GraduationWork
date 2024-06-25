package graduation.project.vo;

public class ProductVO {
	
	private int product_code;
	private String product_name; //상품 이름
	private String product_feature; //상품 설명
	private float interestRate; //금리 
	private int SubscriptionAmount; //초기 가입금액
	private int ContractPeriod; //계약 기간
	private int NewSubscription; //신규 가입 가능 여부 
	
	
	
	public ProductVO() {
		super();
	}

	public ProductVO(int product_code, String product_name, String product_feature, float interestRate,
			int subscriptionAmount, int contractPeriod, int newSubscription) {
		super();
		this.product_code = product_code;
		this.product_name = product_name;
		this.product_feature = product_feature;
		this.interestRate = interestRate;
		SubscriptionAmount = subscriptionAmount;
		ContractPeriod = contractPeriod;
		NewSubscription = newSubscription;
	}
	
	public int getProduct_code() {
		return product_code;
	}
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_feature() {
		return product_feature;
	}
	public void setProduct_feature(String product_feature) {
		this.product_feature = product_feature;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getSubscriptionAmount() {
		return SubscriptionAmount;
	}
	public void setSubscriptionAmount(int subscriptionAmount) {
		SubscriptionAmount = subscriptionAmount;
	}
	public int getContractPeriod() {
		return ContractPeriod;
	}
	public void setContractPeriod(int contractPeriod) {
		ContractPeriod = contractPeriod;
	}
	public int getNewSubscription() {
		return NewSubscription;
	}
	public void setNewSubscription(int newSubscription) {
		NewSubscription = newSubscription;
	}
	
	@Override
	public String toString() {
		return "ProductVO [product_code=" + product_code + ", product_name=" + product_name + ", product_feature="
				+ product_feature + ", interestRate=" + interestRate + ", SubscriptionAmount=" + SubscriptionAmount
				+ ", ContractPeriod=" + ContractPeriod + ", NewSubscription=" + NewSubscription + "]";
	}
	


}
