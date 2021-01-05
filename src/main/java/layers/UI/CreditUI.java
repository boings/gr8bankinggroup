package layers.UI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class CreditUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public CreditUI(String name, Integer userID) {
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
				
			}
		});
		btnNewButton.setBounds(44, 162, 143, 44);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("view status of cust");
		btnNewButton2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Executing function: Status of Customers");
				//function for ststus of customers
				
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
				
				
			}
		});
		btnNewButton11.setBounds(225, 217, 143, 44);
		contentPane.add(btnNewButton11);
		
		JButton btnNewButton12 = new JButton("reigonal use");
		btnNewButton12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Regional use");
				//function for regional use for customers
				
				
			}
		});
		btnNewButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton12.setBounds(225, 272, 143, 44);
		contentPane.add(btnNewButton12);
		
		JButton btnNewButton13 = new JButton("reigonal sale");
		btnNewButton13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				System.out.println("Executing function: Regional sale of cards");
				//function for sale of cards
				
				
				
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
				
				
			}
		});
		btnNewButton15.setLocation(225, 492);
		btnNewButton15.setSize(143, 44);
		btnNewButton15.setBounds(225, 437, 143, 44);
		contentPane.add(btnNewButton15);
	}
}
