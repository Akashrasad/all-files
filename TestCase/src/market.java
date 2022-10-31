import java.sql.Connection;
import java.sql.DriverManager;

public class market {

	public static void main(String[] args) throws Exception {
		getConnection();
	

	}
	public static Connection getConnection() throws Exception{
		try {
			String driver="com.mysql.cj.jdbc.Driver";
			String jdbc="jdbc:mysql://localhost:3306/market";
			String username="root";
			String password="root";
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(jdbc,username,password);
			System.out.println("Connection");
			return conn;
			
			
		}
		catch(Exception e) 
		{
			System.out.println(e);
		}
		
			
	
	
		
		return null;
	}
	
		
	}


