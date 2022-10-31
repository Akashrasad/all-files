package com.Basic.Code;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test {

	public static void main(String[] args) {
		// TODO Auto-gene rated method stub
		try {
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_info", "root", "root");
			System.out.println("connection to the database successfully");
			PreparedStatement preparedStatement=connection.prepareStatement("update student set dept=? where rollno=?");
//			preparedStatement.setNString(1, "1");
//			preparedStatement.setNString(2, "mehtab");
//			preparedStatement.setNString(3, "computer");
//			
			preparedStatement.setString(1, "physics");
			preparedStatement.setString(2, "1");
			preparedStatement.executeUpdate();
			System.out.println("data updated successfully");

	}catch(Exception e) {
		System.out.println("error while connecting to the database");
	}

	}
}
