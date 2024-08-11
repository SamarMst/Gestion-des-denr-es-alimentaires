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



	public class FindComposition extends JFrame {
	
		private static JTextField textField_3;
		static CompositionDAO c = null;
		static  DBMSConnection db = new DBMSConnection();

					/**
					 * Create the frame.
					 */
					
					public FindComposition() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 400, 450);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 947, 430);
						getContentPane().add(panel);
						panel.setLayout(null);

						
						JLabel lblNewLabel_1 = new JLabel("Find Composition");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 215, 43);
						panel.add(lblNewLabel_1);
						
						JButton btnNewButton = new JButton("Find");
						btnNewButton.setBounds(170, 271, 89, 23);
						panel.add(btnNewButton);
						JButton b = new JButton("Exit");
						b.setBounds(270, 271, 89, 23);
						panel.add(b);
						b.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==b) {
									setVisible(false);
								}}});
						
						textField_3 = new JTextField();
						textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_3.setColumns(10);
						textField_3.setBounds(170, 180, 191, 28);
						panel.add(textField_3);
						
						JLabel lblCaloriesRecette = new JLabel("Ref Composition");
						lblCaloriesRecette.setFont(new Font("Tahoma", Font.BOLD, 16));
						lblCaloriesRecette.setBounds(20, 178, 140, 28);
						panel.add(lblCaloriesRecette);
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==btnNewButton) {
									FindCompositionTable fr = new FindCompositionTable();
									//JOptionPane.showMessageDialog(null, "Find avec Succes !","Find Composition",JOptionPane.INFORMATION_MESSAGE);
									setVisible(false);
								}
							}});
						
						
					}
					public static String [][] tt() {
						try {
							 c = new  CompositionDAO(db.getConnection());
						} catch (ClassNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						String t1=textField_3.getText();
						Composition com = c.find(t1);
						String r1 = com.getRefComposition();
						String r2 = String.valueOf(com.getQuantiteComposition());
						String r3 = com.getRefRec().getRefRecette();
						String r4 = com.getRefIngredient().getRefIngredient();
						String[][] ss= {{r1,r2,r3,r4}};
						return ss;
					}
				}

