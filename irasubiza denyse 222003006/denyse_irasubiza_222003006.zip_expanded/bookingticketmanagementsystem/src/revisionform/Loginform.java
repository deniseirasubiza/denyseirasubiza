package revisionform;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Loginform implements ActionListener {
	JFrame frame;
	JLabel userlb= new JLabel("USERNAME");
	JLabel passwordlb= new JLabel("PASSWORD");
	
	JTextField usertxf= new JTextField();
	JTextField passtxf= new JTextField();
	JButton loginbtn = new JButton("LOGIN");
	JButton cancelbtn = new JButton("CANCEL");
	public Loginform() {
		creatwindow();
	}
	private void creatwindow() {
		frame = new JFrame();
		frame.setTitle("LOGIN FORM");
		frame.setBounds(10, 10, 300, 250);
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize();
		
	}
	private void setlocationandsize() {
		userlb.setBounds(10, 10, 200, 30);
		passwordlb.setBounds(10, 50, 200, 30);

		usertxf.setBounds(120, 10, 130, 30);
		passtxf.setBounds(120, 50, 130, 30);
loginbtn.setBounds(40, 150, 85, 30);
loginbtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem","root","");
				if (e.getSource()== deletebtn) {
			String query="select * from user where username='"+usertxf.getText()+"' and password='"+password	TextField.getText().toString()+"' and usertype='"+usertyptxf.getText()+"'";
			ResultSet set=stm.executeQuery(query);
			if (set.next()) {
				JOptionPane.showMessageDialog(loginbtn, "Login Successfully!!!");
				Allformssystem all=new Allformssystem();
				all.frame.setVisible(true);
				dispose();
				
				
			}
			else {
				JOptionPane.showMessageDialog(null, "username or password incorrect");
			}
				
				catch (Exception e2) {
			
		}
		
	}
});
JButton cancelbtn = new JButton("CANCEL");
cancelbtn.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		usertxf.setText(null);
		passtxf.setText(null);
		usertxf.setText(null);
	}
});
		cancelbtn.setBounds(140, 150, 85, 30);
		addcontents();
		
		
	}
	private void addcontents() {
		frame.add(userlb);
		frame.add(passwordlb);

		frame.add(usertxf);
		frame.add(passtxf);
		frame.add(loginbtn);
		frame.add(cancelbtn);
		
	}
	public static void main(String[] args) {
		Loginform log= new Loginform ();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
