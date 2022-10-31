



import java.util.Scanner;

public class Classroom {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double height = Double.parseDouble(reader.nextLine());
        double width = Double.parseDouble(reader.nextLine());
        height *= 100;
        width *= 100;
        int rowCount =(int) height / 120;
        int colCount = (int) (width - 100) / 70;
        int totalBanks = (rowCount * colCount) - 3;
        System.out.println(totalBanks);
    }
}
