package layers.domain;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
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

	@Id
	private Integer userID;
	@Column
	private String billingAddress;
	@Column
	private String Profession;
	@Column
	private String Classification;
	@Temporal(TemporalType.DATE)
	@Column
	private Date DOB;
	@Column
	private Character sex;
	@Column(name="region")
	private String residentialRegion;
}
