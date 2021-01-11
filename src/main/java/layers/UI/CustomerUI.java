package layers.UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import layers.BO.AccountBO;
import layers.BO.CreditCardBO;
import layers.BO.CustomerBO;
import layers.BO.LoanBO;
import layers.BO.PurchaseBO;

import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class CustomerUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public CustomerUI(String name, Integer userID) {
		
		final Integer UID = userID;
		final String usersName = name;
		
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
		
		JButton btnNewButton = new JButton("View my CC status");
		btnNewButton.setBounds(375, 202, 165, 44);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: view cc status");
				//Add view CC status function here
				int ID = 0;
				CBO.viewCardStatus(ID);
				
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
				int id = 0;
				LBO.viewLoanStatus(id);
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
				CBO.viewCCStatement(UID);
				
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
				CBO.viewCCPattern(UID);
				
				
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
				CBO.viewPaymentHistory(UID);
				
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
				int time = 0;
				CBO.Expireing(UID, time);
				
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
