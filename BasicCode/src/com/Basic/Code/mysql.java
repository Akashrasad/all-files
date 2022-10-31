package com.Basic.Code;
import java.util.*;
import java.sql.*;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.util.ArrayList;  
import java.util.List;  
import java.util.Scanner;  
class Product1 
    {  
        
         String id;  
         String pname;  
         int qty;  
         double price;  
        double totalPrice;  
           
       
        Product1(String id, String pname, int qty, double price, double totalPrice)   
        {  
            this.id=id;  
            this.pname = pname;  
            this.qty = qty;  
            this.price = price;  
            this.totalPrice = totalPrice;  
        }  
            
            public String getId()   
                {  
                    return id;  
                }  
                public String getPname()   
                {  
                    return pname;  
                }  
                public int getQty()   
                {  
                    return qty;  
                }  
                public double getPrice()   
                {  
                    return price;  
                }  
                public double getTotalPrice()   
                {  
                    return totalPrice;  
                }  
                 
                public static void displayFormat()   
                {  
                    
                    System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
                     
                }  
                    
                public void display()   
                {  
                    System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qty, price, totalPrice);  
                }  
    } 



public class mysql {
	

	public static void main(String[] args) {
		String id2=" ";
		 String pname2=" ";
		 int qty2=0;
		 double price2=0;
		 double c2=0;
		Product1 p=new Product1( id2,  pname2,  qty2,  price2,  c2);
		Scanner sc=new Scanner(System.in);
		  try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		       // System.out.println("Driver Found");
		        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info", "root", "root");
		        Statement statement=connection.createStatement();
		        System.out.println(" enter id");
		        
		        
		        String id=sc.next();
		        id=id2;
		        System.out.println("enter name:");
		        String p1=sc.next();
		        System.out.println("enter quantity:");
		        int q=sc.nextInt();
		        System.out.println("enter the price:");
		        double pr=sc.nextDouble();
		        System.out.println("enter the total price:");
		        double tot=sc.nextDouble();
		       
		        pname2=p1;
		        qty2=q;
		        price2=pr;
		        c2=tot;
		        
		        ResultSet rs=statement.executeQuery("select * from cashier where id ="+id);
		      //  int result=Resultset.update();
		       // String sqlString="select * from cashier where id=104";
		       // System.out.println("connection success : "+connection);
		      //  System.out.println("connection success : "+rs);
		        
		        while (rs.next()) {
		            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getInt(6));
		            
		        }
		    } catch (Exception e) {
		        System.out.println(e);
		  }

	}

}
