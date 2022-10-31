

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThousandDays {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        LocalDate startDate = LocalDate.parse(reader.nextLine(),
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endDate = startDate.plusDays(999);
        System.out.println(
                endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}