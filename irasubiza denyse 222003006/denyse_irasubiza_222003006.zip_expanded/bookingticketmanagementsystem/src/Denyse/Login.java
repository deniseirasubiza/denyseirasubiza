package Denyse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

    private JFrame frmLoginForm;
    private JTextField usertxf;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login window = new Login();
                    window.frmLoginForm.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmLoginForm = new JFrame();
        frmLoginForm.setTitle("Login Form");
        frmLoginForm.getContentPane().setBackground(new Color(64, 128, 128));
        frmLoginForm.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("LOGIN FORM");
        lblNewLabel.setBounds(287, 11, 243, 47);
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 24));
        frmLoginForm.getContentPane().add(lblNewLabel);

        JLabel uslb = new JLabel("USERNAME");
        uslb.setForeground(new Color(255, 255, 255));
        uslb.setFont(new Font("Tahoma", Font.BOLD, 20));
        uslb.setBounds(10, 85, 174, 47);
        frmLoginForm.getContentPane().add(uslb);

        usertxf = new JTextField();
        usertxf.setBounds(201, 69, 342, 54);
        frmLoginForm.getContentPane().add(usertxf);
        usertxf.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
        lblNewLabel_1_1.setForeground(Color.WHITE);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(10, 145, 174, 47);
        frmLoginForm.getContentPane().add(lblNewLabel_1_1);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnNewButton.setForeground(new Color(128, 0, 255));
        btnNewButton.setBounds(54, 313, 121, 38);
        frmLoginForm.getContentPane().add(btnNewButton);

        JButton btnSignup = new JButton("SIGNUP");
        btnSignup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Implement signup action
            }
        });
        btnSignup.setForeground(new Color(0, 0, 255));
        btnSignup.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnSignup.setBounds(252, 313, 121, 38);
        frmLoginForm.getContentPane().add(btnSignup);

        JButton btnCancel = new JButton("CANCEL");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancel();
            }
        });
        btnCancel.setForeground(Color.RED);
        btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        btnCancel.setBounds(420, 313, 106, 38);
        frmLoginForm.getContentPane().add(btnCancel);

        passwordField = new JPasswordField();
        passwordField.setBounds(201, 149, 342, 47);
        frmLoginForm.getContentPane().add(passwordField);

        JButton btnNewButton_1 = new JButton("LOGIN AS ADMIN");
        btnNewButton_1.setForeground(new Color(0, 0, 160));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginAsAdmin();
            }
        });
        btnNewButton_1.setFont(new Font("Sorts Mill Goudy", Font.ITALIC, 19));
        btnNewButton_1.setBounds(234, 231, 243, 38);
        frmLoginForm.getContentPane().add(btnNewButton_1);
        frmLoginForm.setBounds(100, 100, 611, 461);
        frmLoginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void login() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem", "root", "");
            Statement stm = con.createStatement();
            String query = "select * from users where userid='" + usertxf.getText() + "' and password='" + new String(passwordField.getPassword()) + "'";
            ResultSet set = stm.executeQuery(query);
            if (set.next()) {
                JOptionPane.showMessageDialog(frmLoginForm, "Login Successfully!!!");
                // bookingform login = new bookingform();
                // login.setVisible(true);
                frmLoginForm.dispose();
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
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password incorrect");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void loginAsAdmin() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookingticketmanagementsystem", "root", "");
            Statement stm = con.createStatement();
            String query = "select * from users where username='" + usertxf.getText() + "' and password='" + new String(passwordField.getPassword()) + "'";
            ResultSet set = stm.executeQuery(query);
            if (set.next()) {
                JOptionPane.showMessageDialog(frmLoginForm, "Login Successfully!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password incorrect");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void cancel() {
        usertxf.setText("");
        passwordField.setText("");
    }
}
