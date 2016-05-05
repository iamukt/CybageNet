package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Database
{
	Connection con;
	public Database() throws ClassNotFoundException, SQLException
	{
		String driver, url, username, password;
		// JDBC properties taken from resource.properties
		// This makes the program to be loosely coupled with the database
		// Driver and credential details can be given in resouce.properties
		ResourceBundle rb = ResourceBundle
				.getBundle("resource");
		driver = rb.getString("driver");
		url = rb.getString("url");
		username = rb.getString("username");
		password = rb.getString("password");
		// Locate and load the driver
		Class.forName(driver);
		// Connection created
		con = DriverManager.getConnection(url, username, password);
	}
	/**
	 * @return the con
	 */
	public Connection getCon()
	{
		return con;
	}
	/**
	 * @param con the con to set
	 */
	public void setCon(Connection con)
	{
		this.con = con;
	}
	
}
