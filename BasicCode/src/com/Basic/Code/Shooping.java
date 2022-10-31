package com.Basic.Code;
import java.util.*;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

public class Shooping {
	public static void main(String[] args)
	{
	    String squantity, snumber, output, line_output = "";
	    String [] item = new String [5];
	    double [] cost = new double [5];
	    double [] quantity = new double [5];
	    double [] amount = new double [5];
	    int number, i;
	    double grandtotal = 0;
	    String costout, amountout, grandtotalout;
	    DecimalFormat df2 = new DecimalFormat("RS##,###.00");

	   
		for(i=0;i<=4;++i)
	    {
	        output = "   PeopleMart Grocery Store" + "\n" +
	           "1-cabbage rs15 per kg" + "\n" +
	           "2-onion rs40 per kg" + "\n" +
	           "3-potato rs50 per kg" + "\n" +
	           "4-carrot rs70 per kg" + "\n" +
	           "5-tomato rs80 per kg" + "\n" +
	           "6-cauliflower rs20 per kg" + "\n" + "\n" +
	           "Please make your choice ";

	        snumber = JOptionPane.showInputDialog(null,
	                output, "Input Data", JOptionPane.QUESTION_MESSAGE);
	        number = Integer.parseInt(snumber);
	        squantity = JOptionPane.showInputDialog(null,
	            "Enter Quantity", "Input Data", JOptionPane.QUESTION_MESSAGE);
	        quantity[i] = Double.parseDouble(squantity);

	        //code for the calculation
	        if(number == 1)
	        {
	            cost[i] = 15;
	            item[i]="cabbage";
	        }
	        else if(number == 2)
	        {
	            cost[i] = 40;
	            item[i]="onion";
	        }
	        else if(number == 3)
	        {
	            cost[i] = 50;
	            item[i]="potato";
	        }
	        else if(number ==4)
	        {
	            cost[i] = 70;
	            item[i]="carrot";
	        }
	        else if (number==5)
	        {
	            cost[i] = 80;
	            item[i]="tomatoes";
	        }
	        else
	        {
	            cost[i] = 20;
	            item[i]="cauliflower";
	        }

	        amount[i]=cost[i]*quantity[i];
	        costout=df2.format(cost[i]);
	        amountout=df2.format(amount[i]);
	        line_output=line_output+item[i]+"  "+costout+"  "+amountout+"\n";
	        grandtotal=grandtotal + amount[i];
	    }//for loop

	    grandtotalout=df2.format(grandtotal);
	    output=line_output+"\n"+ "The total grocery bill = "+grandtotalout;
	    JOptionPane.showMessageDialog(null, output, " ", JOptionPane.INFORMATION_MESSAGE);
	    System.exit(0);
	}//main

}
