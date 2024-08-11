package package0;
import java.sql.*;
public class DBMSConnection {
	private static String url ="jdbc:oracle:thin:@localhost:1521:xe";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String user = "SQ";
	private static String password = "samar";
	public static Connection getConnection() throws ClassNotFoundException{
    Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println("Erreur Connexion");
        }catch (ClassNotFoundException ex) {
        	System.out.println("Erreur Connexion");
        }
        return connection;
    }
	
	

}
