package layers.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CreditCard {

	public CreditCard(Integer creditCardNumber, Integer customerID,	Integer issuerID, Double creditCardLimit, Date dateRequested, Date dateAnswered, Date expiration, 
					 String region, String status, String type, String statements, String creditPaymentHistory) 
	{
		this.creditCardNumber = creditCardNumber;
		this.customerID = customerID;
		this.issuerID = issuerID;
		this.creditCardLimit = creditCardLimit;
		this.dateRequested = dateRequested;
		this.dateAnswered = dateAnswered;
		this.expiration = expiration;
		this.region = region;
		this.status = status;
		this.type = type;
		this.statements = statements;
		this.creditPaymentHistory = creditPaymentHistory;
	}
	
	@Id
	@Column(name="CCNumber")
	private Integer creditCardNumber;
	@Column
	private Integer customerID;
	@Column
	private Integer issuerID;
	@Column(name="limit")
	private Double creditCardLimit;
	@Column
	private Date dateRequested;
	@Column(name="date_verdict")
	private Date dateAnswered;
	@Column(name="date_expiration")
	private Date expiration;
	@Column
	private String region;
	@Column
	private String status;
	@Column
	private String type;
	@Column
	private String statements;
	@Column(name="payment_history")
	private String creditPaymentHistory;

}
