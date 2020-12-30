import java.util.*;

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
	
	private Integer creditCardNumber;
	private Integer customerID;
	private Integer issuerID;
	private Double creditCardLimit;
	private Date dateRequested;
	private Date dateAnswered;
	private Date expiration;
	private String region;
	private String status;
	private String type;
	private String statements;
	private String creditPaymentHistory;

}
