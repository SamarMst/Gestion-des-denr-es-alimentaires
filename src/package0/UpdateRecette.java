	package package0;

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JTable;
	import java.awt.FlowLayout;
	import javax.swing.table.DefaultTableModel;
	import java.awt.BorderLayout;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;



	public class UpdateRecette extends JFrame {
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;

					/**
					 * Create the frame.
					 */
					
					public UpdateRecette() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 1015, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel = new JLabel("Ref Recette");
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNewLabel.setBounds(56, 61, 104, 28);
						panel.add(lblNewLabel);
						
						JLabel lblNomRangement = new JLabel("Nom Recette");
						lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement.setBounds(54, 100, 106, 28);
						panel.add(lblNomRangement);
						
						textField = new JTextField();
						textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField.setBounds(170, 61, 191, 28);
						panel.add(textField);
						textField.setColumns(10);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_1.setColumns(10);
						textField_1.setBounds(170, 100, 191, 28);
						panel.add(textField_1);
						

						JLabel lblNewLabel_1 = new JLabel("Update Recette");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 215, 43);
						panel.add(lblNewLabel_1);
						
						JButton btnNewButton = new JButton("Update");
						btnNewButton.setBounds(170, 374, 89, 23);
						panel.add(btnNewButton);
						
						textField_2 = new JTextField();
						textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_2.setColumns(10);
						textField_2.setBounds(170, 139, 191, 28);
						panel.add(textField_2);
						
						JLabel lblRefType = new JLabel("Descriptif Recette");
						lblRefType.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblRefType.setBounds(10, 139, 150, 28);
						panel.add(lblRefType);
						
						textField_3 = new JTextField();
						textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_3.setColumns(10);
						textField_3.setBounds(170, 180, 191, 28);
						panel.add(textField_3);
						
						textField_4 = new JTextField();
						textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_4.setColumns(10);
						textField_4.setBounds(170, 219, 191, 28);
						panel.add(textField_4);
						
						textField_5 = new JTextField();
						textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_5.setColumns(10);
						textField_5.setBounds(170, 258, 191, 28);
						panel.add(textField_5);
						
						textField_6 = new JTextField();
						textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_6.setColumns(10);
						textField_6.setBounds(170, 297, 191, 28);
						panel.add(textField_6);
						
						textField_7 = new JTextField();
						textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_7.setColumns(10);
						textField_7.setBounds(170, 335, 191, 28);
						panel.add(textField_7);
						
						JLabel lblCaloriesRecette = new JLabel("Calories Recette");
						lblCaloriesRecette.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblCaloriesRecette.setBounds(20, 178, 140, 28);
						panel.add(lblCaloriesRecette);
						
						JLabel lblDifficulte = new JLabel("Difficulte");
						lblDifficulte.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblDifficulte.setBounds(78, 219, 82, 28);
						panel.add(lblDifficulte);
						
						JLabel lblNomRangement_1_1 = new JLabel("Temps Cuisson");
						lblNomRangement_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement_1_1.setBounds(27, 258, 129, 28);
						panel.add(lblNomRangement_1_1);
						
						JLabel lblNomRangement_1_1_1 = new JLabel("Temps Preparation");
						lblNomRangement_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement_1_1_1.setBounds(10, 297, 164, 28);
						panel.add(lblNomRangement_1_1_1);
						
						JLabel lblNomRangement_1_1_2 = new JLabel("Nb Personnes");
						lblNomRangement_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement_1_1_2.setBounds(40, 335, 120, 28);
						panel.add(lblNomRangement_1_1_2);
						
						JButton b = new JButton("Exit");
						b.setBounds(280, 374, 89, 23);
						panel.add(b);
						b.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==b) {
									setVisible(false);
								}}});
						
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								RecetteDAO rcd = null;
								DBMSConnection db = new DBMSConnection();
								String t1=textField.getText();
								String t2=textField_1.getText();
								String t3=textField_2.getText();
								int t4=Integer.parseInt(textField_3.getText());
								String t5=textField_4.getText();
								Float t6=Float.parseFloat(textField_5.getText());
								Float t7=Float.parseFloat(textField_6.getText());
								int t8=Integer.parseInt(textField_7.getText());
								if(r==btnNewButton) {
									try {
										 rcd = new  RecetteDAO(db.getConnection());
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									
									Recette rr = new Recette(t1,t2,t3,t4,t5,t6,t7,t8);
									boolean k =rcd.update(rr);
									System.out.println(k);
									JOptionPane.showMessageDialog(null, "Update avec Succes !","Update Recette",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});

						
					}
				}
