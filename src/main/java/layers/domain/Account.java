
public class Account {

	public Account(Integer accountID, Integer ownerID, Double balance, Double interestRate, String type) {
		
		this.accountID = accountID;
		this.ownerID = ownerID;
		this.balance = balance;
		this.interestRate = interestRate;
		this.type = type;
		
	}

	private Integer accountID;
	private Integer ownerID;
	private Double balance;
	private Double interestRate;
	private String type;
	
}
