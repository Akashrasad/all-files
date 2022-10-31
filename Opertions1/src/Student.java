import java.sql.Connection;
import java.sql.DriverManager;
import  java.sql.ResultSet;
import java.sql.Statement;
public class Student {

	public static void main(String[] args) {
		int total[]=new int[6];
		String name[]=new String[6];
		int i=0;
		try
		{
			class.forName("com.mysql.cj.jdbc.Driver"):
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_table","root","root");
			Statement statment=connection.createStatement();
		ResultSet rs=statment.executeQuery("select * from java");
		while(rs.next())
		{
			name[i]=rs.getString(2);
			total[i]=rs.getInt(3)+rs.getInt(4)+rs.getInt(5)+rs.getInt(6);
			System.out.println(rs.getInt(1)+rs.getInt(3)+rs.getInt(3)+rs.getInt(4)+rs.getInt(5)+rs.getInt(6));
		}
		}

	}

}
