

import java.util.Scanner;

public class VegetablesCase {
    public static void main(String[] args) {
    	System.out.println("Vegetables available are:");
    	System.out.println("Vegetables with prices:");
    	System.out.println("");



        Scanner reader = new Scanner(System.in);
        double CauliflowerPrice = Double.parseDouble(reader.nextLine());
        double CarrotPrice = Double.parseDouble(reader.nextLine());
        double CabbagePrice = Double.parseDouble(reader.nextLine());
        double BeetrootPrice = Double.parseDouble(reader.nextLine());
        double BroccoliPrice = Double.parseDouble(reader.nextLine());
        double LadisfingerPrice = Double.parseDouble(reader.nextLine());
        
        int CauliflowerQuantity = Integer.parseInt(reader.nextLine());
        int CarrotQuantity = Integer.parseInt(reader.nextLine());
        int CabbageQuantity = Integer.parseInt(reader.nextLine());
        int BeetrootQuantity = Integer.parseInt(reader.nextLine());
        int BroccoliQuantity = Integer.parseInt(reader.nextLine());
        int LadisfingerQuantity = Integer.parseInt(reader.nextLine());
       
       
       
      

        double CauliflowerProfit = CauliflowerPrice * CauliflowerQuantity;
        double CarrotProfit = CarrotPrice * CarrotQuantity;
        double CabbageProfit = CabbagePrice * CabbageQuantity;
        double BeetrootProfit  = BeetrootPrice * BeetrootQuantity;
        double BroccoliProfit = BroccoliPrice * BroccoliQuantity;
        double LadisfingerProfit = LadisfingerPrice * LadisfingerQuantity;
       
        double totalProfit = CauliflowerProfit+ CabbageProfit + CarrotProfit+ BeetrootProfit + BroccoliProfit + LadisfingerProfit;
       
        System.out.println(totalProfit);
    
    }
}