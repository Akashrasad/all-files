import java.util.Scanner;

public class CurrencyConvertor {
	    public static void main(String[] args) {
	    	   Scanner reader = new Scanner(System.in);
	           double money = Double.parseDouble(reader.nextLine());
	           String initialCurrency = reader.nextLine();
	           String resultCurrency = reader.nextLine();

	           double USD = 1.79549d;
	           double EUR = 1.95583d;
	           double GBP = 2.53405d;
	           double moneyInLeva = 0;

	           if (initialCurrency.equals("USD")) {
	               moneyInLeva = money * USD;
	           } else if (initialCurrency.equals("EUR")) {
	               moneyInLeva = money * EUR;
	           } else if (initialCurrency.equals("GBP")) {
	               moneyInLeva = money * GBP;
	           } else if (initialCurrency.equals("BGN")) {
	               moneyInLeva = money;
	           } else {
	               System.out.println("Invalid entry");
	           }

	           double result = 0;

	           if (resultCurrency.equals("USD")) {
	               result = moneyInLeva / USD;
	           } else if (resultCurrency.equals("EUR")) {
	               result = moneyInLeva / EUR;
	           } else if (resultCurrency.equals("GBP")) {
	               result = moneyInLeva / GBP;
	           } else if (resultCurrency.equals("BGN")) {
	               result = moneyInLeva;
	           } else {
	               System.out.println("Invalid entry");
	           }
	           System.out.printf("%.2f %s", result, resultCurrency);

	       }
	   }

	   
	