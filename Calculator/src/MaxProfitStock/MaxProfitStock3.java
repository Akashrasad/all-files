package MaxProfitStock;

public class MaxProfitStock3  
{  
// A method that computes the maximum profit using the cost of the stock  
public int stockBuySell(int p[], int size)  
{  
  
// for storing the maximum profit  
int maximumProfit = 0;  
  
int maxCost = 0;  
for (int j = size - 1; j >= 0; j--)  
{  
  
maxCost = Math.max(maxCost, p[j]);  
maximumProfit = Math.max(maximumProfit, maxCost - p[j]);  
  
}  
return maximumProfit;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class MaxProfitStock3  
MaxProfitStock3 obj = new MaxProfitStock3();  
  
// price of stock on the consecutive days  
int p[] = {50, 90, 130, 155, 20, 267, 347};  
int size = p.length; // computing the size  
  
System.out.println("The price of the stock on different days is: ");  
  
for(int i = 0; i < size; i++)  
{  
// displaying the stock price  
System.out.print(p[i] + " ");  
}  
  
System.out.println("\n");  
// invoking the method stockBuySell()  
obj.stockBuySell(p, size);  
int ans  = obj.stockBuySell(p, size);  
System.out.print("The maximum profit earned is: ");  
System.out.print(ans);  
  
}  
}  
