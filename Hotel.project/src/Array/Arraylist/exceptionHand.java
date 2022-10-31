package Array.Arraylist;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHand {

	public static void main(String[] args) {
		System.out.println("please enter value");
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			
			System.out.println("please enter correct value");
			exceptionHand.main(args);
		}
		catch(InputMismatchException e) {
			System.out.println("please enter valide input");
			exceptionHand.main(args);
		}

	}

}
