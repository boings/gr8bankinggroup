package layers.UI;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class LoanUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public LoanUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Label label = new Label("loan");
		label.setBounds(87, 81, 62, 22);
		contentPane.add(label);
	}

}
