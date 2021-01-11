package layers.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
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

public class LoanUI extends JFrame {

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
	public LoanUI(String name, Integer userID) {
		
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
		
		JButton btnNewLoanRequests = new JButton("new loan requests");
		btnNewLoanRequests.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loan Requests");
				//function for loan requests
				DTframe.getContentPane().add(timeInput);
				DTframe.pack();
				DTframe.setVisible(true);
				System.out.println("result from box was: " + Timeoutput);
				LBO.newLoanRequests(Timeoutput);
				
			}
		});
		btnNewLoanRequests.setBounds(787, 162, 143, 44);
		contentPane.add(btnNewLoanRequests);
		
		JButton btnStatusOfLoans = new JButton("Status of loans");
		btnStatusOfLoans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Loan Status");
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				LBO.loanStatus(ID);
				
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
				STframe.getContentPane().add(STInput);
				STframe.pack();
				STframe.setVisible(true);
				System.out.println("result from box was: " + type);
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				LBO.loansRejected(ID);
				
				
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
				DTframe.getContentPane().add(timeInput);
				DTframe.pack();
				DTframe.setVisible(true);
				System.out.println("result from box was: " + Timeoutput);
				LBO.avgDecideTime(Timeoutput);
				
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
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + ID);
				CBO.CustomerLoanClassification(ID);
				
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
				STframe.getContentPane().add(STInput);
				STframe.pack();
				STframe.setVisible(true);
				System.out.println("result from box was: " + type);
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
