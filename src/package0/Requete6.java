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
import java.util.*;
import java.lang.String;


import javax.swing.JTextField;
	import javax.swing.JButton;
	import javax.swing.JScrollPane;



	public class Requete6 extends JFrame {
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
					
					public Requete6() {
						setVisible(true);
						setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						setBounds(100, 100, 500, 299);
						getContentPane().setLayout(null);
						
						JPanel panel = new JPanel();
						panel.setBounds(0, 0, 499, 576);
						getContentPane().add(panel);
						panel.setLayout(null);
						
						JLabel lblNewLabel_1 = new JLabel("Requete 6");
						lblNewLabel_1.setFont(new Font("Sitka Subheading", Font.BOLD, 24));
						lblNewLabel_1.setBounds(53, 11, 257, 43);
						panel.add(lblNewLabel_1);
						
						JLabel lblB = new JLabel("");
						lblB.setFont(new Font("Sitka Subheading", Font.CENTER_BASELINE, 50));
						lblB.setBounds(112, 117, 305, 50);
						panel.add(lblB);
						
						
						
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
					
					
					
					boolean testo = true;
					
					ArrayList <TypeIngredient> rec1 = rcdaoo.findAll();
					Iterator itao = rec1.iterator();
					while(itao.hasNext()&& testo==true) {
						 reo4 = (TypeIngredient) itao.next();
						if(reo4.getNomType().equals("oeuf")) {
							iq = reo4.getRefType();
							//System.out.println(iq);
						}	
					}
					String[] f1 = new String[10];
					Ingredient tr=null;
					
					int rr=0;
					ArrayList <Ingredient> lt = rc44.findAll();
					for(Ingredient aa :lt) {
						
						
						if(aa.getRefType().getRefType().contains(iq)) {
							f1[rr]=aa.getRefIngredient();
							rr++;
						}	
					}
for(int qq=0;qq<f1.length;qq++) {
	if(f1[qq]!=null) {
		//System.out.println(f1[qq]);
		}
}
ArrayList <Composition> com = xrdao.findAll();

String[] trx = new String[100];
int xy=0;
for(int ss=0;ss<rr;ss++) {
	int sam1=0;
for(Composition qh : com) {
	sam1++;

	if(f1[ss].contains(qh.getRefIngredient().getRefIngredient())){
		xy++;}
	}	
}
System.out.println(xy);

	
	

	boolean testo11 = true;
	
	TypeIngredient reo44=null;
	ArrayList <TypeIngredient> rec13 = rcdaoo.findAll();
	Iterator itao14 = rec13.iterator();
	while(itao14.hasNext()&& testo11==true) {
		 reo44 = (TypeIngredient) itao14.next();
		if(reo44.getNomType().equals("farine")) {
			iq11 = reo4.getRefType();
			//System.out.println(iq11);


		}	
	}
	String[] f12 = new String[10];
	int rr12=0;
	ArrayList <Ingredient> lt12 = rc44.findAll();
	//Iterator ing = rec.iterator();
	for(Ingredient aa :lt12) {
		
		
		if(aa.getRefType().getRefType().contains(iq11)) {
			f12[rr]=aa.getRefIngredient();
			rr++;
			
		}	
	}
for(int qq1=0;qq1<f12.length;qq1++) {
if(f12[qq1]!=null) {
//System.out.println(f12[qq1]);

}
}
	

ArrayList <Composition> com7 = xrdao1.findAll();


int xy11=0;
for(int ss=0;ss<f12.length;ss++) {
 
if(f12[ss]!=null) {
for(Composition qh : com7) {


if(f12[ss].contains(qh.getRefIngredient().getRefIngredient())){
	xy11+=qh.getQuantiteComposition();
	lblB.setText(String.valueOf(xy11));

	
}

}}	
}
System.out.println(xy11);
lblB.setText(String.valueOf(xy11));


JButton btnNewButton = new JButton("Exit");
btnNewButton.setBounds(112, 190, 89, 23);
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
