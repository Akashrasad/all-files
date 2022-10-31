
package com.Test.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class Employeeservice2 implements Employeedao  {



   public void displayEmployee(Employee employee) {
    
    }



   public void addEmployee(Employee employee) {
        
            ArrayList<Employee>plarrayList=new ArrayList<Employee>();
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("1");
                Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
                Statement statement=connection.createStatement();
                String query="insert into service(`name`,`password`) values('"+employee.getName()+"','"+employee.getPassword() +"')";
                 statement.executeUpdate(query);
                 System.out.println("data inserted successfully");
       
            }catch(Exception e) {
                e.printStackTrace();
            }// TODO Auto-generated method stub
        
    }




   public void updateEmployee() {
        // TODO Auto-generated method stub
        
    }



   public void deEmployee() {
        // TODO Auto-generated method stub
        
   }
}