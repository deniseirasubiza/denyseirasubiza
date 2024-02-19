package Denyse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Denyse.notification;
import Irasubiza.Form.Usersform;
import revisionform.Loginform;

public class notificationform implements ActionListener{
	
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel userid=new JLabel("userid");
	JLabel notificationtype= new JLabel("notificationtype");
	JLabel notificationmessage=new JLabel("notificationmessage");
	JLabel notificationdateandtime=new JLabel("notificationdateandtime");
	JLabel notificationstatus=new JLabel("notificationstatus");
	
	JTextField idTextField=new JTextField();
	JTextField useridTextField=new JTextField();
	JTextField notificationtypeTextField=new JTextField();
	JTextField notificationmessageTextField=new JTextField();
	JTextField notificationdateandtimeTextField=new JTextField();
	JTextField notificationstatusTextField=new JTextField();
	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public notificationform() {
		createwindow();
	}
	

	private void createwindow() {
		frame= new JFrame();
		frame.setTitle("notification form");
		frame.setBounds(10,10, 400, 400);
		frame.getContentPane().setBackground(Color.pink);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize1();
		
	}
	private void setlocationandsize1() {
		id.setBounds(10, 10, 200, 30);
	userid.setBounds(10,50,200,30);
		notificationtype.setBounds(10,90,200,30);
		notificationmessage.setBounds(10,130,200,30);
		notificationdateandtime.setBounds(10,170,200,30);
		notificationstatus.setBounds(10,210,200,30);
		
		idTextField.setBounds(160,10,170,30);
		useridTextField.setBounds(160,50,170,30);
		notificationtypeTextField.setBounds(160,90,170,30);
		notificationmessageTextField.setBounds(160,130,170,30);
		notificationdateandtimeTextField.setBounds(160,170,170,30);
		notificationstatusTextField.setBounds(160,210,170,30);
		
		insertbtn.setBounds(10,280,85,30);
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== insertbtn) {
						String query="INSERT INTO notification VALUES (?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setInt(2,Integer.parseInt(useridTextField.getText()));
						ps.setString(3,notificationtypeTextField.getText());
						ps.setString(4,notificationmessageTextField.getText()); 
						ps.setString(5,notificationdateandtimeTextField.getText());
						ps.setString(6,notificationstatusTextField.getText());
						
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
		
		readbtn.setBounds(100,280,85,30);
		updatebtn.setBounds(190,280,85,30);
		deletebtn.setBounds(280,280,85,30);
deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== deletebtn) {
						String query="DELETE  from notification where notificationid=?";
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
		addcontent1();
		
	}
	private void addcontent1() {
		frame.add(id);
		frame.add(userid);
		frame.add(notificationtype);
		frame.add(notificationmessage);
		frame.add(notificationdateandtime);
		frame.add(notificationstatus);
		
		frame.add(idTextField);
		frame.add(useridTextField);
		frame.add(notificationtypeTextField);
		frame.add(notificationmessageTextField);
		frame.add(notificationdateandtimeTextField);
		frame.add(notificationstatusTextField);
		
		frame.add(insertbtn);
		frame.add(readbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
	}

	public static void main(String[] args) {
		notificationform nf=new notificationform(); 
	}
		
	
	private void addcontent() {
		
		
	}


	private void setlocationandsize() {
	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	


}
