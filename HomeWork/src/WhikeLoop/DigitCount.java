package WhikeLoop;
import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num; // make it positive
        }

        // Special case: if number is 0
        if (num == 0) {
            System.out.println("Number of digits: 1");
            return;
        }

        int count = 0;

        // Loop until number becomes 0
        while (num > 0) {
            num = num / 10; // remove last digit
            count++;        // increase count
        }

        // Output result
        System.out.println("Number of digits: " + count);
    }


}
