package com.java.employee;
import java.sql.*;

public class UsersManager {

	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="root";
		
		try {
	     
	        Connection connection = DriverManager.getConnection(jdbcURL,username,password);
	        System.out.println("connection success : "+connection);
	        String sql="INSERT INTO users (username,email,fullname,password)"
	        		+"VALUES ('namhn','nam@code.net','nam ha minha','mysecret')";
	        Statement statment =connection.createStatement();
	        int rows=statment.executeUpdate(sql);
	        
				//int rows =Statement.executeUpdate(sql);
				if(rows>0) {
					System.out.println("A new user has been inserted successfully :) ");
				}
	        connection.close();

				
					
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
	    
		}

	}


