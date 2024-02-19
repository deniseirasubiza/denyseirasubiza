package Denyse;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class paymentform implements ActionListener {
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel bookingid=new JLabel("bookingid");
	JLabel paymentdateandtime= new JLabel("paymentdateandtime");
	JLabel paymentamount=new JLabel("paymentamount");
	JLabel paymentmethod=new JLabel("paymentmethod");
	JLabel transactionstatus=new JLabel("transactionstatus");

	
	JTextField idTextField=new JTextField();
	JTextField bookingidTextField=new JTextField();
	JTextField paymentdateandtimeTextField=new JTextField();
	JTextField paymentamountTextField=new JTextField();
	JTextField paymentmethodTextField=new JTextField();
	JTextField transactionstatusTextField=new JTextField();
	
	
	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public paymentform() {
		createwindow11();
	}
	private void createwindow11() {
		frame= new JFrame();
		frame.setTitle("payment form");
		frame.setBounds(10,10, 400, 380);
		frame.getContentPane().setBackground(Color.blue);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize11();
		
	}
	private void setlocationandsize11() {
		id.setBounds(10, 10, 200, 30);
	bookingid.setBounds(10,50,200,30);
		paymentdateandtime.setBounds(10,90,200,30);
		paymentamount.setBounds(10,130,200,30);
		paymentmethod.setBounds(10,170,200,30);
		transactionstatus.setBounds(10,210,200,30);
		
		
		idTextField.setBounds(160,10,170,30);
		bookingidTextField.setBounds(160,50,170,30);
		paymentdateandtimeTextField.setBounds(160,90,170,30);
		paymentamountTextField.setBounds(160,130,170,30);
		paymentmethodTextField.setBounds(160,170,170,30);
		transactionstatusTextField.setBounds(160,210,170,30);
		
		
		insertbtn.setBounds(10,270,85,30);
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== insertbtn) {
						String query="INSERT INTO payment VALUES (?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setInt(2,Integer.parseInt(bookingidTextField.getText()));
						ps.setString(3,paymentdateandtimeTextField.getText());
						ps.setString(4,paymentamountTextField.getText()); 
						ps.setString(5,paymentmethodTextField.getText());
						ps.setString(6,(transactionstatusTextField.getText()));
						
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
		readbtn.setBounds(100,270,85,30);
		updatebtn.setBounds(190,270,85,30);
		deletebtn.setBounds(280,270,85,30);
	deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== deletebtn) {
						String query="DELETE  from payment where paymentid=?";
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
		addcontent11();
		
	}
	private void addcontent11() {
		frame.add(id);
	frame.add(bookingid);
		frame.add(paymentdateandtime);
		frame.add(paymentamount);
		frame.add(paymentmethod);
		frame.add(transactionstatus);
		frame.add(idTextField);
		frame.add(bookingidTextField);
		frame.add(paymentdateandtimeTextField);
		frame.add(paymentamountTextField);
		frame.add(paymentmethodTextField);
		frame.add(transactionstatusTextField);
	

		frame.add(insertbtn);
		frame.add(readbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
	}
	
	public static void main(String[] args) {
		paymentform pf=new paymentform();
	}
	

	private void addcontent1() {
		// TODO Auto-generated method stub
		
	}
	private void setlocationandsize1() {
		// TODO Auto-generated method stub
		
	}
	private void createwindow1() {
		// TODO Auto-generated method stub
		 
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
