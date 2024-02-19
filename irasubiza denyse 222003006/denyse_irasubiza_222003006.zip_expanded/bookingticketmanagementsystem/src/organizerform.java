import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Denyse.reportform;

public class organizerform implements ActionListener {
	JFrame frame;
	JLabel id=new JLabel("id");
	JLabel organizername=new JLabel("organizername");
	JLabel organizercontactinformation= new JLabel("organizercontactinformation");
	JLabel organizerevents=new JLabel("organizerevents");
	
	JTextField idTextField=new JTextField();
	JTextField organizernameTextField=new JTextField();
	JTextField organizercontactinformationTextField=new JTextField();
	JTextField organizereventsTextField=new JTextField();
	
	JButton insertbtn=new JButton ("INSERT");
	JButton readbtn=new JButton ("READ");
	JButton updatebtn=new JButton ("UPDATE");
	JButton deletebtn=new JButton ("DELETE");
	public organizerform() {
		createwindow();
	}
	

	private void createwindow() {
		frame= new JFrame();
		frame.setTitle("organizer form");
		frame.setBounds(10,10, 400, 300);
		frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		frame.setResizable(true);
		setlocationandsize1();
		
	}
	private void setlocationandsize1() {
		id.setBounds(10, 10, 200, 30);
	organizername.setBounds(10,50,200,30);
		organizercontactinformation.setBounds(10,90,200,30);
		organizerevents.setBounds(10,130,200,30);
		
		idTextField.setBounds(160,10,170,30);
		organizernameTextField.setBounds(160,50,170,30);
		organizercontactinformationTextField.setBounds(160,90,170,30);
		organizereventsTextField.setBounds(160,130,170,30);
		
		insertbtn.setBounds(10,200,85,30);
		readbtn.setBounds(100,200,85,30);
		updatebtn.setBounds(190,200,85,30);
		deletebtn.setBounds(280,200,85,30);
		addcontent1();
		
	}
	private void addcontent1() {
		frame.add(id);
		frame.add(organizername);
		frame.add(organizercontactinformation);
		frame.add(organizerevents);
		
		frame.add(idTextField);
		frame.add(organizernameTextField);
		frame.add(organizercontactinformationTextField);
		frame.add(organizereventsTextField);
		
		
		frame.add(insertbtn);
		frame.add(readbtn);
		frame.add(updatebtn);
		frame.add(deletebtn);
	}

	public static void main(String[] args) {
		organizerform of=new organizerform(); 
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
