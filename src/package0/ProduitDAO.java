package package0;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class ProduitDAO extends DAO <Produit>{ 
	
	public ProduitDAO(Connection connection) {
	    super(connection);
	}
	
	
	public boolean create(Produit obj) {
		
		
        try {
        	Date thisdate = new Date(obj.getDatePeremption());
        	SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y");
        	String myString = dateForm.format(thisdate);
        	Statement prepare = super.connection.createStatement();
        	String	req="INSERT INTO Produit (RefProduit,DescriptifProduit , DatePeremption, QuantiteProduit, PrixProduit, RefRangement, RefIngredient) VALUES ('";
            req+=obj.getRefProduit()+"','"+obj.getDescriptifProduit()+"','"+myString+"',"+obj.getQuantiteProduit()+","+obj.getPrixProduit()+",'"+obj.getRefRangement1().getRefRangement()+"','"+obj.getRefIngredient().getRefIngredient()+"')";
        	/*prepare.setString(1, obj.getDescriptifProduit());
            prepare.setDate(2, new java.sql.Date(obj.getDatePeremption().getTime()));
            prepare.setInt(3, obj.getQuantiteProduit());
            prepare.setInt(4, obj.getPrixProduit());
            prepare.setString(5, obj.getRefRangement1().getRefRangement());
            prepare.setString(6, obj.getRefIngredient().getRefIngredient());*/
            prepare.executeUpdate(req);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean delete(Produit obj) {
        try {
        	Statement prepare = super.connection.createStatement();
        	String	req="DELETE FROM Produit WHERE RefProduit ='";
        	req+=obj.getRefProduit()+"'";
            prepare.executeUpdate(req);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean update(Produit obj) {
    	Date thisdate = new Date(obj.getDatePeremption());
    	SimpleDateFormat dateForm = new SimpleDateFormat("dd/MM/Y");
    	String myString = dateForm.format(thisdate);
        try {
        	Statement prepare = super.connection.createStatement();
        	String	req="UPDATE Produit SET DescriptifProduit='";
     req+=obj.getDescriptifProduit()+"' , DatePeremption='"+myString+"', QuantiteProduit="+obj.getQuantiteProduit()+" , PrixProduit="+obj.getPrixProduit()+"  WHERE RefProduit ='"+obj.getRefProduit()+"'";
            prepare.executeUpdate(req);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

  
    public ArrayList<Produit> findAll() {
        ArrayList<Produit> listeProduit = new ArrayList<Produit>();
        try {
            PreparedStatement prepare = this.connection.prepareStatement("SELECT * FROM Produit");
            ResultSet result = prepare.executeQuery();
            while(result.next()) {
            	  Ingredient ingredient =new Ingredient();
            	  Rangement rangement=new Rangement();
            	  
                RangementDAO rangementDAO = new RangementDAO(this.connection);
                 rangement = rangementDAO.find(result.getString("RefRangement"));
                IngredientDAO ingredientDAO = new IngredientDAO(this.connection);
                ingredient = ingredientDAO.find(result.getString("RefIngredient"));
                listeProduit.add(new Produit(result.getString("RefProduit"), result.getString("DescriptifProduit"), result.getString("DatePeremption"), result.getInt("QuantiteProduit"), result.getInt("PrixProduit"), rangement, ingredient));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listeProduit;
    }


	@Override
	Produit find(String id) {
		Produit m = null;
		try {
			Statement s = this.connection.createStatement();
			String req = "SELECT * FROM Produit WHERE RefProduit='";
			req+=id+"'";
			ResultSet rs = s.executeQuery(req);
			if(rs.next()) {
				IngredientDAO l=new IngredientDAO(this.connection);
				RangementDAO l1=new RangementDAO(this.connection);
				Rangement w=l1.find(rs.getString("RefRangement"));
				Ingredient y=l.find(rs.getString("RefIngredient"));
			 m = new Produit(rs.getString("RefProduit"),rs.getString("DescriptifProduit"),rs.getString("DatePeremption"),rs.getInt("QuantiteProduit"),rs.getInt("PrixProduit"),w,y);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}
	}



