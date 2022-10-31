package com.Test.employee;


import java.util.*;
public class Employeeprovider {
	public static void addData(){


   
        Scanner sc=new Scanner(System.in);
        Employee employee=new Employee();
        System.out.println("enter the name and password");
        employee.setName(sc.next());
        employee.setPassword(sc.next());
        
        Employeeservice2 service = new Employeeservice2();
        service.addEmployee(employee);
        
        

	}

   
public static void main(String[] args) {
	Employeeprovider.addData();



}
}