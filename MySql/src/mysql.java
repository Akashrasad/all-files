


import java.sql.Connection;
import java.sql.DriverManager;



public class mysql {
    public static void main(String[] args) {
        
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Found");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "root");
        System.out.println("connection success : "+connection);
    } catch (Exception e) {
        System.out.println(e);
  }
    }
}