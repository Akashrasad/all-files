package people.tech.two;

public class Primewhile (int n) {
	public static void main(String [] args ) {

    int i = 2;
    while (i <= (n - 1)) {
        if (n % i == 0) {
            System.out.println("It's not a prime number");
            break;
        } else {
            System.out.println("It's a prime number");
            break;
        }
        i++;
    }
}