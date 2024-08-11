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



public class CreateIngredient extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	IngredientDAO in = null;
	TypeIngredientDAO tin = null;

	
	
				/**
				 * Create the frame.
				 */
				
				public CreateIngredient() {
					setVisible(true);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 450, 400);
					getContentPane().setLayout(null);
					
					JPanel panel = new JPanel();
					panel.setBounds(0, 0, 798, 373);
					getContentPane().add(panel);
					panel.setLayout(null);
					
					JLabel lblNewLabel = new JLabel("Ref Ingredient");
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblNewLabel.setBounds(27, 100, 147, 28);
					panel.add(lblNewLabel);
					
					JLabel lblNomRangement = new JLabel("Nom Ingredient");
					lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblNomRangement.setBounds(27, 154, 147, 28);
					panel.add(lblNomRangement);
					
					textField = new JTextField();
					textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
					textField.setBounds(170, 102, 191, 28);
					panel.add(textField);
					textField.setColumns(10);
					
					textField_1 = new JTextField();
					textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
					textField_1.setColumns(10);
					textField_1.setBounds(170, 160, 191, 28);
					panel.add(textField_1);
					
					JButton b = new JButton("Exit");
					b.setBounds(280, 271, 89, 23);
					panel.add(b);
					b.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Object q=e.getSource();
							JButton r=(JButton)q;
							if(r==b) {
								setVisible(false);
							}}});
					
					
					JLabel lblNewLabel_1 = new JLabel("Créer Ingredient");
					lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
					lblNewLabel_1.setBounds(53, 11, 215, 43);
					panel.add(lblNewLabel_1);
					
					JButton btnNewButton = new JButton("Ajouter");
					btnNewButton.setBounds(179, 271, 89, 23);
					panel.add(btnNewButton);
					
					textField_2 = new JTextField();
					textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
					textField_2.setColumns(10);
					textField_2.setBounds(170, 214, 191, 28);
					panel.add(textField_2);
					
					JLabel lblRefType = new JLabel("Ref Type");
					lblRefType.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblRefType.setBounds(71, 214, 89, 28);
					panel.add(lblRefType);
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							DBMSConnection db = new DBMSConnection();
							Object q = e.getSource();
							JButton r=(JButton)q;
							if(r==btnNewButton) {
								try {
									 in = new  IngredientDAO(db.getConnection());
								} catch (ClassNotFoundException eee1) {
									// TODO Auto-generated catch block
									eee1.printStackTrace();
								}
								try {
									 tin = new  TypeIngredientDAO(db.getConnection());
								} catch (ClassNotFoundException eee1) {
									// TODO Auto-generated catch block
									eee1.printStackTrace();
								}
								String t1 = textField.getText();
								String t2 = textField_1.getText();
								TypeIngredient t3 = tin.find(textField_2.getText());
								Ingredient w=new Ingredient(t1,t2,t3);
								in.create(w);
								JOptionPane.showMessageDialog(null, "Ajout avec Succes !","Creation Ingredient",JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
							}
							
							
						}});
					
					
				}
			}
