package polling;
import java.sql.*;
public class PollingConnection {
		
	public static java.sql.Connection con;
	
	public static Connection pollConnect() {
		try {
			
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/polling","root","root");
			
		}

	    catch (Exception e)
	    {
	    	e.printStackTrace();
	    }
		return  (Connection) con;}
}
