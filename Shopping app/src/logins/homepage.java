package logins;

import java.awt.BorderLayout;
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
import java.awt.Color;
import java.awt.Cursor;

public class homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homepage frame = new homepage();
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
	public homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 613, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Shopping Application");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 50));
		lblNewLabel.setBounds(93, 11, 396, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_login main= new Main_login();
				main.setVisible(true);
			}
		});
		btnAdmin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdmin.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnAdmin.setBounds(82, 194, 155, 43);
		contentPane.add(btnAdmin);
		
		JButton btnUser = new JButton("User");
		btnUser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUser.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_login main= new Main_login();
				main.setVisible(true);
			}
		});
		btnUser.setBounds(374, 194, 147, 43);
		contentPane.add(btnUser);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
			
			}
		});
		btnExit.setBounds(519, 11, 69, 23);
		contentPane.add(btnExit);
		
		setUndecorated(true);
	}

}
