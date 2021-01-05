package layers.BO;
import java.io.*;

import java.util.*;

import layers.domain.Loan;

public class LoanBO {

	public LoanBO() {
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<Loan> loans = new ArrayList<Loan>();
	
	public void load() //this is only needed until DB
	{
		System.out.println("loading loans");
		
		try 
		{
			Scanner sc = new Scanner(new File("C:\\Users\\joshu\\Desktop\\IDEs\\source code\\Java\\GR8 Banking\\src\\LoanDB.txt"));
			
			while (sc.hasNextLine()) 
			{
	        	
	        	StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
	            

	        	Integer loanID = Integer.parseInt(st.nextToken());
	        	Integer issuerID = Integer.parseInt(st.nextToken());
	        	Integer customerID = Integer.parseInt(st.nextToken());
	        	Double Amount = Double.parseDouble(st.nextToken());
	        	Double Interest = Double.parseDouble(st.nextToken());
	        	String dateLoanReceived = st.nextToken();
	        	String Status = st.nextToken();
	            	
	            loans.add(new Loan(loanID, issuerID, customerID, Amount, Interest, dateLoanReceived, Status));	
	            
			}
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}
}
