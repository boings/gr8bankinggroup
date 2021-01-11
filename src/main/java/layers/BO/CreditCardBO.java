package layers.BO;
import java.io.*;

import java.util.*;

import layers.domain.CreditCard;

public class CreditCardBO {

	public CreditCardBO() {
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<CreditCard> creditCards = new ArrayList<CreditCard>();
	
	public void load() //this is only needed until DB
	{
		System.out.println("loading credit cards");
		
		try 
		{
			Scanner sc = new Scanner(new File("C:\\Users\\joshu\\Desktop\\IDEs\\source code\\Java\\GR8 Banking\\src\\CreditCardDB.txt"));
			
			while (sc.hasNextLine()) 
			{
	        	
	        	StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
	            

	        	Integer creditCardNumber = Integer.parseInt(st.nextToken());
	        	Integer customerID = Integer.parseInt(st.nextToken());
	        	Integer issuerID = Integer.parseInt(st.nextToken());
	        	Double creditCardLimit = Double.parseDouble(st.nextToken());
	        	String dateRequested = st.nextToken();
	        	String dateAnswered = st.nextToken();
	        	String expiration = st.nextToken();
	        	String region = st.nextToken();
	        	String status = st.nextToken();
	        	String type = st.nextToken();
	        	String statements = st.nextToken();
	        	String creditPaymentHistory = st.nextToken();
	            	
	        	creditCards.add(new CreditCard(creditCardNumber, customerID, issuerID, creditCardLimit, dateRequested, dateAnswered, expiration, region, status, type, statements, creditPaymentHistory));	
	            
			}
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}

	public void numberOfCardRequests(int time) {
		// TODO Auto-generated method stub
		
	}

	public void statusOfCards(int customerID) {
		// TODO Auto-generated method stub
		
	}

	public void numberOfCCForCust(int customerID) {
		// TODO Auto-generated method stub
		
	}

	public void numberOfCCRejected(int type) {
		// TODO Auto-generated method stub
		
	}

	public void viewStatement(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void useagePatternForCustID(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void limitsForCust(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void paymentHistory(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void AvgTimeToDecide() {
		// TODO Auto-generated method stub
		
	}

	public void Expiring(int iD) {
		// TODO Auto-generated method stub
		
	}

	public void RegionalUseage(int type) {
		// TODO Auto-generated method stub
		
	}

	public void RegionalSale(int type) {
		// TODO Auto-generated method stub
		
	}

	public void DiscontinuedCards(int iD) {
		// TODO Auto-generated method stub
		
	}

}