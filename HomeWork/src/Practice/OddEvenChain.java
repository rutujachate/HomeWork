package Practice;
import java.util.Scanner;

public class OddEvenChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input 3 numbers
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        // Check conditions
        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("Even Chain");
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println("Odd Chain");
        } else {
            System.out.println("Mixed Chain");
        }

        scanner.close();
    }
}


