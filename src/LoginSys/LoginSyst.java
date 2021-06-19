package LoginSys;
import studentRecord.StudentRecord;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class LoginSyst {

	private JFrame frame;
	private JTextField txtTeacher;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private JButton btnNewButton_1;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSyst window = new LoginSyst();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginSyst() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN");
		lblNewLabel.setBounds(167, 11, 135, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblTeacher = new JLabel("Teacher:");
		lblTeacher.setBounds(107, 76, 91, 14);
		frame.getContentPane().add(lblTeacher);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(107, 140, 91, 14);
		frame.getContentPane().add(lblPassword);
		
		txtTeacher = new JTextField();
		txtTeacher.setBackground(new Color(175, 238, 238));
		txtTeacher.setBounds(208, 73, 109, 20);
		frame.getContentPane().add(txtTeacher);
		txtTeacher.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBackground(new Color(175, 238, 238));
		txtPassword.setBounds(208, 137, 109, 20);
		frame.getContentPane().add(txtPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(192, 192, 192));
		btnLogin.setBounds(107, 204, 89, 23);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txtTeacher.getText();
				String password = txtPassword.getText();
				
				if(user.equals("Admin") && password.equals("12345")) {
					StudentRecord.main(null);
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(null,"Invalid login Details","login Error",JOptionPane.ERROR_MESSAGE);
				}
		}});
		frame.getContentPane().add(btnLogin);
		
		btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(321, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		separator = new JSeparator();
		separator.setBounds(10, 41, 464, 2);
		frame.getContentPane().add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setBounds(10, 186, 464, 7);
		frame.getContentPane().add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(10, 41, 1, 146);
		frame.getContentPane().add(separator_2);
		
		separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(473, 41, 1, 146);
		frame.getContentPane().add(separator_3);
		
		
	}

	
}
