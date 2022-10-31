package com.shopping;
import java.util.Scanner;



		public class Shopping {

		    public static void main(String[] args) {
		        
		        Scanner input = new Scanner(System.in);
		        
		        String[] items = new String[3];
		        double[] prices = new double[3];
		        int[] quantity = new int[3];
		        
		        for (int i = 0; i < 3; i++) {
		            System.out.println("Enter Item " + (i+1));
		            items[i] = input.nextLine();
		            
		            System.out.println("Enter Price " + (i+1));
		            prices[i] = input.nextDouble();
		            
		            System.out.println("Enter Quantity " + (i+1));
		            quantity[i] = input.nextInt();
		        }
		        
		        double total = 0;
		        for (int i = 0; i < 3; i++) {
		            total = total + (prices[i] * quantity[i]);
		        }
		        
		        System.out.println("Your total is " + total);
		    }

		
	}


