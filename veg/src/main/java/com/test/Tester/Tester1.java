package com.test.Tester;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.collection.collector.Student1;

public class Tester1 {

	public static void main(String[] args) {
		ArrayList<Student1> arrayList= new ArrayList();
		
		try {
			
			    
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        System.out.println("Driver Found");
		        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/market", "root", "root");
		      
		        Statement statement=connection.createStatement();
		        ResultSet set=statement.executeQuery("select * from student.student");
while(set.next())
{
	Student1 student=new Student1(set.getInt(1),set.getString(2),set.getString(3),set.getInt(4));
//	student.setId(set.getInt(1));
//	student.setName(set.getString(2));
//    student.setAdress(set.getString(3));
//    student.setZip(set.getInt(4));
   
    
	arrayList.add(student);
	
}
for(Student1 e:arrayList)
{
	System.out.println(e.getId()+" "+e.getName()+" "+e.getAdress()+" "+e.getZip());
}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
