package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

public class Cart_items extends JFrame {

	private JPanel contentPane;
	private JTextField txtRs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cart_items frame = new Cart_items();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cart_items() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 363);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cart items ");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 50));
		lblNewLabel.setBounds(162, 22, 208, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Items Selected");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(43, 84, 186, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Diary Milk Silk");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(43, 133, 162, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Deuce Biscuits");
		lblNewLabel_3.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(43, 196, 141, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Total Price");
		lblNewLabel_4.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(235, 271, 111, 25);
		contentPane.add(lblNewLabel_4);
		
		txtRs = new JTextField();
		txtRs.setFont(new Font("Perpetua", Font.PLAIN, 20));
		txtRs.setText("        Rs 130");
		txtRs.setBounds(379, 273, 63, 20);
		contentPane.add(txtRs);
		txtRs.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(385, 84, 71, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("  Rs 80");
		lblNewLabel_5.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(379, 138, 63, 25);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel(" Rs 60 ");
		lblNewLabel_6.setFont(new Font("Perpetua", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(381, 198, 61, 20);
		contentPane.add(lblNewLabel_6);
	}
}
