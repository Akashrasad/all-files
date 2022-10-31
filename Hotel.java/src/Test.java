




import java.util.*;


class Employee2{
	
	private int empno;
	private String ename;
	private int salary;
	//int total;
	Employee2(int empno,String ename, int salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
	//
		
	}
	public int getempno() {
		return empno;
	}
	public String getename() {
		return ename;
	}
	public int getsalary() {
		return salary;
	}
//	public int gettotal() {
//		return total;
//	}
	public String toString() {
		return empno+" "+ename+" "+salary;
	}
}

public class Test {
	public static void main(String[] args) {
		List<Employee2> c=new ArrayList<Employee2>();
		Scanner scanner=new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
	double total;
		
				int ch;
		do{
			System.out.println("1st floor Electronics ");
			System.out.println("2nd floor Bath ");
			System.out.println("3rd floor Kitchen ");
			System.out.println("4th floor Cloths");
			System.out.println("5th floor others ");
		
			System.out.println("1.Insert a product");
			System.out.println("2.Display a product");
			System.out.println("3.Search a product");
			System.out.println("4.Delete a product");
			System.out.println("5.Update a product");
			System.out.println("Enter your choice: ");
			ch=scanner.nextInt();
//			String subtotal;
//		String overAllPrice;
//		int quantity;
//		String totalPrice;
		//ch=scanner1.nextString();
		switch(ch) {
		case 1:
		System.out.print("enter product ID :");
		int empno=scanner.nextInt();
		System.out.print("enter product Description: ");
		String ename=scanner1.nextLine();
		System.out.print("enter product cost: ");
		int salary=scanner.nextInt();
		total=salary;
//		amount=salary*100;
//		System.out.println(amount);
//		 
		c.add(new Employee2(empno,ename,salary));
		break;
		case 2:
			//using iterator
			System.out.println("---------------------");
			Iterator<Employee2> i=c.iterator();
			while(i.hasNext()) {
				Employee2 e=i.next();
				
				System.out.println(e);
			}
			System.out.println("this your bill generated");
			System.out.println("*Note: 1000 Items are available in stock ");
			System.out.println("* Note: Not more than 2 same product will be Billed");
			System.out.println("---------------------");
			
			break;
		case 3:
			boolean found =false;
			System.out.print("enter product ID to search: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee2 e=i.next();
				if(e.getempno()==empno) {
					System.out.println(e);
					found=true;
				}
			}if(!found) {
				System.out.println("record not found");
			
				
			}
			
			System.out.println("---------------------");
			
			break;
		case 4:
			found =false;
			System.out.print("enter product ID to delete: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee2 e=i.next();
				if(e.getempno()==empno) {
				i.remove();
					found=true;
				
				}
			}if(!found) {
				System.out.println("record not found");
			}else {
				System.out.println("record is delete successfully......!");
			}
			System.out.println("---------------------");
			
			break;
		case 5:
			found =false;
			System.out.print("enter product ID to update: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			ListIterator<Employee2>li=c.listIterator();
			while(li.hasNext()) {
				Employee2 e=li.next();
				if(e.getempno()==empno) {
				System.out.println("enter new Product Desciption: ");
				ename=scanner1.nextLine();
				System.out.println("enter new product Cost: ");
				salary=scanner.nextInt();
				li.set(new Employee2(empno,ename,salary));
				
					found=true;
				
				
				}
			}if(!found) {
				System.out.println("record not found");
			}else {
				System.out.println("record is update successfully......!");
			}
			System.out.println("---------------------");
			
			break;

		}
     
		}while(ch!=0);
		
		
		System.out.println("total bill of the customer");
		System.out.println("enter 1 to display the bill of customer");
//		 public void display()   
//         {  
//             System.out.format("   %-9s             %-9s      %5d               %9.2f                       %14.2f\n" ,id, pname, qty, price, totalPrice);
//
//         }

		double amt=0,b=0;

	  int f = scanner.nextInt();
      int m=f*1000;
      amt=amt+m;
      System.out.println(amt);
 System.out.println("Total Amount (Rs.) " +amt);  

  System.out.println("Invoice Total " +(amt));  
  System.out.println("Thank You for Shopping!!");  

	    System.out.println("Visit Again");  

		
	}
	   

}