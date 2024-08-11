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



	public class UpdateComposition extends JFrame {
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;

		
					/**
					 * Create the frame.
					 */
					
					public UpdateComposition() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 450, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 456, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNomRangement = new JLabel("Ref Composition");
						lblNomRangement.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNomRangement.setBounds(20, 100, 140, 28);
						panel.add(lblNomRangement);
						
						textField_1 = new JTextField();
						textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_1.setColumns(10);
						textField_1.setBounds(170, 100, 191, 28);
						panel.add(textField_1);
						
						JLabel lblNewLabel_1 = new JLabel("Update Composition");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 250, 43);
						panel.add(lblNewLabel_1);
						
						JButton btnNewButton = new JButton("Update");
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
						
						
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								CompositionDAO rcd = null;
								DBMSConnection db = new DBMSConnection();
								String t1=textField_1.getText();
								int t2=Integer.parseInt(textField_2.getText());
								if(r==btnNewButton) {
									try {
										 rcd = new  CompositionDAO(db.getConnection());
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									Composition rr = rcd.find(t1);
									rr.setQuantiteComposition(t2);
									boolean k =rcd.update(rr);
									System.out.println(k);
									JOptionPane.showMessageDialog(null, "Update avec Succes !","Update Composition",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});

						
						
					}
				}
