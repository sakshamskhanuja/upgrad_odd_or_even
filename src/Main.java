import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the entered number.
        Scanner scanner = new Scanner(System.in);

        // Stores the entered number.
        int number = scanner.nextInt();

        // Checks if number is even.
        if (number % 2 == 0) {
            System.out.println("The number entered is even");
        } else {
            System.out.println("The number entered is odd");
        }
    }
}