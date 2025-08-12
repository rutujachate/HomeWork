package WhikeLoop;
import java.util.Scanner;
public class GreatesrDigitOfNumber {
		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Handle negative numbers
	        if (num < 0) {
	            num = -num; // make positive
	        }

	        int maxDigit = 0; // smallest possible digit

	        // While loop to find the greatest digit
	        while (num > 0) {
	            int digit = num % 10; // get last digit
	            if (digit > maxDigit) {
	                maxDigit = digit;
	            }
	            num = num / 10; // remove last digit
	        }

	        // Output result
	        System.out.println("Greatest digit: " + maxDigit);
	    }
	

}
