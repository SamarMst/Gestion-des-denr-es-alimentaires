package package0;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;



public class acceuil   extends JFrame {
	JPanel panel =new JPanel();
	JFrame frame= new JFrame("Food Management");
	DBMSConnection db = new DBMSConnection();
	
	public acceuil(){
		JPanel i =new JPanel();
		JPanel kol =new JPanel();
		i.setPreferredSize(new Dimension(960,640));
		i.setLayout(new BorderLayout());
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ACER\\Downloads\\supermarket.jpg"));
		lblNewLabel.setBounds(0, 36, 960, 640);
		panel.add(lblNewLabel);
		

		
		kol.add(i);
		panel.setLayout(null);
		JMenuBar MyMenuBar =new JMenuBar();
		MyMenuBar.setBounds(0, 0, 960, 35);
		panel .add(MyMenuBar);
		JMenu Rangement = new JMenu ("Rangement");
		MyMenuBar.add(Rangement);
		
		JMenu TypeIngredient = new JMenu ("TypeIngredient");
		MyMenuBar.add(TypeIngredient);
		
		JMenu Ingredient = new JMenu ("Ingredient");
		MyMenuBar.add(Ingredient);
		
		JMenu Recette = new JMenu ("Recette");
		MyMenuBar.add(Recette);
		
		JMenu Composition = new JMenu ("Composition");
		MyMenuBar.add(Composition);
		
		JMenu Produit = new JMenu ("Produit");
		MyMenuBar.add(Produit);
		
		JMenu Requetes = new JMenu ("Requetes");
		MyMenuBar.add(Requetes);
		
		
		
		JMenuItem req1 = new JMenuItem("Req1");
		JMenuItem req2 = new JMenuItem("Req2");
		JMenuItem req3 = new JMenuItem("Req3");
		JMenuItem req4 = new JMenuItem("Req4");
		JMenuItem req5 = new JMenuItem("Req5");
		JMenuItem req6 = new JMenuItem("Req6");
		JMenuItem req7 = new JMenuItem("Req7");
		 
		Requetes.add(req1);
		Requetes.add(req2);
		Requetes.add(req3);
		Requetes.add(req4);
		Requetes.add(req5);
		Requetes.add(req6);
		Requetes.add(req7);
		   

			
		frame.setSize(960,700);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuItem CreateRangement = new JMenuItem("Create Rangement");
		JMenuItem UpdateRangement = new JMenuItem("Update Rangement");
		JMenuItem DeleteRangement = new JMenuItem("Delete Rangement");
		JMenuItem FindRangement = new JMenuItem("Find Rangement");
		JMenuItem FindAllRangement = new JMenuItem("FindAll Rangement");
		Rangement.add(CreateRangement);
		Rangement.add(UpdateRangement);
		Rangement.add(DeleteRangement);
		Rangement.add(FindRangement);
		Rangement.add(FindAllRangement);
		
		
		JMenuItem CreateTypeIngredient= new JMenuItem("Create TypeIngredient");
		JMenuItem UpdateTypeIngredient= new JMenuItem("Update TypeIngredient");
		JMenuItem DeleteTypeIngredient = new JMenuItem("Delete TypeIngredient");
		JMenuItem FindTypeIngredient = new JMenuItem("Find TypeIngredient");
		JMenuItem FindAllTypeIngredient = new JMenuItem("FindAll TypeIngredient");
		TypeIngredient.add(CreateTypeIngredient);
		TypeIngredient.add(UpdateTypeIngredient);
		TypeIngredient.add(DeleteTypeIngredient);
		TypeIngredient.add(FindTypeIngredient);
		TypeIngredient.add(FindAllTypeIngredient);
		
		JMenuItem CreateIngredient= new JMenuItem("Create Ingredient");
		JMenuItem UpdateIngredient= new JMenuItem("Update Ingredient");
		JMenuItem DeleteIngredient = new JMenuItem("Delete Ingredient");
		JMenuItem FindIngredient = new JMenuItem("Find Ingredient");
		JMenuItem FindAllIngredient = new JMenuItem("FindAll Ingredient");
		Ingredient.add(CreateIngredient);
		Ingredient.add(UpdateIngredient);
		Ingredient.add(DeleteIngredient);
		Ingredient.add(FindIngredient);
		Ingredient.add(FindAllIngredient);
		
		JMenuItem CreateRecette= new JMenuItem("Create Recette");
		JMenuItem UpdateRecette= new JMenuItem("Update Recette");
		JMenuItem DeleteRecette = new JMenuItem("Delete Recette");
		JMenuItem FindRecette = new JMenuItem("Find Recette");
		JMenuItem FindAllRecette = new JMenuItem("FindAll Recette");
		Recette.add(CreateRecette);
		Recette.add(UpdateRecette);
		Recette.add(DeleteRecette);
		Recette.add(FindRecette);
		Recette.add(FindAllRecette);
		
		JMenuItem CreateComposition= new JMenuItem("Create Composition");
		JMenuItem UpdateComposition= new JMenuItem("Update Composition");
		JMenuItem DeleteComposition = new JMenuItem("Delete Composition");
		JMenuItem FindComposition = new JMenuItem("Find Composition");
		JMenuItem FindAllComposition = new JMenuItem("FindAll Composition");
		Composition.add(CreateComposition);
		Composition.add(UpdateComposition);
		Composition.add(DeleteComposition);
		Composition.add(FindComposition);
		Composition.add(FindAllComposition);
		
		JMenuItem CreateProduit= new JMenuItem("Create Produit");
		JMenuItem UpdateProduit= new JMenuItem("Update Produit");
		JMenuItem DeleteProduit = new JMenuItem("Delete Produit");
		JMenuItem FindProduit = new JMenuItem("Find Produit");
		JMenuItem FindAllProduit = new JMenuItem("FindAll Produit");
		Produit.add(CreateProduit);
		Produit.add(UpdateProduit);
		Produit.add(DeleteProduit);
		Produit.add(FindProduit);
		Produit.add(FindAllProduit);
		
		
		
		
		CreateRangement.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	CreateRangement rc =new CreateRangement();
	            	
	            }
	        });
		
		UpdateRangement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateRangement URInterface =new UpdateRangement();
            }
        });
		
		DeleteRangement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteRangement DRinterface = new DeleteRangement();
            }
        });
		
		FindRangement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindRangement FRinterface = new FindRangement();
            }
        });
		
		FindAllRangement.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllRangement FARinterface = new FindAllRangement();
            }
        });
		
		/**************************/
		
		
		CreateTypeIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
            	CreateTypeIngredient CRTIinterface =new CreateTypeIngredient();
            }
        });
		
		UpdateTypeIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateTypeIngredient UTIinterface = new UpdateTypeIngredient();
            }
        });
		
		DeleteTypeIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteTypeIngredient DTIinterface = new DeleteTypeIngredient();
            }
        });
       
		FindTypeIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindTypeIngredient FTIinterface =new FindTypeIngredient();
            }
        });
       
		FindAllTypeIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllTypeIngredient FATIinterface =new FindAllTypeIngredient();
            }
        });
		
		
		/******************/
		
		CreateIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
            	CreateIngredient CIinterface = new CreateIngredient();
            }
        });
		
		UpdateIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateIngredient UIinterface = new UpdateIngredient();
            }
        });
	
		DeleteIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteIngredient DIinterface = new DeleteIngredient();
                
            }
        });
	
		FindIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindIngredient FIinterface = new FindIngredient();
            }
        });
	
		FindAllIngredient.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllIngredient FAIinterface = new FindAllIngredient();
            }
        });
		/****************************/
		
		CreateRecette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
            	CreateRecette CRinterface = new CreateRecette();
            }
        });
		
		UpdateRecette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateRecette URinterfce =new UpdateRecette();
            }
        });
		
		DeleteRecette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteRecette DRinterface = new DeleteRecette();
            }
        });
		
		FindRecette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindRecette FRinterface = new FindRecette();
            }
        });
	
		FindAllRecette.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllRecette FACinteeface = new FindAllRecette();
            }
        });
		/****************************************************/
		
		CreateComposition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
            	CreateComposition CCinterface = new CreateComposition();

            }
        });
		
		UpdateComposition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateComposition UCinterface = new UpdateComposition();
            }
        });
		
		DeleteComposition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteComposition DCinterface = new DeleteComposition();
            }
        });
		
		FindComposition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindComposition FCinterface = new FindComposition();
            }
        });
		
		FindAllComposition.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllComposition FACinterface = new FindAllComposition();
            }
        });
		/***************************/
	
		CreateProduit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {              
            	CreateProduit CPinterface = new CreateProduit();
            }
        });
	
		UpdateProduit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	UpdateProduit UPinterface = new UpdateProduit();
            }
        });
	
		DeleteProduit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	DeleteProduit DPinterface = new DeleteProduit();
            }
        });
		
		FindProduit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindProduit FPinterface = new FindProduit();
            }
        });
	
		FindAllProduit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	FindAllProduit FAPinterface = new FindAllProduit();
            }
        });
		
		/*********************/
		
		req1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete1 rq1 =new Requete1(); 	                
            }
        });
		
		req2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete2 rq2 =new Requete2(); 	                
            }
        });
		
		req3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete3 rq3 =new Requete3(); 	                
            }
        });
		
		req4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete4 rq4 =new Requete4(); 	                
            }
        });
		
		req5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete5 rq5 =new Requete5(); 	                
            }
        });
		
		req6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete6 rq6 =new Requete6(); 	                
            }
        });
		
		req7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Requete7 rq7 =new Requete7(); 	                
            }
        });
		
		
	
		
		

       
		

}

	
	
	
	

	
	
}