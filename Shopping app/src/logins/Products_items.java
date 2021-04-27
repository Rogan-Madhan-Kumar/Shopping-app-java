package logins;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;

public class Products_items extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Products_items frame = new Products_items();
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
	public Products_items() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 586);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Products ");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 50));
		lblNewLabel.setBounds(215, 11, 188, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnCart = new JButton("Add to cart");
		btnCart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCart.addMouseListener(new MouseAdapter() {
			public void mouseClicked (MouseEvent e) {
				Cart_items cart = new Cart_items();
				cart.setVisible(true);
				

				
			}
		});
		btnCart.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnCart.setBounds(203, 427, 200, 48);
		contentPane.add(btnCart);
		
		table = new JTable();
		table.setBounds(390, 271, -206, -79);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Diarly Milk Silk");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(63, 128, 181, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Lays Indian Magic Masala");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(63, 196, 312, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Deuce Biscuits ");
		lblNewLabel_5.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(63, 271, 253, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Kurkure");
		lblNewLabel_4.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_4.setBounds(63, 338, 134, 35);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(450, 128, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBounds(450, 196, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setBounds(450, 279, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setBounds(450, 348, 89, 23);
		contentPane.add(btnNewButton_3);
	}
}
