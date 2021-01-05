package layers.BO;

import java.io.*;
import java.util.*;

import layers.domain.Account;

 public class AccountBO {

	public AccountBO() {
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public void load() //this is only needed until DB
	{
		System.out.println("loading Accounts");
		
		try 
		{
			Scanner sc = new Scanner(new File("C:\\Users\\joshu\\Desktop\\IDEs\\source code\\Java\\GR8 Banking\\src\\AccountDB.txt"));
			
			while (sc.hasNextLine()) 
			{
	        	
	        	StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
	            
	        	Integer accountID = Integer.parseInt(st.nextToken());
	        	Integer ownerID = Integer.parseInt(st.nextToken());
	        	Double balance = Double.parseDouble(st.nextToken());
	        	Double interestRate = Double.parseDouble(st.nextToken());
	        	String type = st.nextToken();
	            	
	        	accounts.add(new Account(accountID, ownerID, balance, interestRate, type));	
	            
			}
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}
}