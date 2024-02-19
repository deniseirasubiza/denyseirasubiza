package Denyse;

import java.awt.Color;
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

public class reportform implements ActionListener {
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel reporttype=new JLabel("reporttype");
	JLabel reportgenerationdateandtime= new JLabel("reportgenerationdateandtime");
	JLabel reportcontent=new JLabel("reportcontent");
	
	JTextField idTextField=new JTextField();
	JTextField reporttypeTextField=new JTextField();
	JTextField reportgenerationdateandtimeTextField=new JTextField();
	JTextField reportcontentTextField=new JTextField();
	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public reportform() {
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
	reporttype.setBounds(10,50,200,30);
		reportgenerationdateandtime.setBounds(10,90,200,30);
		reportcontent.setBounds(10,130,200,30);
		
		idTextField.setBounds(160,10,170,30);
		reporttypeTextField.setBounds(160,50,170,30);
		reportgenerationdateandtimeTextField.setBounds(160,90,170,30);
		reportcontentTextField.setBounds(160,130,170,30);
		
		insertbtn.setBounds(10,200,85,30);
		insertbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== insertbtn) {
						String query="INSERT INTO report VALUES (?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setInt(1,Integer.parseInt(idTextField.getText()));
						ps.setString(2,reporttypeTextField.getText());
						ps.setString(3,reportgenerationdateandtimeTextField.getText());
						ps.setString(4,reportcontentTextField.getText()); 
						
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
		readbtn.setBounds(100,200,85,30);
		updatebtn.setBounds(190,200,85,30);
		deletebtn.setBounds(280,200,85,30);
deletebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
					if (e.getSource()== deletebtn) {
						String query="DELETE  from report where reportid=?";
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
		frame.add(reporttype);
		frame.add(reportgenerationdateandtime);
		frame.add(reportcontent);
		
		frame.add(idTextField);
		frame.add(reporttypeTextField);
		frame.add(reportgenerationdateandtimeTextField);
		frame.add(reportcontentTextField);
		
		
		frame.add(insertbtn);
		frame.add(readbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
	}

	public static void main(String[] args) {
		reportform rf=new reportform(); 
	}
		
	
	private void addcontent() {
		
		
	}


	private void setlocationandsize() {
	
		
	}





	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}