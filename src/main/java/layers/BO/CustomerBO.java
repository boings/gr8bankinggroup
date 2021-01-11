package layers.BO;
import java.io.*;

import java.util.*;

import layers.domain.Customer;

public class CustomerBO {

	public CustomerBO() {
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void load() //this is only needed until DB
	{
		System.out.println("loading customers");
		
		try 
		{
			Scanner sc = new Scanner(new File("C:\\Users\\joshu\\Desktop\\IDEs\\source code\\Java\\GR8 Banking\\src\\CustomerDB.txt"));
			
			while (sc.hasNextLine()) 
			{
	        	
	        	StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
	            
	        	Integer userID = Integer.parseInt(st.nextToken());;
	        	String billingAddress = st.nextToken();
	        	String Profession = st.nextToken();
	        	String Classification = st.nextToken();
	        	String DOB = st.nextToken();
	        	Character sex = st.nextToken().charAt(0);
	        	String residentialRegion = st.nextToken();
	            	
	            customers.add(new Customer(userID, billingAddress, Profession, Classification, DOB, sex, residentialRegion));	
	            
			}
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}

	public void loanCustomerDemographics() {
		// TODO Auto-generated method stub
		
	}

	public void CustomerCCClasification(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void CustomerCCDemographics() {
		// TODO Auto-generated method stub
		
	}

	public void CustomerLoanClassification() {
		// TODO Auto-generated method stub
		
	}

	public void viewCardStatus(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void viewCCStatement(Integer uID) {
		// TODO Auto-generated method stub
		
	}

	public void viewCCPattern(Integer uID) {
		// TODO Auto-generated method stub
		
	}

	public void viewPaymentHistory(Integer uID) {
		// TODO Auto-generated method stub
		
	}

	public void Expireing(Integer uID, int time) {
		// TODO Auto-generated method stub
		
	}

	public void viewMyInfo(Integer uID) {
		// TODO Auto-generated method stub
		
	}
}
