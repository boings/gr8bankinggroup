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



	public Integer getCreditCardNumber() {
		return this.creditCardNumber;
	}

	public void setCreditCardNumber(Integer creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public Integer getCustomerID() {
		return this.customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

	public Integer getIssuerID() {
		return this.issuerID;
	}

	public void setIssuerID(Integer issuerID) {
		this.issuerID = issuerID;
	}

	public Double getCreditCardLimit() {
		return this.creditCardLimit;
	}

	public void setCreditCardLimit(Double creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}

	public Date getDateRequested() {
		return this.dateRequested;
	}

	public void setDateRequested(Date dateRequested) {
		this.dateRequested = dateRequested;
	}

	public Date getDateAnswered() {
		return this.dateAnswered;
	}

	public void setDateAnswered(Date dateAnswered) {
		this.dateAnswered = dateAnswered;
	}

	public Date getExpiration() {
		return this.expiration;
	}

	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatements() {
		return this.statements;
	}

	public void setStatements(String statements) {
		this.statements = statements;
	}

	public String getCreditPaymentHistory() {
		return this.creditPaymentHistory;
	}

	public void setCreditPaymentHistory(String creditPaymentHistory) {
		this.creditPaymentHistory = creditPaymentHistory;
	}

}
