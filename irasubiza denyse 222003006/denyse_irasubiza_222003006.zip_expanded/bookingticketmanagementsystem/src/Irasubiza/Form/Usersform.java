package Irasubiza.Form;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Usersform implements ActionListener{
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel username=new JLabel("username");
	JLabel password= new JLabel("password");
	JLabel fullname=new JLabel("fullname");
	JLabel email=new JLabel("email");
	JLabel phonenumber=new JLabel("phonenumber");
	JLabel address=new JLabel("address");

	
	JTextField idTextField=new JTextField();
	JTextField usernameTextField=new JTextField();
	JTextField passwordTextField=new JTextField();
	JTextField fullnameTextField=new JTextField();
	JTextField emailTextField=new JTextField();
	JTextField phonenumberTextField=new JTextField();
	JTextField addressTextField=new JTextField();

	
	JButton insertbtn=new JButton ("INSERT");	 
	JButton deletebtn=new JButton ("DELETE");
	public Usersform() {
		createwindow();
	}
	

	private void createwindow() {
		frame= new JFrame();
		frame.setTitle("Registration form");
		frame.setBounds(10,10, 400, 450);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize();
		
	}


	private void setlocationandsize() {
		id.setBounds(10, 10, 200, 30);
		username.setBounds(10,50,200,30);
		password.setBounds(10,90,200,30);
		fullname.setBounds(10,130,200,30);
		email.setBounds(10,170,200,30);
		phonenumber.setBounds(10,210,200,30);
		address.setBounds(10,250,200,30);
		idTextField.setBounds(160,10,170,30);
		usernameTextField.setBounds(160,50,170,30);
		passwordTextField.setBounds(160,90,170,30);
		fullnameTextField.setBounds(160,130,170,30);
		emailTextField.setBounds(160,170,170,30);
		phonenumberTextField.setBounds(160,210,170,30);
		addressTextField.setBounds(160,250,170,30);
		
		insertbtn.setBounds(10,350,85,30);
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== insertbtn) {
						String query="INSERT INTO users VALUES (?,?,?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setString(2,usernameTextField.getText()); 
						ps.setString(3, passwordTextField.getText());
						ps.setString(4,fullnameTextField.getText()); 
						ps.setString(5,emailTextField.getText());
						ps.setInt(6,Integer.parseInt(phonenumberTextField.getText()));
						ps.setString(7,addressTextField.getText());
						
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(insertbtn, "successfully");
						ps.close();
						con.close();
						
					}
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			
				
			}
		});
		deletebtn.setBounds(280,350,85,30);
deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== deletebtn) {
						String query="DELETE  from users where usersid=?";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.executeUpdate();
						JOptionPane.showMessageDialog(deletebtn, "successfully");
						ps.close();
						con.close();
						
					}
					
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
				
			
				
			}
		});
		addcontent();
		
	}

	private void addcontent() {
		frame.add(id);
		frame.add(username);
		frame.add(password);
		frame.add(fullname);
		frame.add(email);
		frame.add(phonenumber);
		frame.add(address);

		frame.add(idTextField);
		frame.add(usernameTextField);
		frame.add(passwordTextField);
		frame.add(fullnameTextField);
		frame.add(emailTextField);
		frame.add(phonenumberTextField);
		frame.add(addressTextField);

		frame.add(insertbtn);
		frame.add(deletebtn);
	}


	public static void main(String[] args) {
		Usersform usf= new Usersform();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
