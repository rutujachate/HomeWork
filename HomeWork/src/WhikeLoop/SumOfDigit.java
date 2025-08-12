package WhikeLoop;
import java.util.Scanner;
public class SumOfDigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Handle negative numbers
	        if (num < 0) {
	            num = -num; // make it positive
	        }

	        int sum = 0;

	        // Loop until number becomes 0
	        while (num > 0) {
	            int digit = num % 10; // get last digit
	            sum += digit;         // add to sum
	            num = num / 10;       // remove last digit
	        }

	        // Output result
	        System.out.println("Sum of digits: " + sum);
	    }
	

}
