package model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;





public class Controller {
	
		public static void main(String[] args) {
			List<Employee> menu=new ArrayList<Employee>();
			Scanner scanner=new Scanner(System.in);
			Scanner scanner1=new Scanner(System.in);
			int choice;
			do{
				System.out.println("Menu Based choice");
				System.out.println("chose your option");
				System.out.println("1.addEmployee ");
				System.out.println("2.displayEmployee");
				System.out.println("3.searchEmployee");
				System.out.println("4.deleteEmployee");
				System.out.println("5.updateEmploye");
				System.out.println("0.exitEmploye");
				System.out.println("Enter your Menu Based choice: ");
				choice=scanner.nextInt();
			switch(choice) {
			case 1:
			System.out.print("enter empno :");
			int empno=scanner.nextInt();
			System.out.print("enter empname: ");
			String ename=scanner1.nextLine();
			System.out.print("enetr salary: ");
			int salary=scanner.nextInt();
			 menu.add(new Employee(empno,ename,salary));
			break;
			case 2:
				System.out.println("---------------------");
				Iterator<Employee> itr=menu.iterator();
				while(itr.hasNext()) {
					Employee e=itr.next();
					System.out.println(e);
				}
				System.out.println("---------------------");
				break;
			case 3:
				boolean found =false;
				System.out.print("Enter Employee Number to search: ");
				empno=scanner.nextInt();
				System.out.println("---------------------");
				itr=menu.iterator();
				while(itr.hasNext()) {
					Employee e=itr.next();
					if(e.getempno()==empno) {
						System.out.println(e);
						found=true;
					}
				}if(!found) {
					System.out.println(" Data Invalid");
				
					
				}
				System.out.println("---------------------");
				break;
			case 4:
				found =false;
				System.out.print("Enter Employee Number to Delete: ");
				empno=scanner.nextInt();
				System.out.println("---------------------");
				itr=menu.iterator();
				while(itr.hasNext()) {
					Employee e=itr.next();
					if(e.getempno()==empno) {
					itr.remove();
						found=true;
					
					}
				}if(!found) {
					System.out.println("Data Invalid");
				}else {
					System.out.println("Data is delete successfully....!");
				}
				System.out.println("---------------------");
				
				break;
			case 5:
				found =false;
				System.out.print("Enter Employee Number to update: ");
				empno=scanner.nextInt();
				System.out.println("---------------------");
				ListIterator<Employee>li=menu.listIterator();
				while(li.hasNext()) {
					Employee e=li.next();
					if(e.getempno()==empno) {
					System.out.println("Enter Updated Name: ");
					ename=scanner1.nextLine();
					System.out.println("Enter Updated Salary: ");
					salary=scanner.nextInt();
					li.set(new Employee(empno,ename,salary));
					
						found=true;
					}
				}if(!found) {
					System.out.println("Data Invalid");
				}else {
					System.out.println("Data is update successfully...!");
				}
				System.out.println("---------------------");
				
				break;
			}
			}while(choice!=0);
		
		System.out.println("you have exit the Menu");	
		}
		   

	}


