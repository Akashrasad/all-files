package arra;

import java.io.IOException;
import java.util.Scanner;
/* first i have added the length of string 1 and 
 * string 2 and match the length of them.
 * to get the aragrams or not aragra
 * Tested data with
 * examples 1,2 and 3
 
 */
public class arra {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter two strings of  anagrams");
		System.out.println("enter String Str1:");
		String str1 = scanner.next();
		System.out.println("enter String Str2:");
		String str2 = scanner.next();
		try {
			int str=str1.length();
			int st=str2.length();
			System.out.println("In the string: " + str);  
			System.out.println("In the string: " + st);  
			int no = str - st;
			boolean h=true;
     System.out.println("str1 and str 2 are Anagrams"+h);
	}catch(Exception e) {
	
    System.out.println("str1 and str 2 are not Anagrams");
	
	}
	}
}






