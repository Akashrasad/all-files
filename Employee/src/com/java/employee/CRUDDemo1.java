package com.java.employee;
import java.util.*;

class Employee1{
	private int empno;
	private String ename;
	private int salary;
	Employee1(int empno,String ename, int salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;
		
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
	public String toString() {
		return empno+" "+ename+" "+salary;
	}
}

public class CRUDDemo1 {
	public static void main(String[] args) {
		List<Employee1> c=new ArrayList<Employee1>();
		Scanner scanner=new Scanner(System.in);
		Scanner scanner1=new Scanner(System.in);
		
				int ch;
		do{
			System.out.println("1.insert ");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4.delete");
			System.out.println("5.update");
			System.out.println("Enter your choice: ");
			ch=scanner.nextInt();
			//ch=scanner1.nextString();
		switch(ch) {
		case 1:
		System.out.print("enter empno :");
		int empno=scanner.nextInt();
		System.out.print("enter empname: ");
		String ename=scanner1.nextLine();
		System.out.print("enetr salary: ");
		int salary=scanner.nextInt();
		 
		c.add(new Employee1(empno,ename,salary));
		break;
		case 2:
			//using iterator
			System.out.println("---------------------");
			Iterator<Employee1> i=c.iterator();
			while(i.hasNext()) {
				Employee1 e=i.next();
				System.out.println(e);
			}
			System.out.println("---------------------");
			
			break;
		case 3:
			boolean found =false;
			System.out.print("enter empno to search: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee1 e=i.next();
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
			System.out.print("enter empno to delete: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			i=c.iterator();
			while(i.hasNext()) {
				Employee1 e=i.next();
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
			System.out.print("enter empno to update: ");
			empno=scanner.nextInt();
			System.out.println("---------------------");
			ListIterator<Employee1>li=c.listIterator();
			while(li.hasNext()) {
				Employee1 e=li.next();
				if(e.getempno()==empno) {
				System.out.println("enter new name: ");
				ename=scanner1.nextLine();
				System.out.println("enter new salary: ");
				salary=scanner.nextInt();
				li.set(new Employee1(empno,ename,salary));
				
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
	
		
	}
	   

}