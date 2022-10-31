import java.util.Scanner;

class Array 
{ 
	public static void main ( String[] args ) 
	{ 
		//Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		
	int[] array = { 20, 19, 1, 5, 71, 27, 19, 95 } ; 
	int min=array[0]; // initialize the current minimum 	
	for ( int index=0; index < array.length; index++ )  
		if ( array[ index ] < min ) 
			min = array[ index ] ; 

		System.out.println("The minimum of this array is: " + min ); 
	} 
} 
