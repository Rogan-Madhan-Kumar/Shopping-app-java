package logins;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class User_registration extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldDob;
	private JTextField textFieldPhone;
	private JTextField textFieldAddress;
	private JTextField textFieldPincode;
	private JTextField textFieldUsername;
	private JTextField textFieldEmailid;
	private JTextField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_registration frame = new User_registration();
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
	public User_registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 810);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Registration");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 50));
		lblNewLabel.setBounds(172, 11, 330, 78);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(196, 100, 90, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email id");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(182, 265, 90, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone number (+91)");
		lblNewLabel_3.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(78, 306, 208, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address ");
		lblNewLabel_4.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(182, 374, 90, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Pincode");
		lblNewLabel_5.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(182, 424, 95, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Username");
		lblNewLabel_7.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(163, 476, 123, 28);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Password ");
		lblNewLabel_8.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(163, 531, 123, 28);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Date of birth ");
		lblNewLabel_9.setFont(new Font("Perpetua", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(149, 154, 123, 32);
		contentPane.add(lblNewLabel_9);
	
		
		textFieldName = new JTextField();
		textFieldName.setBounds(296, 100, 268, 27);
		contentPane.add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldDob = new JTextField();
		textFieldDob.setColumns(10);
		textFieldDob.setBounds(296, 159, 268, 27);
		contentPane.add(textFieldDob);
		
		JButton btnSaveRegister = new JButton("Save & Register ");
		btnSaveRegister.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnSaveRegister.addMouseListener(new MouseAdapter()  {
			public void mouseClicked(MouseEvent e) {
				String Name = textFieldName.getText();
                String Date_of_birth = textFieldDob.getText();
                String Email_id = textFieldEmailid.getText();
                String Phone_number = textFieldPhone.getText();
                String Address= textFieldAddress.getText();
                String Username= textFieldUsername.getText();
                String Password= textFieldPassword.getText();
                
                int len = Phone_number.length();
                if (len!=10)
                {JOptionPane.showMessageDialog(btnSaveRegister,"Incorrect Number");
            	 return;}
                
                try {
                    
                	Class.forName("com.mysql.cj.jdbc.Driver");  
                	Connection con= DriverManager.getConnection ("jdbc:mysql://localhost:3306/users","root","Rogan2206"); 
                	Statement stmt=con.createStatement();
                    
                    
                        //String query = "INSERT INTO userinformation (Name, Date_of_birth , Email_id, Phone_number,Address , Username, Password) values ('" + Name +"','" + Date_of_birth + "','" + Email_id + "','" + Phone_number + "','" + Address + "','"+ Username +"','"+ Password +"')";
                    	 String query = "INSERT INTO userinformation (Name, Date_of_birth , Email_id, Phone_number,Address , Username, Password) values ('" + Name +"','" + Date_of_birth + "','" + Email_id + "','" + Phone_number + "','" + Address + "','"+ Username +"','"+ Password +"')";
                        boolean x = stmt.execute(query);
                        if (x) {
                        	JOptionPane.showMessageDialog(btnSaveRegister," Error occured.");
                        } else 
                        	JOptionPane.showMessageDialog(btnSaveRegister, " Your account is successfully created");
                        	textFieldName.getText();
            				textFieldDob.getText();
            				textFieldEmailid.getText();
            				textFieldPhone.getText();
            				textFieldAddress.getText();
            				textFieldUsername.getText();    
            				textFieldPassword.getText();
                        
                          	
                   
                    con.close();}
                 catch (Exception exception) {
                    JOptionPane.showMessageDialog(btnSaveRegister, exception); 
                }
            }
			}
        );
		
		btnSaveRegister.setBounds(100, 628, 225, 49);
		contentPane.add(btnSaveRegister);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(DISPOSE_ON_CLOSE);
			
			}
		});
		btnExit.setBounds(519, 11, 69, 23);
		contentPane.add(btnExit);
		btnExit.setFont(new Font("Perpetua", Font.PLAIN, 30));
		btnExit.setBounds(381, 628, 186, 49);
		contentPane.add(btnExit);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(296, 310, 268, 27);
		contentPane.add(textFieldPhone);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(296, 374, 268, 27);
		contentPane.add(textFieldAddress);
		
		textFieldPincode = new JTextField();
		textFieldPincode.setColumns(10);
		textFieldPincode.setBounds(296, 427, 268, 27);
		contentPane.add(textFieldPincode);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(296, 479, 268, 27);
		contentPane.add(textFieldUsername);
		
		textFieldEmailid = new JTextField();
		textFieldEmailid.setColumns(10);
		textFieldEmailid.setBounds(296, 260, 268, 27);
		contentPane.add(textFieldEmailid);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(296, 532, 268, 27);
		contentPane.add(textFieldPassword);
		
		
	}
}
