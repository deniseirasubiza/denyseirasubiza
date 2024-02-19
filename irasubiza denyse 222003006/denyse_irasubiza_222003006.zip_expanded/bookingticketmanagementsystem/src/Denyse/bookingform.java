package Denyse;
import java.sql.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.OperationsException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;



public class bookingform implements ActionListener{

	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel userid=new JLabel("userid");
	JLabel eventid= new JLabel("eventid");
	JLabel bookingdateandtime=new JLabel("bookingdateandtime");
	JLabel numberofticket=new JLabel("numberofticket");
	JLabel totalprice=new JLabel("totalprice");

	
	
	JTextField idTextField=new JTextField();
	JTextField useridTextField=new JTextField();
	JTextField eventidTextField=new JTextField();
	JTextField bookingdateandtimeTextField=new JTextField();
	JTextField numberofticketTextField=new JTextField();
	JTextField totalpriceTextField=new JTextField();
	
	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public bookingform() {
		createwindow1();
	}
	
	private void createwindow1() {
		frame= new JFrame();
		frame.setTitle("booking form");
		frame.setBounds(10,10, 400, 450);
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize1();
		
	}
	
	private void setlocationandsize1() {
		id.setBounds(10, 10, 200, 30);
		userid.setBounds(10,50,200,30);
		eventid.setBounds(10,90,200,30);
		bookingdateandtime.setBounds(10,130,200,30);
		numberofticket.setBounds(10,170,200,30);
		totalprice.setBounds(10,210,200,30);
		
		idTextField.setBounds(160,10,170,30);
		useridTextField.setBounds(160,50,170,30);
		eventidTextField.setBounds(160,90,170,30);
		bookingdateandtimeTextField.setBounds(160,130,170,30);
		numberofticketTextField.setBounds(160,170,170,30);
		totalpriceTextField.setBounds(160,210,170,30);
		
		insertbtn.setBounds(10,350,85,30);
insertbtn.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
			if (e.getSource()== insertbtn) {
				String query="INSERT INTO booking VALUES (?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(query);
				ps.setInt(1,Integer.parseInt(idTextField.getText()));
				ps.setInt(2,Integer.parseInt(useridTextField.getText()));
				ps.setInt(3,Integer.parseInt(eventidTextField.getText()));
				ps.setString(4,bookingdateandtimeTextField.getText()); 
				ps.setInt(5,Integer.parseInt(numberofticketTextField.getText()));
				ps.setInt(6,Integer.parseInt(totalpriceTextField.getText()));
				
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
						String query="DELETE  from booking where id=?";
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
		frame.add(eventid);
		frame.add(bookingdateandtime);
		frame.add(numberofticket);
		frame.add(totalprice);
				frame.add(idTextField);
		frame.add(useridTextField);
		frame.add(eventidTextField);
		frame.add(bookingdateandtimeTextField);
		frame.add(numberofticketTextField);
		frame.add(totalpriceTextField);
		
		frame.add(insertbtn);
		frame.add(deletebtn);
	}
	public static void main(String[] args) {
		bookingform bf=new bookingform();		
	}



	private void addcontent() {
		// TODO Auto-generated method stub
		
	}

	private void setlocationandsize() {
		// TODO Auto-generated method stub
		
	}

	private void createwindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
