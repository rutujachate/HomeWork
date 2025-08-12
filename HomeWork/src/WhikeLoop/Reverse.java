package WhikeLoop;
import java.util.Scanner;
public class Reverse {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Handle negative numbers
	        boolean isNegative = false;
	        if (num < 0) {
	            isNegative = true;
	            num = -num; // make it positive
	        }

	        int reverse = 0;

	        // While loop to reverse digits
	        while (num > 0) {
	            int digit = num % 10;      // get last digit
	            reverse = reverse * 10 + digit; // build reversed number
	            num = num / 10;            // remove last digit
	        }

	        // Restore negative sign if needed
	        if (isNegative) {
	            reverse = -reverse;
	        }

	        // Output result
	        System.out.println("Reversed number: " + reverse);
	    }
	

}
