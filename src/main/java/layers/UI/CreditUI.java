package layers.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import layers.BO.AccountBO;
import layers.BO.CreditCardBO;
import layers.BO.CustomerBO;
import layers.BO.LoanBO;
import layers.BO.PurchaseBO;

import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class CreditUI extends JFrame {
	
	public void setinputType(String in)
	{
		this.inputType = in;
	}

	
	private JPanel contentPane;
	private JPanel timeInput;
	private JPanel IDInput;
	private JPanel STInput;
	private Integer Timeoutput = 1;	
	private Integer ID = 1;
	private Integer type = 1;
	private String inputType = "";
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public CreditUI(String name, Integer userID) {
		final CustomerBO CBO = new CustomerBO();
		final LoanBO LBO = new LoanBO();
		final CreditCardBO CCBO = new CreditCardBO();
		final PurchaseBO PBO = new PurchaseBO();
		final AccountBO ABO = new AccountBO();
		
		final JFrame thisFrame = this;	
		final JDialog DTframe = new JDialog(thisFrame, "Input Box", true);
		final JDialog IDframe = new JDialog(thisFrame, "Input Box", true);
		final JDialog STframe = new JDialog(thisFrame, "Input Box", true);
		
		timeInput = new JPanel();
		IDInput = new JPanel();
		STInput = new JPanel();
		timeInput.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				System.out.println("closing box");
			}
		});
		
		//Start Time input--------------------------------
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
		
		//Start ID input--------------------------------
		Label labelID = new Label("Input the "+ inputType +" ID");
		labelID.setFont(new Font("Dialog", Font.BOLD, 22));
		labelID.setAlignment(Label.CENTER);
		labelID.setBounds(10, 10, 230, 49);
		IDInput.add(labelID);
		
		this.setSize(250, 250); 
		
		JButton btnNewButtonID = new JButton("confirm");
		btnNewButtonID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				ID = Integer.parseInt(textField.getText());
				IDframe.setVisible(false);
			}
		});
		
		btnNewButtonID.setBounds(78, 178, 89, 23);
		IDInput.add(btnNewButtonID);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(43, 93, 167, 49);
		IDInput.add(textField);
		textField.setColumns(10);
		
		//END ID input--------------------------------
		
		//Start Sort By input--------------------------------
		
		final JRadioButton TyperdbtnNewRadioButton = new JRadioButton("Profession");
		TyperdbtnNewRadioButton.setBounds(86, 96, 109, 23);
		STInput.add(TyperdbtnNewRadioButton);
		
		final JRadioButton TyperdbtnNewRadioButton_1 = new JRadioButton("Reigon");
		TyperdbtnNewRadioButton_1.setBounds(86, 122, 109, 23);
		STInput.add(TyperdbtnNewRadioButton_1);
		
		ButtonGroup Typegroup = new ButtonGroup();
		Typegroup.add(TyperdbtnNewRadioButton);
		Typegroup.add(TyperdbtnNewRadioButton_1);
		
		Label Typelabel2 = new Label("Sort By:");
		Typelabel2.setFont(new Font("Dialog", Font.BOLD, 22));
		Typelabel2.setAlignment(Label.CENTER);
		Typelabel2.setBounds(10, 10, 230, 49);
		STInput.add(Typelabel2);
		
		JButton TypebtnNewButtont = new JButton("confirm");
		TypebtnNewButtont.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (TyperdbtnNewRadioButton.isSelected()) { 
					  
					type = 1;
                } 
				
				if (TyperdbtnNewRadioButton_1.isSelected()) { 
					  
					type = 2;
                }  
				
				STframe.setVisible(false);
			}
			
		});
		TypebtnNewButtont.setBounds(78, 178, 89, 23);
		STInput.add(TypebtnNewButtont);
		
		
		//END Sort By input--------------------------------
		
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				
				CCBO.statusOfCards(ID);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CCBO.numberOfCCForCust(ID);
				
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
				DTframe.getContentPane().add(timeInput);
				DTframe.pack();
				DTframe.setVisible(true);
				System.out.println("result from box was: " + Timeoutput);
				CCBO.numberOfCCRejected(Timeoutput);
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
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CCBO.viewStatement(ID);
				
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
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CCBO.paymentHistory(ID);
				
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CCBO.Expiring(ID);
				
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
				STframe.getContentPane().add(STInput);
				STframe.pack();
				STframe.setVisible(true);
				System.out.println("result from box was: " + type);
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
				STframe.getContentPane().add(STInput);
				STframe.pack();
				STframe.setVisible(true);
				System.out.println("result from box was: " + type);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CCBO.DiscontinuedCards(ID);
				
			}
		});
		
		
		btnNewButton15.setLocation(225, 492);
		btnNewButton15.setSize(143, 44);
		btnNewButton15.setBounds(225, 437, 143, 44);
		contentPane.add(btnNewButton15);
	}
}
