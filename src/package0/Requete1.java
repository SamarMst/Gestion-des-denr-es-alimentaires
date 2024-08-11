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



public class Requete1 extends JFrame {
	RecetteDAO rc = null;

				public Requete1() {
					setVisible(true);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setBounds(100, 100, 700, 450);
					getContentPane().setLayout(null);
					
					JPanel panel = new JPanel();
					panel.setBounds(0, 0, 499, 430);
					getContentPane().add(panel);
					panel.setLayout(null);
					
					JLabel lblNewLabel_1 = new JLabel("Requete 1");
					lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
					lblNewLabel_1.setBounds(53, 5, 257, 43);
					panel.add(lblNewLabel_1);
					
					JLabel lblNewLabel = new JLabel("");
					lblNewLabel.setBounds(112, 40, 305, 35);
					panel.add(lblNewLabel);
					
					JLabel lblB = new JLabel("");
					lblB.setBounds(112, 80, 305, 35);
					panel.add(lblB);
					
					JLabel lblC = new JLabel("");
					lblC.setBounds(112, 120, 305, 35);
					panel.add(lblC);
					
					JLabel lblNewLabel_4 = new JLabel("");
					lblNewLabel_4.setBounds(112, 160, 305, 35);
					panel.add(lblNewLabel_4);
					
					JLabel lblC_1 = new JLabel("");
					lblC_1.setBounds(112, 200, 305, 35);
					panel.add(lblC_1);
					
					JLabel lblC_2 = new JLabel("");
					lblC_2.setBounds(112, 240, 305, 35);
					panel.add(lblC_2);
					
					JLabel lblC_3 = new JLabel("");
					lblC_3.setBounds(112, 280, 305, 35);
					panel.add(lblC_3);
					
					JLabel lblC_4 = new JLabel("");
					lblC_4.setBounds(112, 320, 305, 35);
					panel.add(lblC_4);
					
					DBMSConnection db = new DBMSConnection();
					try {
						 rc = new  RecetteDAO(db.getConnection());
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ArrayList <Recette> ar = rc.findAll();
					Iterator it = ar.iterator();
					int f=0;
					while(it.hasNext()) {
						Recette r4 = (Recette) it.next();
						if(r4.getCaloriesRecette()>300) {
							String s = r4.getNomRecette();
							if(f==0) {
							lblNewLabel.setText(s);
							}
							if(f==1) {
								lblB.setText(s);
								}
							if(f==2) {
								lblC.setText(s);
								}
							if(f==3) {
								lblNewLabel_4.setText(s);
								}
							if(f==4) {
								lblC_1.setText(s);
								}
							if(f==5) {
								lblC_2.setText(s);
								}
							if(f==6) {
								lblC_3.setText(s);
								}
							if(f==7) {
								lblC_4.setText(s);
								}
							f++;
						}	
					}
					JButton btnNewButton = new JButton("Exit");
					btnNewButton.setBounds(112, 360, 89, 23);
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

