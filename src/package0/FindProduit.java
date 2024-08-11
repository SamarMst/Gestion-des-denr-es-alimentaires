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



	public class FindProduit extends JFrame {
		private static JTextField textField;
		

					/**
					 * Create the frame.
					 */
					
					public FindProduit() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 400, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 947, 430);
						getContentPane().add(panel);
						panel.setLayout(null);

						
						JLabel lblNewLabel_1 = new JLabel("Find Produit");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 257, 43);
						panel.add(lblNewLabel_1);
						
						JLabel lblNewLabel = new JLabel("Ref Produit");
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNewLabel.setBounds(10, 150, 93, 37);
						panel.add(lblNewLabel);
						
						textField = new JTextField();
						textField.setBounds(113, 157, 137, 27);
						panel.add(textField);
						textField.setColumns(10);
						
						JButton b = new JButton("Exit");
						b.setBounds(250, 271, 89, 23);
						panel.add(b);
						b.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==b) {
									setVisible(false);
								}}});
						
						JButton btnNewButton = new JButton("Find");
						btnNewButton.setBounds(113, 271, 89, 23);
						panel.add(btnNewButton);
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==btnNewButton) {
									FindProduitTable fr = new FindProduitTable();
									setVisible(false);
								}
							}});	
					}
					public static String [][] tt() {
						ProduitDAO p = null;
						RangementDAO ra = null;
						IngredientDAO in = null;
						DBMSConnection db = new DBMSConnection();
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
						String t1=textField.getText();
						Produit pr = p.find(t1);
						String r1 = pr.getRefProduit();
						String r2 = pr.getDescriptifProduit();
						String r3 = pr.getDatePeremption();
						String r4 = String.valueOf(pr.getQuantiteProduit());
						String r5 = String.valueOf(pr.getPrixProduit());
						String r6 = pr.getRefRangement1().getRefRangement();
						String r7 = pr.getRefIngredient().getRefIngredient();
						String[][] ss= {{r1,r2,r3,r4,r5,r6,r7}};
						return ss;
					}
				}

