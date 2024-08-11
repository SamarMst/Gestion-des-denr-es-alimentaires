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



	public class UpdateProduit extends JFrame {
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		ProduitDAO p = null;
		RangementDAO ra = null;
		IngredientDAO in = null;
					/**
					 * Create the frame.
					 */
					
					public UpdateProduit() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 400, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 1015, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel = new JLabel("Ref Produit");
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNewLabel.setBounds(56, 61, 104, 28);
						panel.add(lblNewLabel);
						
						JLabel lblNomRangement = new JLabel("Descriptif");
						lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement.setBounds(50, 100, 106, 28);
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
						

						JLabel lblNewLabel_1 = new JLabel("Update Produit");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(40, 11, 215, 43);
						panel.add(lblNewLabel_1);
						
						JButton btnNewButton = new JButton("Update");
						btnNewButton.setBounds(170, 350, 89, 23);
						panel.add(btnNewButton);
						
						textField_2 = new JTextField();
						textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_2.setColumns(10);
						textField_2.setBounds(170, 139, 191, 28);
						panel.add(textField_2);
						
						JLabel lblRefType = new JLabel("Date Peremption");
						lblRefType.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblRefType.setBounds(15, 139, 150, 28);
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
						
					
						
	
						
						JLabel lblCaloriesRecette = new JLabel("Quantite Produit");
						lblCaloriesRecette.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblCaloriesRecette.setBounds(5, 180, 140, 28);
						panel.add(lblCaloriesRecette);
						
						JLabel lblDifficulte = new JLabel("Prix");
						lblDifficulte.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblDifficulte.setBounds(80, 219, 82, 28);
						panel.add(lblDifficulte);
						
						JButton b = new JButton("Exit");
						b.setBounds(280, 350, 89, 23);
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
								DBMSConnection db = new DBMSConnection();
								String t1=textField.getText();
								String t2=textField_1.getText();
								String t3=textField_2.getText();
								int t4=Integer.parseInt(textField_3.getText());
								int t5=Integer.parseInt(textField_4.getText());
								if(r==btnNewButton) {
									try {
										 p = new  ProduitDAO(db.getConnection());
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									try {
										 ra = new  RangementDAO(db.getConnection());
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
									Produit pr = p.find(t1);
									pr.setDescriptifProduit(t2);
									pr.setDatePeremption(t3);
									pr.setQuantiteProduit(t4);
									pr.setPrixProduit(t5);
									boolean k =p.update(pr);
									System.out.println(k);
									JOptionPane.showMessageDialog(null, "Update avec Succes !","Update Produit",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});

						
						
						
						
					}
				}

