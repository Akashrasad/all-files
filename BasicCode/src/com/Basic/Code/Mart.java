package com.Basic.Code;
import java.util.*;

import com.mysql.cj.xdevapi.Result;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class details{
	private int id;
	private String name;
	private int price;
	private int qty;
	 int totalprice;
	details(int id,String name, int price,int qty){
		this.id=id;
		this.name=name;
		this.price=price;
		this.qty=qty;
		//this.totalprice;
		
	}
	public details(int id2, String name2, int price2, int qty2, int totalprice2) {
		// TODO Auto-generated constructor stub
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getprice() {
		return price;
	}
	public int getqty() {
		return qty;
	}
	public int gettotalprice() {
		return totalprice;
	}
	public String toString() {
		return id+" "+name+" "+price+""+qty+" "+totalprice;
	}
	public static void displayFormat()   
    {  
        
        System.out.print("\nProduct ID \t\tName\t\tQuantity\t\tRate \t\t\t\tTotal Price\n");  
         
    }  
        
    public void display()   
    {  
        System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, name, qty, price, totalprice);  
    }  
}


public class Mart {
    public static void main(String[] args) {
    	List<details> c=new ArrayList<details>();
    	 List<Product> product = new ArrayList<Product>();  
		Scanner scanner=new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
		
//		  String id = null;  
//          String productName = null;  
//          int quantity = 0;  
        //  double price = 0.0;  
         // double totalPrice = 0.0;  
       //   double overAllPrice = 0.0;  
          double subtotal=0.0;  
	
		
				int ch;
				  char choice = '\0'; 
			
					do{
						System.out.println("1.insert ");
						System.out.println("2.display");
						System.out.println("3.search");
						System.out.println("0.billing");

						System.out.println("Enter your choice: ");
						ch=scanner.nextInt();
//					int totalprice=qty*price;
					switch(ch) {
					case 1:
					System.out.print("enter product id :");
					int id=scanner.nextInt();
					System.out.print("enter product name: ");
					String name=scanner1.nextLine();
					System.out.print("enetr product price : ");
					int price=scanner.nextInt();
					System.out.print("enter quantity of the product : ");
					int qty=scanner.nextInt();
					System.out.print("enter total product price : ");
					int totalPrice=scanner.nextInt();
					c.add(new details(id,name,price,qty,totalPrice));
					totalPrice=qty*price;
					  // totalPrice = price * qty;  
				
					break;
				
					case 2:
						//using iterator
						//int totalprice=qty*price;
						System.out.println("---------------------");
						Iterator<details> i=c.iterator();
						while(i.hasNext()) {
							details e=i.next();
							System.out.println(e);
						}
						System.out.println("---------------------");
						
						break;
					case 3:
						boolean found =false;
						System.out.print("enter id to search: ");
						id=scanner.nextInt();
						System.out.println("---------------------");
						i=c.iterator();
						while(i.hasNext()) {
							details e=i.next();
							if(e.getid()==id) {
								System.out.println(e);
								found=true;
							}
						}if(!found) {
							System.out.println("record not found");
						
							
						}
						System.out.println("---------------------");
						
						break;
					}
					
//					totalPrice=qty*price;
//					   totalPrice = price * qty;  
	                      
                   // overAllPrice = overAllPrice + totalPrice;  
                   
               //     product.add( new Product(id, name, qty, price, totalPrice) );  
				
					  System.out.print("Want to add more items? (y or n): ");  
                      
                      choice = scanner.next().charAt(0);  
                      
                      scanner.nextLine();  
					
				
					}
     while (choice == 'y' || choice == 'Y');  
		               
	                Product.displayFormat();  
	                for (Product p: product)   
	                {  
	                    p.display();  
	                }  
	                
	               // System.out.println("Total Amount (Rs.) " +overAllPrice);  
	                
	               
	                
	                System.out.println("Subtotal "+subtotal);  
	               
	                
	                System.out.println("Invoice Total " +(subtotal));  
	                System.out.println("Thank You for Shopping!!");  
	                System.out.println("Visit Again");  
	                
	                scanner.close();  
//    
//		while(rs.next())
//		{
//			name[i]=rs.getString(2);
//			Object[] total;
//			total[i]=rs.getInt(1)+rs.getInt(3)+rs.getInt(3)+rs.getInt(4);
//			System.out.println(rs.getInt(1)+rs.getInt(3)+rs.getInt(3)+rs.getInt(4));
//		}
//    
//}
//					}
					}
    
					}
				


    
