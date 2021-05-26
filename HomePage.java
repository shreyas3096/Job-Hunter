package Fabfour;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;

public class HomePage extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 224));
		frame.setBounds(300, 175, 798, 526);
		//frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Predict Now!");
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBackground(new Color(255, 255, 224));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InputPage().setVisible(true);
				frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				dispose();
			}
		});
		btnNewButton.setBounds(230, 359, 382, 66);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Welcome to Job Hunter!");
		lblNewLabel.setForeground(new Color(139, 69, 19));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(230, 54, 331, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Let's discover the jobs that suits your profile!");
		lblNewLabel_1.setForeground(new Color(139, 69, 19));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_1.setBounds(181, 283, 466, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		JEditorPane dtrpnHereWePredict = new JEditorPane();
		dtrpnHereWePredict.setEditable(false);
		dtrpnHereWePredict.setForeground(new Color(139, 69, 19));
		dtrpnHereWePredict.setBackground(new Color(255, 255, 224));
		dtrpnHereWePredict.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		dtrpnHereWePredict.setText("We evaluate your profile with the company’s requirements and present a score, based on the scores you can then decide whether to apply or not. We need your Education , Discipline , Skillset , and Years of Experience to compute the scores. Our main motivation for developing this platform is to help candidates evaluate their profile by entering the required fields , thereby mitigating the time &effort spent on applying for jobs. Make sure you apply to jobs wisely!");
		dtrpnHereWePredict.setBounds(42, 126, 728, 145);
		frame.getContentPane().add(dtrpnHereWePredict);
	}
}