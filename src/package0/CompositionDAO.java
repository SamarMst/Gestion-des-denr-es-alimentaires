package package0;

import java.sql.*;
import java.util.ArrayList;

public class CompositionDAO extends DAO <Composition>{
	
	 public CompositionDAO(Connection connection) {
	        super(connection);
	    }
	 
	 public boolean create(Composition obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        String req="INSERT INTO Composition (RefComposition,QuantiteComposition, RefRecette, RefIngredient) VALUES (";
	       req+=Integer.parseInt(obj.getRefComposition())+","+obj.getQuantiteComposition()+",'"+obj.getRefRec().getRefRecette()+"','"+obj.getRefIngredient().getRefIngredient()+"')";
	       prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 public boolean delete(Composition obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
		        String req= "DELETE FROM Composition WHERE RefComposition=";
		        req+=Integer.parseInt(obj.getRefComposition());
	           // prepare.setString(1, obj.getRefComposition());
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 public boolean update(Composition obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
		        String req= "UPDATE Composition SET QuantiteComposition =";
		        req+=obj.getQuantiteComposition()+" WHERE RefComposition ='"+obj.getRefComposition()+"'";

	           /* prepare.setInt(1, obj.getQuantiteComposition());
	            prepare.setString(2, obj.getRefRec().getRefRecette());
	            prepare.setString(3, obj.getRefIngredient().getRefIngredient());
	            prepare.setString(4, obj.getRefComposition());*/
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 
	 
	 
	 public Composition find(String id) {
		 Composition c =null;
	        try {
	        	Statement prepare = super.connection.createStatement();
	          int a=Integer.parseInt(id);
	            String req="SELECT * FROM Composition WHERE RefComposition=";
	            req+=a;
	            ResultSet result = prepare.executeQuery(req);
	            if(result.next()) {
	                RecetteDAO recetteDAO = new RecetteDAO(this.connection);
	                Recette recette = recetteDAO.find(result.getString("RefRecette"));
	                IngredientDAO ingredientDAO = new IngredientDAO(this.connection);
	                Ingredient ingredient = ingredientDAO.find(result.getString("RefIngredient"));
	                c= new Composition(result.getString("RefComposition"), result.getInt("QuantiteComposition"), recette, ingredient);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return c;
	    }

	 public ArrayList<Composition> findAll() {
		    ArrayList<Composition> compositions = new ArrayList<>();
		    try {
		        Statement stmt = super.connection.createStatement();
		        ResultSet rs = stmt.executeQuery("SELECT * FROM composition");
		        while (rs.next()) {
		        
		        	int quantiteComposition = rs.getInt("QuantiteComposition");
		        	String refRecetteId = rs.getString("RefRecette");
		            RecetteDAO recetteDAO = new RecetteDAO(connection);
		            Recette refRecette = recetteDAO.find(refRecetteId);
		            String refIngredientId = rs.getString("RefIngredient");
		            IngredientDAO ingredientDAO = new IngredientDAO(connection);
		            Ingredient refIngredient = ingredientDAO.find(refIngredientId);
		            Composition composition = new Composition(rs.getString("RefComposition"), quantiteComposition, refRecette, refIngredient);
		            compositions.add(composition);
		        }
		    } catch (SQLException e) {
		        System.err.println("Error getting all compositions: " + e.getMessage());
		    }
		    return compositions;
		}
}

		