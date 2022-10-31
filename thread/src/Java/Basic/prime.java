package Java.Basic;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	int num,count=0;
	Scanner in =new Scanner(System.in);
	System.out.println("enter the number:");
	num=in.nextInt();
	for(int i=2;i<=num/2; i++) {
		if(num%i==0)
			count++;
		System.out.println("it not prime"+in);
	}
	if(count==0)
		System.out.println(" is prime number"+in);
}
}
