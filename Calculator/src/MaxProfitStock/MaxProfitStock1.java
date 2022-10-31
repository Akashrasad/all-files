package MaxProfitStock;

//important import statement  
import java.util.ArrayList;  
//for storing the days when to   
//purchase and sell the stock  
class Interval   
{  
int buy;  
int sell;  
}  
public class MaxProfitStock1  
{  
//A method that computes the maximum profit using the cost of the stock  
void stockBuySell(int p[], int size)  
{  
//We can not buy and sell the stock on the same day  
//Hence, there is no need to proceed further  
if (size == 1)  
{  
System.out.println("No profit is possible as the number of days is equal to 1");  
return;  
}  

int c = 0;  

//the solution array  
ArrayList<Interval> al = new ArrayList<Interval>();  

//Traversing through the given array of price   
int j = 0;  
while (j < size - 1)   
{  
//Findinng the Local Minima. Note that the limit is (size - 2) as we are  
//doing the comparison of the present element to the next element.  
while ((j < size - 1) && (p[j + 1] <= p[j]))  
{  
j = j + 1;  
}  

//If we reached the end, break as   
//there are no further possible solutions  
if (j == size - 1)  
{  
break;  
}  

//creating an object of the class interval  
Interval in = new Interval();  
//Store the index of minima  
in.buy = j + 1;   
j = j + 1;  


//Find Local Maxima. Note that the limit is (size - 1) as we   
//have to compare to previous element  
while ((j < size) && (p[j] >= p[j - 1]))  
{  
j = j + 1;  
}  

//storing the index for the maxima  
in.sell = j;  
al.add(in);  

//Incrementing the number of buy or sell  
c = c + 1;  
}  

//displaying the solution  
if (c == 0)  
{  
System.out.println("Buying the stock on any given day will not make the profit.");  
}  
else  
{  
int ans = 0;  
for (int i = 0; i < c; i++)  
{  
System.out.println("Buy the stock on day: " + al.get(i).buy  
+ "  "  
+ "Sell the stock on day: " + al.get(i).sell);  

ans = ans + (p[(al.get(i).sell - 1)] - p[(al.get(i).buy - 1)]);  
}  



System.out.println("Thus, the total profit is: " + ans);  

}  



return;  
}  

//main method  
public static void main(String argvs[])  
{  
//creating an object of the class MaxProfitStock1  
MaxProfitStock1 obj = new MaxProfitStock1();  

//price of stock on the consecutive days  
int p[] = {50, 90, 130, 155, 20, 267, 347};  
int size = p.length; // computing the size  

System.out.println("The price of the stock on different days is: ");  

for(int i = 0; i < size; i++)  
{  
//displaying the stock price  
System.out.print(p[i] + " ");  
}  

System.out.println("\n");  

//method call  
obj.stockBuySell(p, size);  
}  
}  