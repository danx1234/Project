package studentRecord;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class StudentRecord {

	private JFrame frame;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstName;
	private JTextField jtxtSurname;
	private JTextField jtxtExamNo;
	private JTextField jtxtDob;
	private JTextField jtxtMaths;
	private JTextField jtxtEng;
	private JTextField jtxtBio;
	private JTextField jtxtCom;
	private JTextField jtxtChem;
	private JTextField jtxtPhy;
	private JTextField jtxtAddM;
	private JTextField jtxtBus;
	private JTextField jtxtTotalScore;
	private JTextField jtxtAverage;
	private JTextField jtxtRanking;

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
		frame.setBounds(0, 0, 2530, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(10, 11, 675, 639);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setBackground(new Color(175, 238, 238));
		jtxtStudentID.setBounds(106, 55, 148, 20);
		jtxtStudentID.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtStudentID);
		jtxtStudentID.setColumns(10);
		
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
		
		JLabel lblDob = new JLabel("Date Of Birth:");
		lblDob.setBounds(22, 244, 74, 14);
		panel.add(lblDob);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setBackground(new Color(175, 238, 238));
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(106, 86, 148, 20);
		panel.add(jtxtFirstName);
		
		jtxtSurname = new JTextField();
		jtxtSurname.setBackground(new Color(175, 238, 238));
		jtxtSurname.setColumns(10);
		jtxtSurname.setBounds(106, 117, 148, 20);
		panel.add(jtxtSurname);
		
		jtxtExamNo = new JTextField();
		jtxtExamNo.setBackground(new Color(175, 238, 238));
		jtxtExamNo.setColumns(10);
		jtxtExamNo.setBounds(106, 179, 148, 20);
		jtxtExamNo.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtExamNo);
		
		jtxtDob = new JTextField();
		jtxtDob.setBackground(new Color(175, 238, 238));
		jtxtDob.setColumns(10);
		jtxtDob.setBounds(106, 241, 148, 20);
		panel.add(jtxtDob);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(22, 277, 74, 14);
		panel.add(lblAddress);
		
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
		
		jtxtMaths = new JTextField();
		jtxtMaths.setBackground(new Color(175, 238, 238));
		jtxtMaths.setColumns(10);
		jtxtMaths.setBounds(446, 55, 148, 20);
		jtxtMaths.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtMaths);
		
		jtxtEng = new JTextField();
		jtxtEng.setBackground(new Color(175, 238, 238));
		jtxtEng.setColumns(10);
		jtxtEng.setBounds(446, 86, 148, 20);
		jtxtEng.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtEng);
		
		jtxtBio = new JTextField();
		jtxtBio.setBackground(new Color(175, 238, 238));
		jtxtBio.setColumns(10);
		jtxtBio.setBounds(446, 117, 148, 20);
		jtxtBio.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtBio);
		
		jtxtCom = new JTextField();
		jtxtCom.setBackground(new Color(175, 238, 238));
		jtxtCom.setColumns(10);
		jtxtCom.setBounds(446, 148, 148, 20);
		jtxtCom.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtCom);
		
		jtxtChem = new JTextField();
		jtxtChem.setBackground(new Color(175, 238, 238));
		jtxtChem.setColumns(10);
		jtxtChem.setBounds(446, 179, 148, 20);
		jtxtChem.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtChem);
		
		jtxtPhy = new JTextField();
		jtxtPhy.setBackground(new Color(175, 238, 238));
		jtxtPhy.setColumns(10);
		jtxtPhy.setBounds(446, 210, 148, 20);
		jtxtPhy.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtPhy);
		
		jtxtAddM = new JTextField();
		jtxtAddM.setBackground(new Color(175, 238, 238));
		jtxtAddM.setColumns(10);
		jtxtAddM.setBounds(446, 241, 148, 20);
		jtxtAddM.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtAddM);
		
		jtxtBus = new JTextField();
		jtxtBus.setBackground(new Color(175, 238, 238));
		jtxtBus.setColumns(10);
		jtxtBus.setBounds(446, 274, 148, 20);
		jtxtBus.addKeyListener(new KeyAdapter() {
	         public void keyTyped(KeyEvent ke) {
		            if(!Character.isDigit(ke.getKeyChar())) {
		            	ke.consume();
		            }
		            
		          }
		       });
		panel.add(jtxtBus);
		
		jtxtTotalScore = new JTextField();
		jtxtTotalScore.setEditable(false);
		jtxtTotalScore.setForeground(Color.BLACK);
		jtxtTotalScore.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtxtTotalScore.setBackground(new Color(175, 238, 238));
		jtxtTotalScore.setColumns(10);
		jtxtTotalScore.setBounds(446, 305, 148, 20);
		panel.add(jtxtTotalScore);
		
		jtxtAverage = new JTextField();
		jtxtAverage.setEditable(false);
		jtxtAverage.setForeground(Color.BLACK);
		jtxtAverage.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtxtAverage.setBackground(new Color(175, 238, 238));
		jtxtAverage.setColumns(10);
		jtxtAverage.setBounds(446, 336, 148, 20);
		panel.add(jtxtAverage);
		
		jtxtRanking = new JTextField();
		jtxtRanking.setEditable(false);
		jtxtRanking.setForeground(Color.BLACK);
		jtxtRanking.setFont(new Font("Tahoma", Font.BOLD, 11));
		jtxtRanking.setBackground(new Color(175, 238, 238));
		jtxtRanking.setColumns(10);
		jtxtRanking.setBounds(446, 367, 148, 20);
		panel.add(jtxtRanking);
		
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
		
		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setFont(new Font("Monospaced", Font.BOLD, 18));
		jtxtAddress.setBackground(new Color(175, 238, 238));
		jtxtAddress.setBounds(106, 272, 148, 131);
		panel.add(jtxtAddress);
		
		JComboBox cmbCourseCode = new JComboBox();
		cmbCourseCode.setModel(new DefaultComboBoxModel(new String[] {"", "04845", "14845", "24845", "34845", "44845"}));
		cmbCourseCode.setBackground(new Color(175, 238, 238));
		cmbCourseCode.setBounds(106, 148, 148, 20);
		panel.add(cmbCourseCode);
		
		JComboBox cmbGender = new JComboBox();
		cmbGender.setModel(new DefaultComboBoxModel(new String[] {"", "Female", "Male"}));
		cmbGender.setBackground(new Color(175, 238, 238));
		cmbGender.setBounds(106, 209, 148, 20);
		panel.add(cmbGender);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBackground(new Color(30, 144, 255));
		panel_1.setBounds(695, 11, 665, 566);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setEditable(false);
		jtxtTranscript.setFont(new Font("Monospaced", Font.PLAIN, 18));
		jtxtTranscript.setBackground(new Color(175, 238, 238));
		jtxtTranscript.setBounds(33, 25, 607, 518);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		panel_2.setBorder(new MatteBorder(1, 1, 4, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(695, 599, 665, 51);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnTranscript = new JButton("Transcript");
		btnTranscript.setBackground(new Color(192, 192, 192));
		btnTranscript.setBounds(10, 11, 108, 23);
		btnTranscript.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtTranscript.setText("");
				jtxtTranscript.append("Student Result Recording System\n"
				+"=====================================\n"
				+"Student ID:\t\t" + jtxtStudentID.getText()
				+"\nFirstname:\t\t" + jtxtFirstName.getText()
				+"\nSurname:\t\t" + jtxtSurname.getText()
				+"\nMaths:\t\t\t" + jtxtMaths.getText()
				+"\nEnglish:\t\t" + jtxtEng.getText()
				+"\nBiology:\t\t" + jtxtBio.getText()
				+"\nComputing:\t\t" + jtxtCom.getText()
				+"\nChemistry:\t\t" + jtxtChem.getText()
				+"\nPhysics:\t\t" + jtxtPhy.getText()
				+"\nAdd Maths:\t\t" + jtxtAddM.getText()
				+"\nBusiness:\t\t" + jtxtBus.getText() + "\n"
				+"=====================================\n"
				+"\nTotal:\t\t\t" + jtxtTotalScore.getText()
				+"\nAvarage:\t\t" + jtxtAverage.getText()
				+"\nRanking:\t\t" + jtxtRanking.getText()+"\n");
			}
		});
		panel_2.add(btnTranscript);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(192, 192, 192));
		btnPrint.setBounds(128, 11, 85, 23);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MessageFormat header = new MessageFormat("Printing in progress");
				MessageFormat footer = new MessageFormat("Page{0,number,integer}");
				
				try {
					jtxtTranscript.print();
				}catch(java.awt.print.PrinterException ev){
					System.err.format("No Printer Found", ev.getMessage());
				}
			}
		});
		panel_2.add(btnPrint);
		
		JButton btnResult = new JButton("Result");
		btnResult.setBackground(new Color(192, 192, 192));
		btnResult.setBounds(223, 11, 78, 23);
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double[] R = new double[14];
				R[0] = Double.parseDouble(jtxtMaths.getText());
				R[1] = Double.parseDouble(jtxtEng.getText());
				R[2] = Double.parseDouble(jtxtBio.getText());
				R[3] = Double.parseDouble(jtxtCom.getText());
				R[4] = Double.parseDouble(jtxtChem.getText());
				R[5] = Double.parseDouble(jtxtPhy.getText());
				R[6] = Double.parseDouble(jtxtAddM.getText());
				R[7] = Double.parseDouble(jtxtBus.getText());
				
				R[8] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7] ) /8;
				R[9] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7] );
				
				String Average = String.format("%.0f", R[8]);
				jtxtAverage.setText(Average);
				
				String TotalScore = String.format("%.0f", R[9]);
				jtxtTotalScore.setText(TotalScore);
				
				if(R[9] >= 700) {
					jtxtRanking.setText("1st Class");
				}else if (R[9] >= 600) {
					jtxtRanking.setText("2nd Class Upper");
				}else if(R[9] >= 500) {
					jtxtRanking.setText("2nd Class Lower");
				}else if(R[9] >= 400) {
					jtxtRanking.setText("3rd Class ");
				}else if(R[9] >= 300) {
					jtxtRanking.setText("Cohe");
				}else if(R[9] >= 200) {
					jtxtRanking.setText("Fail");
				}else {
					jtxtRanking.setText("Error");
				}
				
				if(R[0] > 100 || R[0] < 60) {
					jtxtMaths.setText("");
					jtxtMaths.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[1] > 100 || R[1] < 60) {
					jtxtEng.setText("");
					jtxtEng.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[2] > 100 || R[2] < 60) {
					jtxtBio.setText("");
					jtxtBio.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[3] > 100 || R[3] < 60) {
					jtxtCom.setText("");
					jtxtCom.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[4] > 100 || R[4] < 60) {
					jtxtChem.setText("");
					jtxtChem.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[5] > 100 || R[5] < 60) {
					jtxtPhy.setText("");
					jtxtPhy.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[6] > 100 || R[6] < 60) {
					jtxtAddM.setText("");
					jtxtAddM.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
				if(R[7] > 100 || R[7] < 60) {
					jtxtBus.setText("");
					jtxtBus.requestFocus();
					jtxtTotalScore.setText("");
					jtxtAverage.setText("");
					jtxtRanking.setText("");
					
				}
			}
		});
		panel_2.add(btnResult);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(192, 192, 192));
		btnReset.setBounds(498, 11, 78, 23);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp = null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp = (JTextField)c;
						temp.setText(null);
					}
				}
				jtxtTranscript.setText(null);
				jtxtAddress.setText(null);
			}
		});
		panel_2.add(btnReset);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.setBackground(new Color(192, 192, 192));
		btnNewButton_4.setBounds(586, 11, 65, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confrm if you want to exit","Student Record System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		panel_2.add(btnNewButton_4);
	}
}
