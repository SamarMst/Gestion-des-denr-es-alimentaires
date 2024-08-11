package package0;

import java.util.*;
import java.lang.String;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
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
		
	
		
		System.out.println("----------REQ1--------");
	
		ArrayList <Recette> ar = rc.findAll();
		Iterator it = ar.iterator();
		while(it.hasNext()) {
			Recette r4 = (Recette) it.next();
			if(r4.getCaloriesRecette()>300) {
				String s = r4.getNomRecette();
				System.out.println(s);
			}	
		}
		

		System.out.println("---------------REQ2----------------------");
		
		ArrayList <Rangement> rg = rc1.findAll();
		Iterator <Rangement> l1 = rg.iterator();
		
		boolean test=true;
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
					String h=p.getDescriptifProduit();
					System.out.println(h);

				}}
			System.out.println("----------REQ5--------");
		
		
		ArrayList <Recette> rec = rcdao.findAll();
		Iterator ita = rec.iterator();
		while(ita.hasNext()) {
			Recette re4 = (Recette) ita.next();
			if((re4.getNomRecette().toUpperCase()).contains("MOUSSE")) {
				
				System.out.println(re4.getNomRecette());
			}	
		}
		
		System.out.println("----------REQ3--------");
		
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
						
						while(lc6.hasNext()) {
							rq = (Recette)lc6.next();
						for(int j12=0;j12<by.size();j12++) {
							
						
							if(rq.getRefRecette().compareTo(by.get(j12))==0) {
								
								System.out.println(rq.getNomRecette());

							}}}
		
						System.out.println("----------REQ4--------");
						
						
						
						
						
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
							//System.out.println(jq);
							
							

							String ji = ccc.getRefIngredient().getRefIngredient();
							//System.out.println(jq.contains("r0002"));
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
						for(int wx=0;wx<tab.length;wx++) {
							if(tab[wx]!=null) {
					
								}
						}
						ArrayList <Rangement> k = rc11.findAll();
						ArrayList <String> stri = new ArrayList <String>();


						for(int v=0;v<tab.length;v++) {
							if(tab[v]!=null) {
							for(Rangement rang : k) {
						
							if(rang.getRefRangement().contains(tab[v]) && stri.contains(rang.getRefRangement())==false ) {
								stri.add(rang.getRefRangement());
								System.out.println(rang.getNomRangement());}
								}
							}}
					
							System.out.println("-----------REQ7---------------");
							
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
		
		
		System.out.println("-----------REQ6---------------");
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
	
		
	}
	
	}}	
}
System.out.println(xy11);



System.out.println("_____________RECETTE_____________");
Recette wx1=new Recette("r00071","gg","qq",12,"facile",10,10,2);

	
	//boolean tester1=rcd1.create(wx1);
	//System.out.println(tester1);
	//wx1.setCaloriesRecette(10);

	//boolean tester11=rcd1.update(wx1);
	//System.out.println(tester11);
try {
	 rcdaoo1 = new  TypeIngredientDAO(db.getConnection());
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	System.out.println("_____________TypeIngredient_____________");
	TypeIngredient ty = new TypeIngredient("t1111","Avocado");
	//boolean testery=rcdaoo1.create(ty);
	//ty.setNomType("Carote");
	//System.out.println(testery);
	System.out.println("_____________Ingredient_____________");
	try {
		 rcdao1 = new  IngredientDAO(db.getConnection());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Ingredient typ = new Ingredient("i1111","Avocado",ty);
	
	//typ.setNomIngredient("Champignon");
	//boolean testery=rcdao1.update(typ);
	//System.out.println(testery);
	System.out.println("_____________Composition_____________");
	try {
		compo1 = new  CompositionDAO(db.getConnection());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Composition cp = new Composition("101",12,wx1,typ);
	
		//cp.setQuantiteComposition(35);
		//Composition testery=compo1.find("101");
	//	System.out.println(testery);
	System.out.println("_____________Rangement_____________");
	try {
		 rnh = new  RangementDAO(db.getConnection());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Rangement cdp = new Rangement("r0022","Scaf12");
	//cdp.setNomRangement("Scaf41");
	//boolean testery=rnh.create(cdp);
	//System.out.println(testery);
	System.out.println("_____________Produit_____________");
	try {
		xrr = new  ProduitDAO(db.getConnection());
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	Produit cr = new Produit("P00041","curcuma","01/09/2013",4,17,cdp,typ);
	
	//boolean testery1=xrr.create(cr);
		//System.out.println(testery1);
	
	acceuil ab = new acceuil();
	
	
	}
}


