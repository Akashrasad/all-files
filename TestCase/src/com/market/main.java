package com.market;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {
private static String readLine() {
  //because I want to use readLine...
  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
  try {
    return stdin.readLine();
  } catch (Exception e) {
    System.out.println("Invalid Input");
  }
  return null;
}

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
