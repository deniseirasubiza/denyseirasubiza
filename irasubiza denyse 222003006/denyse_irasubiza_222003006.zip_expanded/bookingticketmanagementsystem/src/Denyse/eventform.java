package Denyse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Irasubiza.Form.Usersform;
import revisionform.Loginform;

public class eventform implements ActionListener{
	
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel eventname=new JLabel("eventname");
	JLabel eventdate= new JLabel("eventdate");
	JLabel eventtime=new JLabel("eventtime");
	JLabel eventlocation=new JLabel("eventlocation");
	JLabel eventdescription=new JLabel("eventdescription");
	JLabel eventcapacity=new JLabel("eventcapacity");
	JLabel ticketprice=new JLabel("ticketprice");
	
	JTextField idTextField=new JTextField();
	JTextField eventnameTextField=new JTextField();
	JTextField eventdateTextField=new JTextField();
	JTextField eventtimeTextField=new JTextField();
	JTextField eventlocationTextField=new JTextField();
	JTextField eventdescriptionTextField=new JTextField();
	JTextField eventcapacityTextField=new JTextField();
	JTextField ticketpriceTextField=new JTextField();

	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public eventform() {
		createwindow();
	}
	

	private void createwindow() {
		frame= new JFrame();
		frame.setTitle("event form");
		frame.setBounds(10,10, 400, 450);
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize1();
		
	}
	private void setlocationandsize1() {
		id.setBounds(10, 10, 200, 30);
		eventname.setBounds(10,50,200,30);
		eventdate.setBounds(10,90,200,30);
		eventtime.setBounds(10,130,200,30);
		eventlocation.setBounds(10,170,200,30);
		eventdescription.setBounds(10,210,200,30);
		eventcapacity.setBounds(10,250,200,30);
		ticketprice.setBounds(10,290,200,30);
		idTextField.setBounds(160,10,170,30);
		eventnameTextField.setBounds(160,50,170,30);
		eventdateTextField.setBounds(160,90,170,30);
		eventtimeTextField.setBounds(160,130,170,30);
		eventlocationTextField.setBounds(160,170,170,30);
		eventdescriptionTextField.setBounds(160,210,170,30);
		eventcapacityTextField.setBounds(160,250,170,30);
		ticketpriceTextField.setBounds(160,290,170,30);
		
		insertbtn.setBounds(10,350,85,30);
		
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== insertbtn) {
						String query="INSERT INTO event VALUES (?,?,?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setString(2,eventnameTextField.getText());
						ps.setString(3,eventdateTextField.getText());
						ps.setInt(4,Integer.parseInt(eventtimeTextField.getText())); 
						ps.setString(5,eventlocationTextField.getText());
						ps.setString(6,eventdescriptionTextField.getText());
						ps.setString(7,eventcapacityTextField.getText());
						ps.setInt(8,Integer.parseInt(ticketpriceTextField.getText()));
						
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
		readbtn.setBounds(100,350,85,30);
		updatebtn.setBounds(190,350,85,30);
updatebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== updatebtn) {
						String query="UPDATE event SET  eventname=?,eventdate=?,eventtime=?,eventlocation=?,eventdescription=?,eventcapacity=?,eventcapacity=?,ticketprice=? WHERE eventid=?";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setString(2,eventnameTextField.getText());
						ps.setString(3,eventdateTextField.getText());
						ps.setInt(4,Integer.parseInt(eventtimeTextField.getText())); 
						ps.setString(5,eventlocationTextField.getText());
						ps.setString(6,eventdescriptionTextField.getText());
						ps.setString(7,eventcapacityTextField.getText());
						ps.setInt(8,Integer.parseInt(ticketpriceTextField.getText()));
						
						ps.executeUpdate();
						JOptionPane.showMessageDialog(updatebtn, "successfully");
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
						String query="DELETE  from event where eventid=?";
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
		frame.add(eventname);
		frame.add(eventdate);
		frame.add(eventtime);
		frame.add(eventlocation);
		frame.add(eventdescription);
		frame.add(eventcapacity);
		frame.add(ticketprice);
		frame.add(idTextField);
		frame.add(eventnameTextField);
		frame.add(eventdateTextField);
		frame.add(eventtimeTextField);
		frame.add(eventlocationTextField);
		frame.add(eventdescriptionTextField);
		frame.add(eventcapacityTextField);
		frame.add(ticketpriceTextField);
		

		frame.add(insertbtn);
		frame.add(readbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
	}

	public static void main(String[] args) {
		eventform evform=new eventform(); 
	}
		
	
	private void addcontent() {
		
		
	}


	private void setlocationandsize() {
	
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	


}
