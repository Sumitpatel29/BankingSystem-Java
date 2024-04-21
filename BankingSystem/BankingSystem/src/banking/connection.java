package banking;

import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class connection
{
	static Connection con; // Global Connection Object
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); ///load and register jdbc driver
			String url= "jdbc:mysql://localhost:3306?user=root&password=admin"; //mysql url
			con = DriverManager.getConnection(url);
		}
		catch (Exception e)
		{
			System.out.println("Connection Failed!");
		}
		return con;
	}
}

