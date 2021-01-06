package layers.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
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

	@Id
	@Column(name="id")
	private Integer loanID;
	@Column
	private Integer issuerID;
	@Column
	private Integer customerID;
	@Column
	private Double Amount;
	@Column
	private Double Interest;
	@Temporal(TemporalType.DATE)
	@Column(name="loan_received")
	private Date dateLoanReceived;
	@Column
	private String Status;
	
	
}
