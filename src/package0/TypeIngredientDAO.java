package package0;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TypeIngredientDAO  extends DAO <TypeIngredient> {
	
	
	 public TypeIngredientDAO(Connection connection) {
	        super(connection);
	    }

	    
	    public boolean create(TypeIngredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="INSERT INTO TypeIngredient (RefType, NomType) VALUES ('";
	        	req+=obj.getRefType()+"','"+obj.getNomType()+"')";
	            /*prepare.setString(1, obj.getRefType());
	            prepare.setString(2, obj.getNomType());*/
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    
	    public boolean delete(TypeIngredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="DELETE FROM TypeIngredient WHERE RefType ='";
	        	req+=obj.getRefType()+"'";
	            //prepare.setString(1, obj.getRefType());
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    @Override
	    public boolean update(TypeIngredient obj) {
	        try {
	        	Statement prepare = super.connection.createStatement();
	        	String	req="UPDATE TypeIngredient SET NomType ='";
	        			req+=obj.getNomType()+"' WHERE RefType ='"+obj.getRefType()+"'";
	            //prepare.setString(1, obj.getNomType());
	            //prepare.setString(2, obj.getRefType());
	            prepare.executeUpdate(req);
	            return true;
	         } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
}
	    
	 
	    
	    public ArrayList<TypeIngredient> findAll() {
	        ArrayList<TypeIngredient> listeTypeIngredient = new ArrayList<TypeIngredient>();
	        try {
	           Statement prepare = super.connection.createStatement();
	           String req = "SELECT * FROM TypeIngredient";
	            ResultSet result = prepare.executeQuery(req);
	            while(result.next()) {
	            	listeTypeIngredient.add(new TypeIngredient(result.getString("RefType"), result.getString("NomType")));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return listeTypeIngredient;
	    }


		@Override
		public TypeIngredient find(String id) {
			TypeIngredient m = null;
			
		 		try {
		 			//Statement s = this.connection.createStatement();
		        Statement prepare = super.connection.createStatement();
		        String req="SELECT * FROM TypeIngredient WHERE RefType=";
		        req+="'"+id+"'";
		           
		            ResultSet result = prepare.executeQuery(req);

		 			if(result.next())

	                {m = new TypeIngredient(result.getString("RefType"), result.getString("NomType"));
	                }
		 		} catch (SQLException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		       return m;
		}
	    
		
	    
	    
	    	    
	    
	    
	    
	    
}
