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
import java.util.ListIterator;

import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;



	public class Requete4 extends JFrame {
		CompositionDAO rc5 =null;
		IngredientDAO rcdao1=null;
		IngredientDAO rc4 =null;
		IngredientDAO rc44 =null;
		RecetteDAO rcdao = null;
		RecetteDAO rcd1 = null;
		String iq11=null;
		TypeIngredient reo4=null;
		String[] y11=new String[5];
		int a=0;
		CompositionDAO compo1 = null;
		RecetteDAO rc = null;
		CompositionDAO xrdao = null;
		ProduitDAO xrr = null;
		TypeIngredientDAO rcdaoo = null;
		TypeIngredientDAO rcdaoo1 = null;
		Rangement r = null;
		Rangement r11 = null;
		RangementDAO rnh = null;
		String j= null;
		Composition cc = null;
		CompositionDAO cc1 = null;
		Composition ccc = null;
		Composition xr = null;
		CompositionDAO xrdao1= null;
		Ingredient t9 = null;
		Ingredient tt = null;
		RangementDAO rc11 = null;
		ProduitDAO pdao = null;
		Recette rq=null;
		Recette ro=null;
		Recette rqdao=null;
		RangementDAO rc1 = null;
		ProduitDAO rc2 =null;
		ProduitDAO rc22 =null;
		TypeIngredientDAO rc3 =null;
		TypeIngredient t = null;
		Produit p = null;
		String iq=null;
	
		
					/**
					 * Create the frame.
					 */
					
					public Requete4() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 400);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 499, 576);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("Requete 4");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 5, 257, 43);
						panel.add(lblNewLabel_1);
						
						JLabel lblB = new JLabel("");
						lblB.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblB.setBounds(112, 50, 305, 35);
						panel.add(lblB);
						
						JLabel lblC = new JLabel("");
						lblC.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblC.setBounds(112, 100, 305, 35);
						panel.add(lblC);
						
						JLabel lblC_1 = new JLabel("");
						lblC_1.setBounds(112, 150, 305, 35);
						lblC_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						panel.add(lblC_1);
						
						JLabel lblC_1_1 = new JLabel("");
						lblC_1_1.setBounds(112, 200, 305, 35);
						lblC_1_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						panel.add(lblC_1_1);
						
						DBMSConnection db = new DBMSConnection();
						try {
							 rc = new  RecetteDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
						try {
							 rcdao = new  RecetteDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							rc3 = new  TypeIngredientDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							rc4 = new  IngredientDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							rc5 = new  CompositionDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 rc11 = new  RangementDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							rc22 = new  ProduitDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 cc1 = new CompositionDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 rc11 = new  RangementDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 rcdaoo = new  TypeIngredientDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 rc44 = new  IngredientDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							 xrdao = new  CompositionDAO(db.getConnection());
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					try {
						 xrdao1 = new  CompositionDAO(db.getConnection());
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}		
					try {
						 rcd1 = new  RecetteDAO(db.getConnection());
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						int kk=0;
						int sam=0;
						ArrayList <Composition> ch = cc1.findAll();
						ListIterator <Composition> lcc = ch.listIterator();
						
						String [] refing = new String[7];
						ArrayList <String> refrec = new ArrayList <String>();
						String s = "r0002";
						ArrayList <String> nom11 = new ArrayList <String>();

						while(lcc.hasNext()) {
							ccc = (Composition)lcc.next();
						

							String jq = ccc.getRefRec().getRefRecette();
							String ji = ccc.getRefIngredient().getRefIngredient();
							if(jq.contains("r0002"))	{							
								refing[kk]=ccc.getRefIngredient().getRefIngredient();	
								kk++;
							}
							}
						for(int hh=0;hh<refing.length;hh++) {
							if(refing[hh]!=null) {
						//System.out.println(refing[hh]);
								}}
						for(int j11=0;j11<refing.length;j11++) {
							if(refing[j11]!=null) {
								nom11.add(refing[j11]);
							}}
						ArrayList <Produit> pp = rc22.findAll();
						ListIterator <Produit> lp = pp.listIterator();
						
						int z=0;
						String[] tab = new String[10];
						for(String gh :nom11) {
							
							for(Produit pro : pp) {
						String jj=pro.getRefIngredient().getRefIngredient();
							if(jj.contains(gh)) {
								
								tab[z]=pro.getRefRangement1().getRefRangement();
							
								z++;

							}}}
						int f=0;
						ArrayList <Rangement> k = rc11.findAll();
						ArrayList <String> stri = new ArrayList <String>();
						for(int v=0;v<tab.length;v++) {
							if(tab[v]!=null) {
							for(Rangement rang : k) {
						
							if(rang.getRefRangement().contains(tab[v]) && stri.contains(rang.getRefRangement())==false ) {
								stri.add(rang.getRefRangement());
								String s1 = rang.getNomRangement();
								if(f==0) {
									lblB.setText(s1);
									}
									if(f==1) {
										lblC.setText(s1);
										}
									if(f==2) {
										lblC_1.setText(s1);
										}
									if(f==3) {
										lblC_1_1.setText(s1);
										}
									f++;
							}
								}
							}}
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
