package layers.domain;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Purchase {

	public Purchase(Integer creditCardNumber, Double Amount, Date purchaseDate, String purchaseType) 
	{
		this.creditCardNumber = creditCardNumber;
		this.Amount = Amount;
		this.purchaseDate = purchaseDate;
		this.purchaseType = purchaseType;
	}

	@Id
	private Integer creditCardNumber;
	@Column
	private Double Amount;
	@Temporal(TemporalType.DATE)
	@Column(name="date")
	private Date purchaseDate;
	@Column(name="type")
	private String purchaseType;
	
}
