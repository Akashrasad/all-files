


import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double vegetablePrice = Double.parseDouble(reader.nextLine());
        double fruitPrice = Double.parseDouble(reader.nextLine());
        int vegetableQuantity = Integer.parseInt(reader.nextLine());
        int fruitQuantity = Integer.parseInt(reader.nextLine());
        double bgnToEuro = 1.94d;
        double UsToRs = 79.40d;

        double vegetablesProfit = vegetablePrice * vegetableQuantity;
        double fruitsProfit = fruitPrice * fruitQuantity;
        double totalProfit = vegetablesProfit + fruitsProfit;
        double totalProfitInEuro = totalProfit / bgnToEuro;
        double totalProfitInRs = totalProfit / UsToRs;
        System.out.println(totalProfitInEuro);
        System.out.println(totalProfitInRs);
    }
}