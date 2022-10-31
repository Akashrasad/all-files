
public class MaxProfitStock  
{  
  
// A method that returns the maximized profit  
// which can be made after buying and selling  
// the stocks given   
public int maximumProfit(int p[], int st, int ed)  
{  
  
// If the stocks can not be purchased  
if (ed <= st)  
{  
return 0;  
}  
  
// Initializing the profit  
int prof = 0;  
  
// Looking for the day at which the stock must  
// be purchased  
for (int j = st; j < ed; j++)  
{  
  
// The day at which the  
// stock must be sold  
for (int i = j + 1; i <= ed; i++)  
{  
  
// If purchasing the stock on the jth day and  
// selling it on the ith day is profitable  
if (p[i] > p[j])  
{  
  
// Updating the current profit  
// Suppose i = 6, j = 3, ed = 8, and st = 1  
// Then, currProfit is profit found is equal to   
// the profit made when stock is sold on the day 6 and purchased on the day 3  
// plus the profit made from the day 1 to the day 5 plus the profit made from   
// the day 7 to the day 8  
int currProfit = p[i] - p[j] + maximumProfit(p, st, j - 1) + maximumProfit(p, i + 1, ed);  
  
// Updating the maximum profit found so far  
prof = Math.max(prof, currProfit);  
}  
}  
}  
return prof;  
}  
  
// main method  
public static void main(String argvs[])  
{  
// price of the stock  
int price[] = { 50, 90, 130, 155, 20, 267, 347 };  
int size = price.length; // computing the size  
  
System.out.println("The price of the stock on different days is: ");  
  
for(int i = 0; i < size; i++)  
{  
// displaying the stock price  
System.out.print(price[i] + " ");  
}  
  
System.out.println();  
// creating an object of the class MaxProfitStock  
MaxProfitStock obj = new MaxProfitStock();  
  
int ans  = obj.maximumProfit(price, 0, size - 1);  
  
System.out.print("The maximum profit earned is: ");  
  
System.out.print(ans);  
}  
}  