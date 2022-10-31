package com.jdbc;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class veg 
{
	

    public static void main(String[] args)
    {
    
    	
    	ArrayList<getset>arrayList=new ArrayList();
    	
    	//System.out.println("id \t name\t quantity\t price");  
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //use System.out.println("Driver Found");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vegetables", "root", "root");
        Statement statement=connection.createStatement();
        ResultSet set=statement.executeQuery("SELECT * FROM vegetables.bill");
        //System.out.println("connection success : "+connection);

        while(set.next())
        {
            getset e=new getset();
             
             e.setName(set.getString(2));
             e.setId(set.getInt(1));
             e.setPrice(set.getInt(3));
             e.setQuantity(set.getInt(4));
             e.setTotal(set.getInt(5));
            arrayList.add(e);
        }
        getset.displayFormat();  
        for (getset p : arrayList)   
        {  
          p.display();  
        }  
//        for(getset e:arrayList)
//        {
//        	
//            System.out.println(e.getId()+" "+e.getName()+" "+e.getPrice()+" "+e.getQuantity()+" "+e.getTotal());
//        }
        
    } catch (Exception e) {
        System.out.println(e);
  }
    }

	
}

