package people.tech;

import java.util.Scanner;

public class Firstday {

	public  void main()
	{
		int count=0;
		System.out.println("\nDivided by 3: ");		
		for (int i=20; i<40; i++) {
			if (i%3==0) { 
			System.out.print(i +", ");	
			count++;
			
			}
			
		}
		System.out.println(count);
		count=0;
				
		System.out.println("\n\nDivided by 4: ");
		for (int i=20; i<40; i++) {
			if (i%4==0) {
				System.out.print(i +", ");	
			
			count++;
			
		}
		}
		System.out.println(count);
		count=0;
				
		System.out.println("\n\nDivided by 5: ");			
		for (int i=20; i<40; i++) {
			if (i%5==0) {
				System.out.print(i +", ");	
			
			count++;
			}
			}
		
		
		System.out.println(count);
		

		//String a,b;
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//a=sc.next();
		//b=sc.next();
		//int c,d;
		//c=Integer.parseInt(a);
		//d=Integer.parseInt(b);
		//System.out.println(a+b);
		//System.out.println(c+d);
		

	}

}
