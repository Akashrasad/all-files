package com.java.account;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int CustomerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyformat=new DecimalFormat("'Rs'###,##0.00");
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public double CalcCheckingWithdraw(double amount) {
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
//	public void setCalcCheckingWithdraw(double calcCheckingWithdraw) {
//		this.calcCheckingWithdraw = calcCheckingWithdraw;
//	}
	public double CalcSavingWithdraw(double amount) {
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
//	public void setCalcSavingWithdraw(double calcSavingWithdraw) {
//		this.calcSavingWithdraw = calcSavingWithdraw;
//	}
	public double CalcCheckingDeposit(double amount) {
		checkingBalance=(checkingBalance+ amount);
		return checkingBalance;
	}
//	public void setCalcCheckingDeposit(double calcCheckingDeposit) {
//		this.calcCheckingDeposit = calcCheckingDeposit;
//	}
	public double CalcSavingDeposit(double amount) {
		savingBalance=(savingBalance+ amount);
		return savingBalance;
	}
//	public void setCalcSavingDeposit(double calcSavingDeposit) {
//		this.calcSavingDeposit = calcSavingDeposit;
//	}
	public void getCheckingWithdrawInput() {
		System.out.println("checking account balance:"+moneyformat.format(checkingBalance));
		System.out.println("amount you want to withdraw from checking account:");
		double amount =input.nextDouble();
		if((checkingBalance-amount)>=0) {
			CalcCheckingWithdraw(amount);
			System.out.println("new checking account balance:"+moneyformat.format(checkingBalance));
		}else {
			System.out.println("balance cannot be negative."+"\n");
			
		}
		
	}
//	public void setCheckingWithdrawInput(double checkingWithdrawInput) {
//		CheckingWithdrawInput = checkingWithdrawInput;
//	}
	public void getSavingWithdrawInput() {
		System.out.println("saving account balance:"+moneyformat.format(savingBalance));
		System.out.print("amount you want to withdraw from saving account:");
		double amount =input.nextDouble();
		if((savingBalance-amount)>=0) {
			CalcSavingWithdraw(amount);
			System.out.println("new saving account balance:"+savingBalance+"\n");
		}
		else {
			System.out.println("balance cannot be negative."+"\n");
		}
	}
//	public void setSavingWithdrawInput(double savingWithdrawInput) {
//		SavingWithdrawInput = savingWithdrawInput;
//	}
	public void getCheckingDepositInput() {
		System.out.println("checking account balance:"+moneyformat.format(checkingBalance));
		System.out.println("amount you want to deposit from checking account:");
		double amount=input.nextDouble();
		if((checkingBalance+amount)>= 0) {
			CalcCheckingDeposit(amount);
			System.out.println("new checking account balance:"+moneyformat.format(checkingBalance));
		}else {
			System.out.println("balance cannot be negative."+"\n");
		}
		
	}
//	public void setCheckingDepositInput(double checkingDepositInput) {
//		CheckingDepositInput = checkingDepositInput;
	//}
	public void getSavingDepositInput() {
		System.out.println("saving account balance:"+moneyformat.format(savingBalance));
		System.out.println("amount you want to deposit from saving account:");
		double amount=input.nextDouble();
		if((savingBalance+amount)>=0) {
			CalcSavingDeposit(amount);
			System.out.println("new saving account balance:"+moneyformat.format(savingBalance));
		}else {
			System.out.println("balance cannot be negative."+"\n");
		}
		
	}
//	public void setSavingDepositInput(double savingDepositInput) {
//		SavingDepositInput = savingDepositInput;
//	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
//	public double calcCheckingWithdraw;
//	public double calcSavingWithdraw;
//	public double calcCheckingDeposit;
//	public double calcSavingDeposit;
//	public double CheckingWithdrawInput;
//	public double SavingWithdrawInput;
//	public double CheckingDepositInput;
//	public double SavingDepositInput;
	
	

}
