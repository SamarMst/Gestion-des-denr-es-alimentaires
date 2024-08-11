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



	public class CreateComposition extends JFrame {
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JButton btnNewButton;
		CompositionDAO rcd1 = null;
		RecetteDAO rc = null;
		IngredientDAO in = null;
		
					/**
					 * Create the frame.
					 */
					
					public CreateComposition() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 450, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 456, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JButton b = new JButton("Exit");
						b.setBounds(280, 279, 89, 23);
						panel.add(b);
						b.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==b) {
									setVisible(false);
								}}});
						
						JLabel lblNomRangement = new JLabel("Ref Composition");
						lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement.setBounds(20, 100, 140, 28);
						panel.add(lblNomRangement);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_1.setColumns(10);
						textField_1.setBounds(170, 100, 191, 28);
						panel.add(textField_1);
						
						JLabel lblNewLabel_1 = new JLabel("Créer Composition");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 215, 43);
						panel.add(lblNewLabel_1);
						
						btnNewButton = new JButton("Ajouter");
						btnNewButton.setBounds(170, 279, 89, 23);
						panel.add(btnNewButton);
						
						textField_2 = new JTextField();
						textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_2.setColumns(10);
						textField_2.setBounds(170, 139, 191, 28);
						panel.add(textField_2);
						
						JLabel lblRefType = new JLabel("Quantité");
						lblRefType.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblRefType.setBounds(78, 139, 82, 28);
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
						
						JLabel lblCaloriesRecette = new JLabel("Ref Recette");
						lblCaloriesRecette.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblCaloriesRecette.setBounds(45, 180, 128, 28);
						panel.add(lblCaloriesRecette);
						
						JLabel lblDifficulte = new JLabel("Ref Ingredient");
						lblDifficulte.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblDifficulte.setBounds(32, 219, 128, 28);
						panel.add(lblDifficulte);
						btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							DBMSConnection db = new DBMSConnection();
							Object q = e.getSource();
							JButton r=(JButton)q;
							if(r==btnNewButton) {
				
								try {
									 rcd1 = new  CompositionDAO(db.getConnection());
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								try {
									 rc = new  RecetteDAO(db.getConnection());
								} catch (ClassNotFoundException ee1) {
									// TODO Auto-generated catch block
									ee1.printStackTrace();
								}
								try {
									 in = new  IngredientDAO(db.getConnection());
								} catch (ClassNotFoundException eee1) {
									// TODO Auto-generated catch block
									eee1.printStackTrace();
								}
								String t1 = textField_1.getText();
								int t2 =Integer.parseInt(textField_2.getText());
								Recette t3 = rc.find(textField_3.getText());
								Ingredient t4 = in.find(textField_4.getText());
								Composition w=new Composition(t1,t2,t3,t4);
								rcd1.create(w);
								JOptionPane.showMessageDialog(null, "Ajout avec Succes !","Creation Composition",JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
							}
							
							
						}});
						
						
						
					}
				}
