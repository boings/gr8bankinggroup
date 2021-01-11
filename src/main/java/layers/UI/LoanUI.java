package layers.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import layers.BO.AccountBO;
import layers.BO.CreditCardBO;
import layers.BO.CustomerBO;
import layers.BO.LoanBO;
import layers.BO.PurchaseBO;

public class LoanUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public LoanUI(String name, Integer userID) {
		
		final CustomerBO CBO = new CustomerBO();
		final LoanBO LBO = new LoanBO();
		final CreditCardBO CCBO = new CreditCardBO();
		final PurchaseBO PBO = new PurchaseBO();
		final AccountBO ABO = new AccountBO();
		
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
