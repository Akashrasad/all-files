package com.java.account;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyformat=new DecimalFormat("'Rs'###,##0.00");
	HashMap<Integer, Integer> data=new HashMap<Integer,Integer>();
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				System.out.println("welcome to the ATM!");
				System.out.println("enter you customer number:");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("enter your pin number");
				setPinNumber(menuInput.nextInt());
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("/n"+"invalid character.only numbers."+"/n");
				x=2;
			}
			for (Entry<Integer, Integer>entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
					getAccountType();
			}
		
		System.out.println("\n"+"wrong customer number or pin number."+"\n");
		}while (x==1);
		}

public void getAccountType() {
	System.out.println("select the account you want to access:");
System.out.println("type 1-checking Account");
System.out.println("type 2-saving account");
System.out.println("type 3-exit");
System.out.println("choice:");
int selection;
selection =menuInput.nextInt();
switch(selection) {
case 1:
	getChecking();
	break;
case 2:
	getSaving();
	break;
case 3:
	System.out.println("thank you for using this Atm, bye.");
	break;
	default:
		System.out.println("\n"+"invalid choice."+"\n");
		getAccountType();

}
}
public void getChecking() {
	System.out.println("checking account:");
	System.out.println("type 1-view balance:");
	System.out.println("type 2-withdraw funds");
	System.out.println("type 3-Deposit funds");
	System.out.println("type 4-exit");
	System.out.println("choice:");
	int selection;
	selection=menuInput.nextInt();
	switch(selection) {
	case 1:
		System.out.println("checking account balance:"+moneyformat.format(getCheckingBalance()));
		getAccountType();
		break;
	case 2:
		getCheckingWithdrawInput();
		getAccountType();
		break;
	case 3:
		getCheckingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("thank you for using this Atm,bye.");
		default:
			System.out.println("\n"+"invalid choice."+"\n");
			getChecking();
	}
	
}
public void getSaving() {
	System.out.println("saving Account:");
	System.out.println("type 1-view balance");
	System.out.println("type 2-withdraw funds");
	System.out.println("type 3-Deposit funds");
	System.out.println("type 4-exit");
	System.out.print("choice:");
	int selection;
	selection=menuInput.nextInt();
	switch(selection) {
	case 1:
		System.out.println("saving account balance :"+moneyformat.format(getSavingBalance()));
		getAccountType();
		break;
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
	case 3:
		getSavingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("thank you for using this Atm,bye.");
		break;
		
		default:
			System.out.println("\n"+"invalid choice"+"\n");
			getSaving();
	}
}
}