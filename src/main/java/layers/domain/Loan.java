import java.util.*;

public class Loan {

	public Loan(Integer loanID,	Integer issuerID, Integer customerID, Double Amount, Double Interest, Date dateLoanReceived, String Status)
	{
		this.loanID = loanID;
		this.issuerID = issuerID;
		this.customerID = customerID;
		this.Amount = Amount;
		this.Interest = Interest;
		this.dateLoanReceived = dateLoanReceived;
		this.Status = Status;
	}

	private Integer loanID;
	private Integer issuerID;
	private Integer customerID;
	private Double Amount;
	private Double Interest;
	private Date dateLoanReceived;
	private String Status;
	
	
}
