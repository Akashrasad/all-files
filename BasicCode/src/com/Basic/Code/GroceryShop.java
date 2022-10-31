package com.Basic.Code;

public class GroceryShop { 

	  public static void main(String[] args) {
	    System.out.println("Welcome to our grocery shop!");

	    // Declare and initialize variables for prices
	    float milkPrice = 2.99f;
	    float breadPrice = 2.50f;
	    float applePrice = 0.99f;
	    float totalPrice = 0.0f;

	    // Declare and initialize variables for amounts
	    int milkAmount = 2;
	    int breadAmount = 3;
	    int appleAmount = 5;

	    // Compute the total price
	    totalPrice = milkPrice * milkAmount + breadPrice * breadAmount + applePrice * appleAmount;

	    // Print the total price
	    System.out.println("The total price is: " + totalPrice);
	  }
	}
