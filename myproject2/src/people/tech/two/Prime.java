package people.tech.two;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		//int no=sc.nextInt();
		int temp=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:" );
		
			
		int no=sc.nextInt();
		for (int a=20; a<40; a++) {
		for (int i=2;i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		}
		if(temp==0)
		{
			System.out.println(no+ "is prime number");
		}
		else
		{
			System.out.println(no+ "is not prime");
		}
		// TODO Auto-generated method stub

	}

}
