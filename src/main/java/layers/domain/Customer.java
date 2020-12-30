import java.util.*;

public class Customer {

	public Customer(Integer userID, String billingAddress, String Profession, String Classification, Date DOB, Character sex, String residentialRegion) {
		this.userID = userID;
		this.billingAddress = billingAddress;
		this.Profession = Profession;
		this.Classification = Classification;
		this.DOB = DOB;
		this.sex = sex;
		this.residentialRegion = residentialRegion;
	}

	private Integer userID;
	private String billingAddress;
	private String Profession;
	private String Classification;
	private Date DOB;
	private Character sex;
	private String residentialRegion;
}
