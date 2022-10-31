package Profit;

import java.util.Scanner;

public class profit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the cost price");
	double cp=s.nextDouble();
	System.out.println("enter the selling price");
	double sp=s.nextDouble();
	if(cp-sp>0)
	{
		System.out.println("loss:"+(cp-sp
				
				));
	}else if (cp-sp
			
			
			<0) {
		System.out.println("profit"+(sp-cp));
		
		
	} 
	else {
		System.out.println("netural");
	}
		
	
}
}
