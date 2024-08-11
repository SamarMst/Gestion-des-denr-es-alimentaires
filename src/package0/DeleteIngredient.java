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



public class DeleteIngredient extends JFrame {
	private JTextField textField;
	IngredientDAO rcd = null;

				/**
				 * Create the frame.
				 */
				
				public DeleteIngredient() {
					setVisible(true);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 450, 300);
					getContentPane().setLayout(null);
					
					JPanel panel = new JPanel();
					panel.setBounds(0, 0, 798, 373);
					getContentPane().add(panel);
					panel.setLayout(null);
					
					JLabel lblNewLabel = new JLabel("Ref Ingredient");
					lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
					lblNewLabel.setBounds(27, 100, 147, 28);
					panel.add(lblNewLabel);
					
					
					textField = new JTextField();
					textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
					textField.setBounds(170, 102, 191, 28);
					panel.add(textField);
					textField.setColumns(10);
					
					
					JLabel lblNewLabel_1 = new JLabel("Delete Ingredient");
					lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
					lblNewLabel_1.setBounds(53, 11, 215, 43);
					panel.add(lblNewLabel_1);
					
					JButton b = new JButton("Exit");
					b.setBounds(280, 200, 89, 23);
					panel.add(b);
					b.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Object q=e.getSource();
							JButton r=(JButton)q;
							if(r==b) {
								setVisible(false);
							}}});
					
					JButton btnNewButton = new JButton("Delete");
					btnNewButton.setBounds(170, 200, 89, 23);
					panel.add(btnNewButton);
					
					btnNewButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Object q=e.getSource();
							JButton r=(JButton)q;
							TypeIngredientDAO rc = null;
							DBMSConnection db = new DBMSConnection();
							if(r==btnNewButton) {
								try {
									 rcd = new  IngredientDAO(db.getConnection());
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								String h = textField.getText();
								Ingredient d = rcd.find(h);
								System.out.println(d);
								rcd.delete(d);
								
								JOptionPane.showMessageDialog(null, "Delete avec Succes !","Delete Composition",JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
							}
						}});
					
					
					
				}
			}
