package package0;

import java.sql.*;
import java.util.ArrayList;

public class RangementDAO extends DAO<Rangement> {

    public RangementDAO(Connection connection) {
        super(connection);
    }

    public boolean create(Rangement obj) {
        try {
        	
        	Statement prepare = super.connection.createStatement();
        	String	req="INSERT INTO Rangement (RefRangement, NomRangement) VALUES ('";
            req+=obj.getRefRangement()+"','"+obj.getNomRangement()+"')";
        	/*prepare.setString(1, obj.getRefRangement());
            prepare.setString(2, obj.getNomRangement());*/
            prepare.executeUpdate(req);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean delete(Rangement obj) {
        try {
        	Statement prepare = super.connection.createStatement();
        	String	req="DELETE FROM Rangement WHERE RefRangement ='";
        	req+=obj.getRefRangement()+"'";
           // prepare.setString(1, obj.getRefRangement());
            prepare.executeUpdate(req);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean update(Rangement obj) {
        try {
        	Statement prepare = super.connection.createStatement();
        	String	req="UPDATE Rangement SET NomRangement ='";
        	req+=obj.getNomRangement()+"' WHERE RefRangement ='"+obj.getRefRangement()+"'";
           /* prepare.setString(2, obj.getRefRangement());
            prepare.setString(1, obj.getNomRangement());*/
            prepare.executeUpdate(req);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public Rangement find(String id) {
    	Rangement m = null;
        try {
          Statement prepare = super.connection.createStatement();
          String req="SELECT * FROM Rangement WHERE refRangement =";
          req+="'"+id+"'";
            ResultSet result = prepare.executeQuery(req);
            if(result.next()) {
                m = new Rangement(result.getString("RefRangement"), result.getString("NomRangement"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return m;
    }
    
    public ArrayList<Rangement> findAll() {
        ArrayList<Rangement> listeRangement = new ArrayList<Rangement>();
        try {
            Statement prepare = super.connection.createStatement();
            String req ="SELECT * FROM Rangement";
            ResultSet result = prepare.executeQuery(req);
            while(result.next()) {
                listeRangement.add(new Rangement(result.getString("RefRangement"), result.getString("NomRangement")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listeRangement;
    }

}