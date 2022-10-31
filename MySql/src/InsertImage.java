
import java.sql.*; 
import java.io.*; 
public class InsertImage { 
public static void main(String[] args) { 
try{ 
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "root"); 
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
ps.setString(1,"Technolamror"); 
FileInputStream fin=new FileInputStream("C:\\Screenshot (155).png"); 
ps.setBinaryStream(2,fin,fin.available()); 
int i=ps.executeUpdate(); 
System.out.println(i+" records affected"); 
con.close(); 
}catch (Exception e) {e.printStackTrace();} 
} 
}