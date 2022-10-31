package maths.operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    	Object itemid;
        String itemName;
        Double itemPrice;
        String itemOnSale;
        String moreItems;

        List<Item> items = new ArrayList<>();

        try (Scanner scan = new Scanner(System.in)) 
       {
            do {
            	System.out.println("what is id of item?");
            	itemid=scan.next();
                // Name of the item
                System.out.println("What is the name of your item?");
                itemName = scan.next();

                // Price of the item
                System.out.println("What is the price of your item?");
                itemPrice = scan.nextDouble();

                // Whether item is on sale
                System.out.println("Is this item on sale?(Yes/No)");
                itemOnSale = scan.next();

                System.out.println("Do you have more items? (Yes/No)");
                moreItems = scan.next();

                items.add(new Item(itemid,itemName, itemPrice, itemOnSale));

            } while (moreItems.equalsIgnoreCase("yes"));
        } finally {
            printBill(items);
        }

    }

    private static void printBill(List<Item> items) {
        double total = 0.00;

        System.out.println("**************  Grocery Bill  ******************");

        System.out.println("*** ITEM NAME **** ITEM PRICE **** ON SALE ? ****");

        for (Item item : items) {
            System.out.printf("    %s             %.2f           %s           \n", item.itemName, item.price,
                    item.itemOnSale);
            total += item.price;
        }

        System.out.println("************************************************");
        System.out.println("Total :" + total);
    }
}

class Item {
int itemid;
    String itemName;
    double price;
    String itemOnSale;

    public Item(Object itemid2,String itemName, double price, String itemOnSale) {
    	this.itemid=itemid;
        this.itemName = itemName;
        this.price = price;
        this.itemOnSale = itemOnSale;
    }

}