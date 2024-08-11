package package0;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

	public class DeleteRangement extends JFrame {

			private JTextField textField;
			RangementDAO ran = null;

					/**
					 * Create the frame.
					 */
					public DeleteRangement() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 450, 300);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 798, 373);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel = new JLabel("Ref Rangement");
						lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblNewLabel.setBounds(50, 135, 164, 28);
						panel.add(lblNewLabel);
						
						textField = new JTextField();
						textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField.setBounds(204, 135, 191, 28);
						panel.add(textField);
						textField.setColumns(10);
						
						
						JLabel lblNewLabel_1 = new JLabel("Delete Rangement");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
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
						btnNewButton.setBounds(179, 200, 89, 23);
						panel.add(btnNewButton);
				
					btnNewButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							Object q=e.getSource();
							JButton r=(JButton)q;
							DBMSConnection db = new DBMSConnection();
							if(r==btnNewButton) {
								try {
									 ran = new  RangementDAO(db.getConnection());
								} catch (ClassNotFoundException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								String h = textField.getText();
								Rangement d = ran.find(h);
								ran.delete(d);
								
								JOptionPane.showMessageDialog(null, "Delete avec Succes !","Delete Rangement",JOptionPane.INFORMATION_MESSAGE);
								setVisible(false);
							}
						}});
					}
					}