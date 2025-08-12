package WhikeLoop;
import java.util.Scanner;
public class ProductOfDigit {
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
	            System.out.println("Product of digits: 0");
	            return;
	        }

	        int product = 1;

	        // While loop to find product of digits
	        while (num > 0) {
	            int digit = num % 10; // get last digit
	            product *= digit;     // multiply
	            num = num / 10;       // remove last digit
	        }

	        // Output result
	        System.out.println("Product of digits: " + product);
	    }
	

}
