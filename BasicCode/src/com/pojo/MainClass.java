package com.pojo;



public class MainClass {
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setName("ali");
		obj.setId("A101");
		obj.setSal(10000);
		System.out.println("Name:"+obj.getName());
		System.out.println("id:"+obj.getId());
		System.out.println("salary:"+obj.getSal());
		
	}
  
}
