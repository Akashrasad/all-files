package length;

import java.util.Scanner;

public class length 

{
	
	
public static void LengthExample2 ()
{  
	  
    String str = "Javatpoint";  
    if(str.length()>0) {  
        System.out.println("String is not empty and length is: "+str.length());  
    }  
    str = "";  
    if(str.length()==0) {  
        System.out.println("String is empty now: "+str.length());  
    }  
  
} 
//class LengthExample3   
//{  
//
//
////String str1 = "Welcome To JavaTpoint";  
////int size = str1.length();  
////
//// {
////	 System.out.println(" "Reverse of the string: " + "'" + " + " is"str1 + "'");
//// }
//
//for(int i = 0; i < size; i++)  
//{  
//// printing in reverse order  
//System.out.print(str1.charAt(str1.length() - i - 1));  
//}  
//  
//}  
// 

	public static void main(String[] args) {
		Scanner abc=new Scanner(System.in);
		
		String a="string";
		String b="hi";
		System.out.println("string length is :" +a.length());
		System.out.println("hi length is :"+b.length());
		length  aobj=new length ();
		aobj.LengthExample2();
		length aobj2=new length();
		aobj2.LengthExample2();
		}
	



 
}