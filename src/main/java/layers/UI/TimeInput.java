package layers.UI;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Label;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TimeInput extends JPanel {

	/**
	 * Create the panel.
	 */
	public TimeInput() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
			
		setLayout(null);
		
		final JRadioButton rdbtnNewRadioButton = new JRadioButton("per Week");
		rdbtnNewRadioButton.setBounds(86, 96, 109, 23);
		add(rdbtnNewRadioButton);
		
		final JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("per Month");
		rdbtnNewRadioButton_1.setBounds(86, 122, 109, 23);
		add(rdbtnNewRadioButton_1);
		
		final JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Per year");
		rdbtnNewRadioButton_2.setBounds(86, 148, 109, 23);
		add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		Label label = new Label("Frequency");
		label.setFont(new Font("Dialog", Font.BOLD, 22));
		label.setAlignment(Label.CENTER);
		label.setBounds(10, 10, 230, 49);
		add(label);
		
		this.setSize(250, 250); 
		
		JButton btnNewButton = new JButton("confirm");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int output = 0;
				
				if (rdbtnNewRadioButton.isSelected()) { 
					  
					output = 1;
                } 
				
				if (rdbtnNewRadioButton_1.isSelected()) { 
					  
					output = 2;
                } 
				
				if (rdbtnNewRadioButton_2.isSelected()) { 
					  
					output = 3;
                } 
				
			}
		});
		
		btnNewButton.setBounds(78, 178, 89, 23);
		add(btnNewButton);
		
		

	}
}
