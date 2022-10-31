package col.itr.obj;

import java.util.Scanner;
import java.util.TreeSet;

public class set {
	public static void main(String[] args) {
	//	TreeSet<String> se=new TreeSet<>();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value");
		String name=sc.next();
		
	//sc.next();
	int age=sc.nextInt();
	
	//sc.nextInt();
	char gender=sc.next().charAt(0);
	//sc.next().charAt(0);
	long phone=sc.nextLong();
	//sc.nextLong();
	
//		
//		se.add("hi");
//		se.add("hello");
//		se.add("good");
//		se.add("night");
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("gendar"+gender);
		System.out.println("phone number :"+phone);
			
	}

}
