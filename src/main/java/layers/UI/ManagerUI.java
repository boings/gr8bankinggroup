package layers.UI;

import java.awt.BorderLayout;
import java.lang.Thread;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import layers.BO.*;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerUI extends JFrame {

	 private JPanel contentPane;
	 private JPanel timeInput;
	 private Integer Timeoutput;	
	 
	 
	 

	/**
	 * Create the frame.
	 */
	public ManagerUI(String name, Integer userID) {
		
		final CustomerBO CBO = new CustomerBO();
		final LoanBO LBO = new LoanBO();
		final CreditCardBO CCBO = new CreditCardBO();
		final PurchaseBO PBO = new PurchaseBO();
		final AccountBO ABO = new AccountBO();
		
		final JFrame thisFrame = this;	
		final JDialog DTframe = new JDialog(thisFrame, "Time input", true);
		
		timeInput = new JPanel();
		timeInput.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("closing box");
			}
		});
		timeInput.setSize(1000, 1000);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("per Week");
	 	rdbtnNewRadioButton.setBounds(86, 96, 109, 23);
		timeInput.add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("per Month");
		rdbtnNewRadioButton_1.setBounds(86, 122, 109, 23);
		timeInput.add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Per year");
		rdbtnNewRadioButton_2.setBounds(86, 148, 109, 23);
		timeInput.add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		Label label2 = new Label("Frequency");
		label2.setFont(new Font("Dialog", Font.BOLD, 22));
		label2.setAlignment(Label.CENTER);
		label2.setBounds(10, 10, 230, 49);
		timeInput.add(label2);
		
		JButton btnNewButtont = new JButton("confirm");
		btnNewButtont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (rdbtnNewRadioButton.isSelected()) { 
					  
					Timeoutput = 1;
                } 
				
				if (rdbtnNewRadioButton_1.isSelected()) { 
					  
					Timeoutput = 2;
                } 
				
				if (rdbtnNewRadioButton_2.isSelected()) { 
					  
					Timeoutput = 3;
                } 
				
				DTframe.setVisible(false);
			}
			
		});
		btnNewButtont.setBounds(78, 178, 89, 23);
		timeInput.add(btnNewButtont);
		
		
		//end of time input--------------------
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label_1 = new Label("What would you like to do today?");
		label_1.setBounds(20, 77, 964, 44);
		label_1.setFont(new Font("Dialog", Font.BOLD, 22));
		label_1.setAlignment(Label.CENTER);
		contentPane.add(label_1);
		
		Label label = new Label("Hello " + name + "!");
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 27, 964, 44);
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("new CC requests");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: number of CC requests");
				
				//function for number of CC requests
				
				DTframe.getContentPane().add(timeInput);
				DTframe.pack();
				DTframe.setVisible(true);
				System.out.println("result from box was: " + Timeoutput);
				
				CCBO.numberOfCardRequests(Timeoutput);
			
			}
		});
		btnNewButton.setBounds(44, 162, 143, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("view card status of cust");
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: Card status of Customers");
				//function for status of customers
				int customerID = 0;
				CCBO.statusOfCards(customerID);
			}
		});
		btnNewButton2.setBounds(44, 217, 143, 44);
		contentPane.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("no of aproved cc");
		btnNewButton3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: number of CC aproved");
				//function for number of CC aproved
				int customerID = 0;
				CCBO.numberOfCCForCust(customerID);
				
			}
		});
		btnNewButton3.setBounds(44, 272, 143, 44);
		contentPane.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("no of rejected");
		btnNewButton4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: number of CC rejected");
				//function for number of CC rejected
				int type = 0;
				CCBO.numberOfCCRejected(type);
			}
		});
		btnNewButton4.setBounds(44, 327, 143, 44);
		contentPane.add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("view ststement");
		btnNewButton5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: View statments");
				//function for statements of customers
				int ID = 0;
				int type = 0;
				CCBO.viewStatement(type, ID);
				
			}
		});
		btnNewButton5.setBounds(44, 382, 143, 44);
		contentPane.add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("usage pattern");
		btnNewButton6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: useage pattern of Customers");
				//function for patterns of customers
				int ID = 0;
				CCBO.useagePatternForCustID(ID);
				
			}
		});
		btnNewButton6.setBounds(44, 437, 143, 44);
		contentPane.add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("cc limits");
		btnNewButton7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Limits of Customers");
				//function for limits of customers
				int ID = 0;
				CCBO.limitsForCust(ID);
				
			}
		});
		btnNewButton7.setBounds(44, 492, 143, 44);
		contentPane.add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("cc history");
		btnNewButton8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: History of Customers");
				//function for history of customers
				int type = 0;
				int ID = 0;
				CCBO.paymentHistory(ID, type);
				
			}
		});
		btnNewButton8.setBounds(44, 547, 143, 44);
		contentPane.add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("avg time to aprove");
		btnNewButton9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Time to approve");
				//function for time to aprove for customers
				CCBO.AvgTimeToDecide();
				
			}
		});
		btnNewButton9.setBounds(44, 604, 143, 44);
		contentPane.add(btnNewButton9);
		
		JButton btnNewButton10 = new JButton("customer classification");
		btnNewButton10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Classification of Customers");
				//function for class of customers
				int ID = 0;
				CBO.CustomerCCClasification(ID);
				
			}
		});
		btnNewButton10.setBounds(225, 162, 143, 44);
		contentPane.add(btnNewButton10);
		
		JButton btnNewButton11 = new JButton("cc expireing");
		btnNewButton11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Expiring?");
				//function for expiring?
				int time = 0;
				int ID = 0;
				CCBO.Expiring(ID, time);
				
			}
		});
		btnNewButton11.setBounds(225, 217, 143, 44);
		contentPane.add(btnNewButton11);
		
		JButton btnNewButton12 = new JButton("reigonal use");
		btnNewButton12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Regional/profession use");
				//function for regional use for customers
				int type = 0;
				CCBO.RegionalUseage(type);
				
			}
		});
		
		btnNewButton12.setBounds(225, 272, 143, 44);
		contentPane.add(btnNewButton12);
		
		JButton btnNewButton13 = new JButton("reigonal sale");
		btnNewButton13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Regional/profession sale of cards");
				//function for sale of cards
				int type = 0;
				CCBO.RegionalSale(type);
				
				
			}
		});
		btnNewButton13.setBounds(225, 327, 143, 44);
		contentPane.add(btnNewButton13);
		
		JButton btnNewButton14 = new JButton("customer demo");
		btnNewButton14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Customer Demographics ");
				//function for customers demo
				CBO.CustomerCCDemographics();
				
			}
		});
		btnNewButton14.setBounds(225, 382, 143, 44);
		contentPane.add(btnNewButton14);
		
		JButton btnNewButton15 = new JButton("discontinues");
		btnNewButton15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Discontinues");
				//function for Discontinues
				int ID = 0;
				CCBO.DiscontinuedCards(ID);
				
			}
		});
		
		
		btnNewButton15.setLocation(225, 492);
		btnNewButton15.setSize(143, 44);
		btnNewButton15.setBounds(225, 437, 143, 44);
		contentPane.add(btnNewButton15);
		
		JButton btnNewLoanRequests = new JButton("new loan requests");
		btnNewLoanRequests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loan Requests");
				//function for loan requests
				int time = 0;
				LBO.newLoanRequests(time);
				
			}
		});
		btnNewLoanRequests.setBounds(787, 162, 143, 44);
		contentPane.add(btnNewLoanRequests);
		
		JButton btnStatusOfLoans = new JButton("Status of loans");
		btnStatusOfLoans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loan Status");
				int type = 0;
				int ID = 0;
				LBO.loanStatus(type, ID);
				
			}
		});
		btnStatusOfLoans.setBounds(787, 217, 143, 44);
		contentPane.add(btnStatusOfLoans);
		
		JButton btnNoOfLoans = new JButton("no of loans by profession/regon");
		btnNoOfLoans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loan By Profession");
				//function for loan by profession
				int type = 0;
				LBO.numberOfLoans(type);
				
			}
		});
		btnNoOfLoans.setBounds(787, 272, 143, 44);
		contentPane.add(btnNoOfLoans);
		
		JButton btnNoOfLoans2 = new JButton("no of loans rejected");
		btnNoOfLoans2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loans Rejected");
				//function for loan rejected
				int type = 0;
				int ID = 0;
				LBO.loansRejected(type, ID);
				
				
			}
		});
		btnNoOfLoans2.setBounds(787, 327, 143, 44);
		contentPane.add(btnNoOfLoans2);
		
		JButton btnNoOfLoans3 = new JButton("Avg time to decide");
		btnNoOfLoans3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Avg time to decide");
				//function for descition time
				int time = 0;
				LBO.avgDecideTime(time);
				
			}
		});
		btnNoOfLoans3.setBounds(787, 382, 143, 44);
		contentPane.add(btnNoOfLoans3);
		
		JButton btnNoOfLoans4 = new JButton("customer classification");
		btnNoOfLoans4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: customer classification");
				//function for customer classification
				int ID = 0;
				CBO.CustomerLoanClassification();
				
			}
		});
		btnNoOfLoans4.setBounds(787, 437, 143, 44);
		contentPane.add(btnNoOfLoans4);
		
		JButton btnNoOfLoans5 = new JButton("loan summary by reigon");
		btnNoOfLoans5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: loan summary by reigon/profession");
				//function for loan summary by reigon
				int type = 0;
				LBO.summary(type);
				
			}
		});
		btnNoOfLoans5.setBounds(787, 492, 143, 44);
		contentPane.add(btnNoOfLoans5);
		
		JButton btnNoOfLoans6 = new JButton("customer demo");
		btnNoOfLoans6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Customer demo");
				//function for loan summary by customer demo
				CBO.loanCustomerDemographics();
			}
		});
		btnNoOfLoans6.setBounds(787, 547, 143, 44);
		contentPane.add(btnNoOfLoans6);
		
		JButton btnDefaults = new JButton("defaults");
		btnDefaults.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Defaults");
				//function for loan summary by defaults
				LBO.defaults();
				
			}
		});
		btnDefaults.setBounds(787, 604, 143, 44);
		contentPane.add(btnDefaults);
		
		
		
		
	}
	
}
