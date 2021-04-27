package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logins.Products_items;
import logins.User_registration;
import logins.Admin_page;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;

public class Main_login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_login frame = new Main_login();
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
	public Main_login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 495);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login page");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblNewLabel.setBounds(168, 22, 261, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username ");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(129, 137, 118, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password ");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(129, 200, 118, 40);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(313, 137, 164, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(313, 200, 164, 34);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				if (textField.getText().isEmpty() || textField_1.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Correct credtantials required");
				} else if (textField.getText().equals("Admin") && textField_1.getText().equals("rogan2206")) 
				{
					JOptionPane.showMessageDialog(null , "Login sucessful");
					
					
					Admin_page admin = Admin_page();
					admin.setVisible(true);
					
				}
				else {
					String Username = textField.getText();
	                String Password = textField_1.getText();
	            try {
	            	Class.forName("com.mysql.jdbcDriver");
	            	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","Rogan2206");
	            	Statement stmt=(Statement) con.createStatement();
	            	java.sql.ResultSet rs=((java.sql.Statement) stmt).executeQuery("select from users.Username where username='"+ Username +"' and password ='"+ Password+"'");
                	while (rs.next())
                    {
                      int c = (int) rs.getFloat(1);
                      if (c == 0)
                      {
                    	  JOptionPane.showMessageDialog(null,"Incorrect credentials");
                    	  textField.setText(null);
                    	  textField_1.setText(null);
                      }
                      else
                    	  {JOptionPane.showMessageDialog(null,"Sucessfull login");
                          Products_items product= new Products_items();
                          product.setVisible(true);
                    	  }
                    }
					con.close();  
					} catch(Exception e1){ System.out.println(e1);}
				}
			}

			private Admin_page Admin_page() {
				// TODO Auto-generated method stub
				return null;
			}
		});
	            	
	
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
		btnLogin.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnLogin.setBounds(168, 273, 127, 40);
		contentPane.add(btnLogin);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(null);
				textField_1.setText(null);
			}
		});
		btnReset.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnReset.setBounds(350, 273, 127, 40);
		contentPane.add(btnReset);
		
		JButton btnRegister = new JButton("Register ");
		btnRegister.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				User_registration register= new User_registration();
				register.setVisible(true);	
			}
		});
		btnRegister.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnRegister.setBounds(168, 338, 129, 36);
		contentPane.add(btnRegister);
		
		JButton btnBack = new JButton("Back");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homepage homepage= new homepage();
				homepage.setVisible(true);	
			}
		});
		btnBack.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnBack.setBounds(350, 334, 127, 40);
		contentPane.add(btnBack);
		
		setUndecorated(true);
	}
}

	