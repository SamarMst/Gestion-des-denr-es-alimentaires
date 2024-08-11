
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



	public class DeleteProduit extends JFrame {
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
		private JTextField textField_6;
		private JTextField textField_7;
		ProduitDAO p = null;
					/**
					 * Create the frame.
					 */
					
					public DeleteProduit() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 450, 400);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 1015, 430);
						getContentPane().add(panel);
						panel.setLayout(null);
						
			
						JLabel lblNewLabel_1 = new JLabel("Delete Produit");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 35));
						lblNewLabel_1.setBounds(50, 11, 300, 43);
						panel.add(lblNewLabel_1);
						
						JButton b = new JButton("Exit");
						b.setBounds(300, 200, 89, 23);
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
						btnNewButton.setBounds(200, 200, 89, 23);
						panel.add(btnNewButton);
						
						
						JLabel lblRefType = new JLabel("Ref Produit");
						lblRefType.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblRefType.setBounds(80, 139, 150, 28);
						panel.add(lblRefType);
						
						textField_3 = new JTextField();
						textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_3.setColumns(10);
						textField_3.setBounds(200, 139, 191, 28);
						panel.add(textField_3);
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								DBMSConnection db = new DBMSConnection();
								if(r==btnNewButton) {
									
									try {
										 p = new  ProduitDAO(db.getConnection());
									} catch (ClassNotFoundException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									String h = textField_3.getText();
									Produit d = p.find(h);
									System.out.println(d);
									p.delete(d);
									
									JOptionPane.showMessageDialog(null, "Delete avec Succes !","Delete Produit",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});
						
						
						
						
						
					}
				}


