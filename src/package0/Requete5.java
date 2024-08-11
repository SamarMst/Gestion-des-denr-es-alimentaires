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
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;



	public class Requete5 extends JFrame {
		RecetteDAO rcdao = null;
		DBMSConnection db = new DBMSConnection();
					/*
					 * Create the frame.
					 */
					
					public Requete5() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 370);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 499, 576);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("Requete 5");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 257, 43);
						panel.add(lblNewLabel_1);
						
						JLabel lblB = new JLabel("");
						lblB.setBounds(112, 60, 305, 35);
						lblB.setFont(new Font("Tahoma", Font.PLAIN, 30));
						panel.add(lblB);
						
						JLabel lblC = new JLabel("");
						lblC.setBounds(112, 120, 305, 35);
						lblC.setFont(new Font("Tahoma", Font.PLAIN, 30));
						panel.add(lblC);
						
						
						
						try {
							 rcdao = new  RecetteDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						ArrayList <Recette> rec = rcdao.findAll();
						Iterator ita = rec.iterator();
						int f=0;
						while(ita.hasNext()) {
							Recette re4 = (Recette) ita.next();
							if((re4.getNomRecette().toUpperCase()).contains("MOUSSE")) {
								System.out.println("----------");
								System.out.println(re4.getNomRecette());
								System.out.println("----------");
								String s = re4.getNomRecette();
								if(f==0) {
									lblB.setText(s);
									}
									if(f==1) {
										lblC.setText(s);
										}
									f++;
							}	
						}
						JButton btnNewButton = new JButton("Exit");
						btnNewButton.setBounds(112, 260, 89, 23);
						panel.add(btnNewButton);
						btnNewButton.addActionListener(new ActionListener() {
							@Override
							public void actionPerformed(ActionEvent e) {
								Object q=e.getSource();
								JButton r=(JButton)q;
								if(r==btnNewButton) {
									setVisible(false);
								}}});
						
					}
				}

