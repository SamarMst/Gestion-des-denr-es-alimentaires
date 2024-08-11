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



	public class Requete3 extends JFrame {
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
		DBMSConnection db = new DBMSConnection();
					/**
					 * Create the frame.
					 */
					
					public Requete3() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 300);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 499, 576);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("Requete 3");
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
						
						ArrayList <TypeIngredient> ti = rc3.findAll();
						ListIterator <TypeIngredient> l4 = ti.listIterator();
						boolean test11=true;
						while(l4.hasNext()&& test11==true) {
							t = (TypeIngredient)l4.next();
							if(t.getNomType().compareTo("fruit de mer")==0) {
								
								j=t.getRefType();
								
								test11=false;

							}}
						
						
						String[] q=new String[200];
						int x=0;
						Ingredient[] y=new Ingredient[200];
						int i=0;
				
					
						
							ArrayList <Ingredient> b = rc4.findAll();
							ListIterator <Ingredient> l5 = b.listIterator();
							ListIterator <Ingredient> l19 = b.listIterator();
							
						
							String j1;
							while(l19.hasNext()) {
								t9 = (Ingredient)l19.next();
								//System.out.println(t9.getRefType().getRefType());
							
								String o= t9.getRefType().getRefType();
								if( o.compareTo(j)==0) {
									y[i]=t9;
									
									//System.out.println(y[i].getNomIngredient());
									//System.out.println(t9.getRefIngredient());
									i++;
								}}
							
						
						
							
							ArrayList <String> by = new ArrayList <String>();
							ArrayList <Ingredient> nom = new ArrayList<Ingredient>();
							ListIterator <Ingredient> lnom = nom.listIterator();
								ArrayList <Composition> c = rc5.findAll();
								ListIterator <Composition> lc = c.listIterator();
								for(int j11=0;j11<y.length;j11++) {
									if(y[j11]!=null) {
										nom.add(y[j11]);
									}}
								for(int j11=0;j11<nom.size();j11++) {
									//System.out.println(nom.get(j11).getRefIngredient());
									}
								while(lc.hasNext()) {
									cc = (Composition)lc.next();
								for(int j11=0;j11<nom.size();j11++) {
									if((cc.getRefIngredient().getRefIngredient()).compareTo(nom.get(j11).getRefIngredient())==0) {
										by.add(cc.getRefRec().getRefRecette());}
									}
									
								}

									ArrayList <Recette> c9 = rc.findAll();
									ListIterator <Recette> lc6 = c9.listIterator();
									int f=0;
									while(lc6.hasNext()) {
										rq = (Recette)lc6.next();
									for(int j12=0;j12<by.size();j12++) {
										
									
										if(rq.getRefRecette().compareTo(by.get(j12))==0) {
											
											String s = rq.getNomRecette();
											if(f==0) {
												lblB.setText(s);
												}
												if(f==1) {
													lblC.setText(s);
													}
												f++;
										}}}
									JButton btnNewButton = new JButton("Exit");
									btnNewButton.setBounds(112, 180, 89, 23);
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
