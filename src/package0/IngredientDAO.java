package package0;

import java.sql.*;
import java.util.ArrayList;

public class IngredientDAO  extends DAO <Ingredient> { 
	
	 public IngredientDAO(Connection connection) {
	        super(connection);
	    }

	    public boolean create(Ingredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="INSERT INTO Ingredient (RefIngredient, NomIngredient, RefType) VALUES ('";
	        	req+=obj.getRefIngredient()+"' , '"+obj.getNomIngredient()+"' , '"+obj.getRefType().getRefType()+"')";
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    public boolean delete(Ingredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="DELETE FROM Ingredient WHERE RefIngredient ='";
	        	req+=obj.getRefIngredient()+"'";
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    public boolean update(Ingredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="UPDATE Ingredient SET NomIngredient ='";
	        			req+=obj.getNomIngredient()+"', RefType ='"+obj.getRefType().getRefType()+"' WHERE RefIngredient ='"+obj.getRefIngredient()+"'";
	            /*prepare.setString(1, obj.getNomIngredient());
	            prepare.setString(2, obj.getRefType().getRefType());
	            prepare.setString(3, obj.getRefIngredient());*/
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	   
	    public ArrayList<Ingredient> findAll() {
	        ArrayList<Ingredient> listeIngredient = new ArrayList<Ingredient>();
	        try {
	           Statement prepare = super.connection.createStatement();
	           String req ="SELECT * FROM Ingredient";
	            ResultSet result = prepare.executeQuery(req);
	            while(result.next()) {
	                TypeIngredientDAO typeDAO = new TypeIngredientDAO(this.connection);
	                TypeIngredient type = typeDAO.find(result.getString("RefType"));
	                listeIngredient.add(new Ingredient(result.getString("RefIngredient"), result.getString("NomIngredient"), type));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return listeIngredient;
	    }

	    @Override
		Ingredient find(String id) {
			Ingredient m=null ;
			try {
				Statement s = super.connection.createStatement();
				String req = "SELECT * FROM Ingredient WHERE RefIngredient='";
				req+=id+"'";
				ResultSet rs = s.executeQuery(req);
				if(rs.next()) {
					TypeIngredientDAO ingredientDAO = new TypeIngredientDAO(this.connection);
                TypeIngredient ingredient = ingredientDAO.find(rs.getString("RefType"));
			
				m = new Ingredient(rs.getString("RefIngredient"),rs.getString("NomIngredient"),ingredient);
			
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return m;
		}


	  
}
