package package0;
import java.sql.*;
import java.util.*;
public abstract class DAO <T> {
	Connection connection = null;
	public DAO(Connection c) {
		connection=c;
	}
	abstract boolean create(T obj);
	abstract boolean update(T obj);
	abstract boolean delete(T obj);
	abstract ArrayList findAll() throws SQLException;
	abstract T find(String id);

}
