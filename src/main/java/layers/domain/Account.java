package layers.domain;

import javax.persistence.Column;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Account {

	public Account(Integer accountID, Integer ownerID, Double balance, Double interestRate, String type) {
		
		this.accountID = accountID;
		this.ownerID = ownerID;
		this.balance = balance;
		this.interestRate = interestRate;
		this.type = type;
		
	}

	@Id
	private Integer accountID;
	@Column(name="owner_id")
	private Integer ownerID;
	@Column
	private Double balance;
	@Column(name="interest_rate")
	private Double interestRate;
	@Column
	private String type;
	
}
