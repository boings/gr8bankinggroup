import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import layers.UI.*;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void hide()
	{
		//this.setVisible(false);
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		String a = new File(".").getAbsolutePath();
		System.out.println(a);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("GR8 Banking Login");
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		label.setBounds(302, 41, 378, 89);
		contentPane.add(label);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(397, 383, 274, 38);
		contentPane.add(passwordField);
		
		Label label_1 = new Label("password");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(229, 383, 116, 33);
		contentPane.add(label_1);
		
		Label label_1_1 = new Label("User ID");
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1_1.setBounds(229, 303, 116, 33);
		contentPane.add(label_1_1);
		
		textField = new JTextField();
		textField.setBounds(397, 303, 274, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Login!");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				verifyLogin(textField.getText(), passwordField.getText());
			}
		

			private void verifyLogin(String text, String text2) {
				boolean swapped = false;
			    try {
					ClassLoader classLoader = getClass().getClassLoader();
					File file = new File(classLoader.getSystemResource("personel.txt").getFile());
			    	Scanner sc = new Scanner(file);//this is exact address of my test login info. i was having trouble with relative locations

			        while (sc.hasNextLine()) {
			        	
			        	StringTokenizer st = new StringTokenizer(sc.next(),",");  
			            while (st.hasMoreTokens()) {  
			            	String Username = st.nextToken();
			            	String Password = st.nextToken();
			            	String role = st.nextToken();
			            	
			                //System.out.println(Username);
			                //System.out.println(Password);
			                
			                if (Username.equals(text) && Password.equals(text2))
			                		{
			                	
			                	loadData();
			                	
			                		swapped = true;
			                			if(role.equals("manager"))
			                			{
			                				System.out.println("Swapping to Manager as " + Username);
			                				
			                				
			                				try {
			                					ManagerUI Mframe = new ManagerUI();
			                					
			                					Mframe.setVisible(true);
			                				} catch (Exception e) {
			                					e.printStackTrace();
			                					break;
			                				}
			                				
			                				break;
			                			}
			                			
			                			if(role.equals("customer"))
			                			{
			                				System.out.println("Swapping to customer as " + Username);
			                				
			                				try {
			                					CustomerUI Cframe = new CustomerUI();
			                					hide();
			                					Cframe.setVisible(true);
			                					
			                				} catch (Exception e) {
			                					e.printStackTrace();
			                					break;
			                				}
			                				
			                				break;
			                			}
			                			
			                			if(role.equals("loan"))
			                			{
			                				System.out.println("Swapping to loan as " + Username);
			                				
			                				
			                				try {
			                					LoanUI Lframe = new LoanUI();
			                					hide();
			                					Lframe.setVisible(true);
			                				} catch (Exception e) {
			                					e.printStackTrace();
			                					break;
			                				}
			                				
			                				break;
			                			}
			                			
			                			if(role.equals("credit"))
			                			{
			                				System.out.println("Swapping to credit as " + Username);

			                				try {
			                					CreditUI CRframe = new CreditUI();
			                					hide();
			                					CRframe.setVisible(true);
			                				} catch (Exception e) {
			                					e.printStackTrace();
			                					break;
			                				}
			                				
			                				break;
			                			}
			                			
			                		}
			            }  
			            
			            if (swapped == true)
			            {
			            	break;
			            }     	
			        }
			        sc.close();
			        if (swapped == false)
			        {
			        	System.out.println("error on login");
			        }
   
			    } 
			    catch (FileNotFoundException e) {
			        e.printStackTrace();
			    }    
			}


			private void loadData() {
				// TODO Auto-generated method stub
				
			}
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 20));
		button.setBounds(397, 479, 131, 33);
		contentPane.add(button);
	
	}
	
}
