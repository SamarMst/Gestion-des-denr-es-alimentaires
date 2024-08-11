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



	public class DeleteComposition extends JFrame {
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;

		
					/**
					 * Create the frame.
					 */
					
					public DeleteComposition() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 450, 300);
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
						
						JLabel lblNewLabel_1 = new JLabel("Delete Composition");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 28));
						lblNewLabel_1.setBounds(53, 11, 300, 43);
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
								CompositionDAO rcd = null;
								DBMSConnection db = new DBMSConnection();
								if(r==btnNewButton) {
									try {
										 rcd = new  CompositionDAO(db.getConnection());
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									String h = textField_1.getText();
									Composition d = rcd.find(h);
									System.out.println(d);
									rcd.delete(d);
									
									JOptionPane.showMessageDialog(null, "Delete avec Succes !","Delete Composition",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});
						
						
						
						
					}
				}
