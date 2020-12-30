import java.util.*;

public class Purchase {

	public Purchase(Integer creditCardNumber, Double Amount, Date purchaseDate, String purchaseType) 
	{
		this.creditCardNumber = creditCardNumber;
		this.Amount = Amount;
		this.purchaseDate = purchaseDate;
		this.purchaseType = purchaseType;
	}

	private Integer creditCardNumber;
	private Double Amount;
	private Date purchaseDate;
	private String purchaseType;
	
}
