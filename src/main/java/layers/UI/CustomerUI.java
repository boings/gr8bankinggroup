package layers.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

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

import javax.swing.JEditorPane;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class CustomerUI extends JFrame {
	
	public void setinputType(String in)
	{
		this.inputType = in;
	}

	private JPanel contentPane;
	private JPanel timeInput;
	private JPanel IDInput;
	private JPanel STInput;
	private Integer Timeoutput = 1;	
	private Integer CID = 1;
	private Integer type = 1;
	private String inputType = "";
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public CustomerUI(String name, Integer userID) {
		
		final Integer UID = userID;
		final String usersName = name;
		final JFrame thisFrame = this;	
		final JDialog DTframe = new JDialog(thisFrame, "Input Box", true);
		final JDialog IDframe = new JDialog(thisFrame, "Input Box", true);
		final JDialog STframe = new JDialog(thisFrame, "Input Box", true);
		
		final CustomerBO CBO = new CustomerBO();
		final LoanBO LBO = new LoanBO();
		final CreditCardBO CCBO = new CreditCardBO();
		final PurchaseBO PBO = new PurchaseBO();
		final AccountBO ABO = new AccountBO();
		
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
						
				CID = Integer.parseInt(textField.getText());
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
				
		//Start Time input--------------------------------
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("In a Week?");
		rdbtnNewRadioButton.setBounds(86, 96, 109, 23);
		timeInput.add(rdbtnNewRadioButton);
			
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("In a Month?");
		rdbtnNewRadioButton_1.setBounds(86, 122, 109, 23);
		timeInput.add(rdbtnNewRadioButton_1);
				
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("In a Year?");
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
		
		JButton btnNewButton = new JButton("View my CC status");
		btnNewButton.setBounds(375, 202, 165, 44);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view cc status");
				//Add view CC status function here
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + CID);
				CBO.viewCardStatus(UID, CID);
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton);
		
		Label label = new Label("Hello " + name + "!");
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 27, 964, 44);
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		contentPane.add(label);
		
		JButton btnViewLoanStatus = new JButton("View my Loan status");
		btnViewLoanStatus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view loan status");
				//Add view loan status function here
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + CID);
				LBO.viewLoanStatus(CID);
			}
		});
		btnViewLoanStatus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnViewLoanStatus.setBounds(87, 202, 165, 44);
		contentPane.add(btnViewLoanStatus);
		
		JButton btnViewMyCc = new JButton("View my CC statement");
		btnViewMyCc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view cc statement");
				//view CC statement function
				CBO.viewCCStatement(UID, CID);
				
			}
		});
		btnViewMyCc.setBounds(375, 257, 165, 44);
		contentPane.add(btnViewMyCc);
		
		JButton btnViewMyCc_1 = new JButton("View my CC patterns");
		btnViewMyCc_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view cc pattern");
				//view CC patern function
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + CID);
				CBO.viewCCPattern(UID, CID);
				
				
			}
		});
		btnViewMyCc_1.setBounds(375, 312, 165, 44);
		contentPane.add(btnViewMyCc_1);
		
		JButton btnViewMyHistory = new JButton("View my history");
		btnViewMyHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view cc history");
				//view CC history function
				setinputType("Customer");
				IDframe.getContentPane().add(IDInput);
				IDframe.pack();
				IDframe.setVisible(true);
				System.out.println("result from box was: " + CID);
				CBO.viewPaymentHistory(CID);
				
			}
		});
		btnViewMyHistory.setBounds(375, 367, 165, 44);
		contentPane.add(btnViewMyHistory);
		
		JButton btnDoIHave = new JButton("do i have an expireing card?");
		btnDoIHave.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: expireing card?");
				//view CC expireing function
				DTframe.getContentPane().add(timeInput);
				DTframe.pack();
				DTframe.setVisible(true);
				System.out.println("result from box was: " + Timeoutput);
				CBO.Expireing(UID, Timeoutput);
				
			}
		});
		btnDoIHave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDoIHave.setBounds(375, 422, 192, 44);
		contentPane.add(btnDoIHave);
		
		JButton btnNewButton_4_1 = new JButton("View my info");
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view info");
				//view personal info function
				CBO.viewMyInfo(UID);
				
			}
		});
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4_1.setBounds(657, 202, 165, 44);
		contentPane.add(btnNewButton_4_1);
	}
}
