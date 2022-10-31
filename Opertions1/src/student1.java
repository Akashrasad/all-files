



import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class student1{
    public static void main(String[] args)
    {
       
           
           int total[] = new int[6];
            String name[] = new String[6];
            int i =0;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
//              System.out.println("Driver Found");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/1111", "root", "root");
//              System.out.println("connection success : "+connection);
                Statement statement = (Statement) connection.createStatement();
                 ResultSet rs =  ((java.sql.Statement) statement).executeQuery("select * from new_table ");
                 while(rs.next())
                 {
                     name[i]=rs.getString(2);
                     total[i]=rs.getInt(3)+rs.getInt(4)+rs.getInt(5);
                     System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
                     i++;
                 }
      connection.close();
            }
            catch (Exception e) {
                System.out.println(e);

            }

           }
}
