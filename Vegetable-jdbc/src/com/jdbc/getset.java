package com.jdbc;

public class getset {
	int id;
	String name;
	int quantity;
	int price;
	int total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public static void displayFormat()   
    {  
        System.out.println("\n     Welcome to Mart shopping");
        System.out.print("\nProduct ID \t\tName\t\tquantity\t\t \t\t\t\tprice\ttotal\n");  
         
    }  
        
    public void display()   
    {  
        System.out.format("   %-9s             %-9s      %5d               %9.2s                       %14.2s\n" ,id, name, quantity, price,total);  
    }  
}
