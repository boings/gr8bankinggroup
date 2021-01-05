package layers.BO;
import java.io.*;
import java.util.*;

import layers.domain.Purchase;

public class PurchaseBO {

	public PurchaseBO() {
		// TODO Auto-generated constructor stub
	}
	
	private ArrayList<Purchase> purchases = new ArrayList<Purchase>();
	
	public void load() //this is only needed until DB
	{
		System.out.println("loading purchases");
		
		try 
		{
			Scanner sc = new Scanner(new File("C:\\Users\\joshu\\Desktop\\IDEs\\source code\\Java\\GR8 Banking\\src\\PurchaseDB.txt"));
			
			while (sc.hasNextLine()) 
			{
	        	
	        	StringTokenizer st = new StringTokenizer(sc.nextLine(),",");  
	            
	            Integer creditCardNumber = Integer.parseInt(st.nextToken());
	            Double ammount = Double.parseDouble(st.nextToken());
	            String purchaseDate = st.nextToken();
	            String purchaseType = st.nextToken();
	            	
	            purchases.add(new Purchase(creditCardNumber, ammount, purchaseDate, purchaseType));	
	            
			}
		}
		
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}	
	}
	
	public void display() //this is only needed until DB
	{
		for(int i = 0; i < purchases.size();i++)
		{
			System.out.println(purchases.get(0));
		}
	}
}
