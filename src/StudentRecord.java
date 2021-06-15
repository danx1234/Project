import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;
import java.awt.Panel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Checkbox;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecord {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecord window = new StudentRecord();
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
	public StudentRecord() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(233, 150, 122));
		frame.setBounds(0, 0, 1430, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(10, 11, 675, 639);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(175, 238, 238));
		textField.setBounds(106, 55, 148, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Student ID:");
		lblNewLabel.setBounds(22, 58, 74, 14);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(22, 89, 74, 14);
		panel.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(22, 120, 74, 14);
		panel.add(lblSurname);
		
		JLabel lblCourseCode = new JLabel("Course Code:");
		lblCourseCode.setBounds(22, 151, 85, 14);
		panel.add(lblCourseCode);
		
		JLabel lblExamNo = new JLabel("Exam No:");
		lblExamNo.setBounds(22, 182, 74, 14);
		panel.add(lblExamNo);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(22, 213, 74, 14);
		panel.add(lblGender);
		
		JLabel lblDob = new JLabel("Dob:");
		lblDob.setBounds(22, 244, 74, 14);
		panel.add(lblDob);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(175, 238, 238));
		textField_1.setColumns(10);
		textField_1.setBounds(106, 86, 148, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(175, 238, 238));
		textField_2.setColumns(10);
		textField_2.setBounds(106, 117, 148, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(175, 238, 238));
		textField_3.setColumns(10);
		textField_3.setBounds(106, 148, 148, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(175, 238, 238));
		textField_4.setColumns(10);
		textField_4.setBounds(106, 179, 148, 20);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(175, 238, 238));
		textField_5.setColumns(10);
		textField_5.setBounds(106, 210, 148, 20);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(175, 238, 238));
		textField_6.setColumns(10);
		textField_6.setBounds(106, 241, 148, 20);
		panel.add(textField_6);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(22, 277, 74, 14);
		panel.add(lblAddress);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(175, 238, 238));
		textPane.setBounds(106, 272, 148, 131);
		panel.add(textPane);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(337, 11, 2, 419);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 428, 655, 2);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 11, 655, 2);
		panel.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(10, 11, 2, 419);
		panel.add(separator_3);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setBounds(663, 11, 2, 419);
		panel.add(separator_3_1);
		
		JLabel lblMaths = new JLabel("Maths:");
		lblMaths.setBounds(362, 58, 74, 14);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English:");
		lblEnglish.setBounds(362, 89, 74, 14);
		panel.add(lblEnglish);
		
		JLabel lblBiology = new JLabel("Biology:");
		lblBiology.setBounds(362, 120, 74, 14);
		panel.add(lblBiology);
		
		JLabel lblComputing = new JLabel("Computing:");
		lblComputing.setBounds(362, 151, 74, 14);
		panel.add(lblComputing);
		
		JLabel lblChemistry = new JLabel("Chemistry:");
		lblChemistry.setBounds(362, 182, 74, 14);
		panel.add(lblChemistry);
		
		JLabel lblPhysics = new JLabel("Physics:");
		lblPhysics.setBounds(362, 213, 74, 14);
		panel.add(lblPhysics);
		
		JLabel lblAddMaths = new JLabel("Add Maths:");
		lblAddMaths.setBounds(362, 244, 74, 14);
		panel.add(lblAddMaths);
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(175, 238, 238));
		textField_7.setColumns(10);
		textField_7.setBounds(446, 55, 148, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setBackground(new Color(175, 238, 238));
		textField_8.setColumns(10);
		textField_8.setBounds(446, 86, 148, 20);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setBackground(new Color(175, 238, 238));
		textField_9.setColumns(10);
		textField_9.setBounds(446, 117, 148, 20);
		panel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(175, 238, 238));
		textField_10.setColumns(10);
		textField_10.setBounds(446, 148, 148, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setBackground(new Color(175, 238, 238));
		textField_11.setColumns(10);
		textField_11.setBounds(446, 179, 148, 20);
		panel.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setBackground(new Color(175, 238, 238));
		textField_12.setColumns(10);
		textField_12.setBounds(446, 210, 148, 20);
		panel.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setBackground(new Color(175, 238, 238));
		textField_13.setColumns(10);
		textField_13.setBounds(446, 241, 148, 20);
		panel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBackground(new Color(175, 238, 238));
		textField_14.setColumns(10);
		textField_14.setBounds(446, 274, 148, 20);
		panel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBackground(new Color(175, 238, 238));
		textField_15.setColumns(10);
		textField_15.setBounds(446, 305, 148, 20);
		panel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBackground(new Color(175, 238, 238));
		textField_16.setColumns(10);
		textField_16.setBounds(446, 336, 148, 20);
		panel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBackground(new Color(175, 238, 238));
		textField_17.setColumns(10);
		textField_17.setBounds(446, 367, 148, 20);
		panel.add(textField_17);
		
		JLabel lblNewLabel_7_1 = new JLabel("Bussiness:");
		lblNewLabel_7_1.setBounds(362, 277, 74, 14);
		panel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_2 = new JLabel("Total Scores:");
		lblNewLabel_7_2.setBounds(362, 308, 74, 14);
		panel.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_7_3 = new JLabel("Average:");
		lblNewLabel_7_3.setBounds(362, 339, 74, 14);
		panel.add(lblNewLabel_7_3);
		
		JLabel lblNewLabel_7_4 = new JLabel("Ranking:");
		lblNewLabel_7_4.setBounds(362, 370, 74, 14);
		panel.add(lblNewLabel_7_4);
		
		JLabel lblNewLabel_1 = new JLabel("   Student Class Record");
		lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 41));
		lblNewLabel_1.setForeground(new Color(255, 255, 102));
		lblNewLabel_1.setBounds(47, 428, 606, 188);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(695, 11, 665, 566);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(175, 238, 238));
		textArea.setBounds(33, 25, 607, 518);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(695, 599, 665, 51);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Transcript");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(10, 11, 108, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(128, 11, 85, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Result");
		btnNewButton_2.setBackground(new Color(192, 192, 192));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(223, 11, 78, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(498, 11, 78, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(586, 11, 65, 23);
		panel_2.add(btnNewButton_4);
	}
}
