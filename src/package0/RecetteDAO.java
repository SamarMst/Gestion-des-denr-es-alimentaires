package package0;

import java.sql.*;
import java.util.ArrayList;

public class RecetteDAO  extends DAO <Recette> {
	public RecetteDAO(Connection connection) {
        super(connection);
    }
	
	public boolean create(Recette obj) {
	    try {
	        Statement prepare = super.connection.createStatement();
	           String req= "INSERT INTO RECETTE (RefRecette, NomRecette, DescriptifRecette , CaloriesRecette,  Difficulte, TempsPreparation, TempsCuisson, NbPersonnes)  VALUES ('";
	        req+=obj.getRefRecette()+"','"+obj.getNomRecette()+"','"+obj.getDescriptifRecette()+"',"+String.valueOf(obj.getCaloriesRecette())+",'"+obj.getDifficulte()+"',"+String.valueOf(obj.getTempsCuisson())+","+String.valueOf(obj.getTempsPreparation())+","+String.valueOf(obj.getNbPersonnes())+")";
	       
	        
	        	        prepare.executeUpdate(req);
	        return true;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

	 public boolean delete(Recette obj) {
	        try {
	            Statement prepare = super.connection.createStatement();
	           String req="DELETE FROM Recette WHERE RefRecette ='";
	           req+=obj.getRefRecette()+"'";
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 public boolean update(Recette obj) {
	        try {
	           Statement prepare = super.connection.createStatement();
	         String req=  "UPDATE Recette SET  NbPersonnes=";
	         		req+=String.valueOf(obj.getNbPersonnes())+", CaloriesRecette="+String.valueOf(obj.getCaloriesRecette())+", NomRecette='"+obj.getNomRecette()+"', TempsCuisson="+String.valueOf(obj.getTempsCuisson())+", TempsPreparation="+String.valueOf(obj.getTempsPreparation())+", Difficulte='"+obj.getDifficulte()+"', DescriptifRecette='"+obj.getDescriptifRecette()+"' WHERE RefRecette='"+obj.getRefRecette()+"'";
	          
	            prepare.executeUpdate(req);
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	 
	 @Override
		Recette find(String id) {
			Recette m = null;
			try {
				Statement s = super.connection.createStatement();
				String req = "SELECT * FROM Recette WHERE RefRecette=";
				req+="'"+id+"'";
				ResultSet rs = s.executeQuery(req);
				if(rs.next()) {
				m = new Recette(rs.getString("RefRecette"),rs.getString("NomRecette"),rs.getString("DescriptifRecette"),rs.getInt("CaloriesRecette"),rs.getString("Difficulte"),rs.getFloat("TempsPreparation"),rs.getFloat("TempsCuisson"),rs.getInt("NbPersonnes"));}
			} catch (SQLException e) {
				// TODO Auto-generated catch blockString 
				e.printStackTrace();
			}
			return m;
		}

	 public ArrayList<Recette> findAll() {
		    ArrayList<Recette> listeRecette = new ArrayList<Recette>();
		    try {
		        Statement prepare = super.connection.createStatement();
		        String req = "SELECT * FROM Recette";
		        ResultSet result = prepare.executeQuery(req);
		        while(result.next()) {
		        	Recette a=new Recette(result.getString("RefRecette"),result.getString("NomRecette"), result.getString("DescriptifRecette"), result.getInt("CaloriesRecette"), result.getString("Difficulte"), result.getFloat("TempsCuisson"), result.getFloat("TempsPreparation"), result.getInt("NbPersonnes"));
		            listeRecette.add(a);
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		    return listeRecette;
		}
	
}