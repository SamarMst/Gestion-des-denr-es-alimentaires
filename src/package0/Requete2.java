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
import java.util.ListIterator;

import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;



	public class Requete2 extends JFrame {
		Produit p = null;
		Rangement r = null;
		RangementDAO rc1 = null;
		ProduitDAO rc2 =null;
		DBMSConnection db = new DBMSConnection();
					/**
					 * Create the frame.
					 */
					
					public Requete2() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 601);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 499, 576);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("Requete 2");
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
						
						JLabel lblC_4_1 = new JLabel("");
						lblC_4_1.setBounds(112, 360, 305, 35);
						panel.add(lblC_4_1);
						
						JLabel lblC_4_1_1 = new JLabel("");
						lblC_4_1_1.setBounds(112, 400, 305, 35);
						panel.add(lblC_4_1_1);
						
						JLabel lblC_4_1_2 = new JLabel("");
						lblC_4_1_2.setBounds(112, 440, 305, 35);
						panel.add(lblC_4_1_2);
						
						try {
							 rc1 = new  RangementDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							rc2 = new  ProduitDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						ArrayList <Rangement> rg = rc1.findAll();
						Iterator <Rangement> l1 = rg.iterator();
						
						boolean test=true;
						int f=0;
						while(l1.hasNext() && test==true) {
							r = (Rangement)l1.next();
							if(r.getNomRangement().equals("réfrigérateur")) {
								test=false;
							}}
							ArrayList <Produit> pr = rc2.findAll();
							ListIterator <Produit> l3 = pr.listIterator();
							while(l3.hasNext()) {
								p = (Produit)l3.next();
								
								String h1=p.getRefRangement1().getRefRangement();
								if(h1.equals(r.getRefRangement())) {
									
									String s=p.getDescriptifProduit();
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
										if(f==8) {
											lblC_4_1.setText(s);
											}
										if(f==9) {
											lblC_4_1_1.setText(s);
											}
										if(f==10) {
											lblC_4_1_2.setText(s);
											}
										f++;

								}}
							JButton btnNewButton = new JButton("Exit");
							btnNewButton.setBounds(112, 490, 89, 23);
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
