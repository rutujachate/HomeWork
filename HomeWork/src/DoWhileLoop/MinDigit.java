package DoWhileLoop;
import java.util.Scanner;
public class MinDigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Work with positive value
	        num = Math.abs(num);

	        int minDigit = 9; // initialize with max possible digit

	        do {
	            int digit = num % 10;  // get last digit
	            if (digit < minDigit) {
	                minDigit = digit;  // update minDigit if current digit is smaller
	            }
	            num /= 10;            // remove last digit
	        } while (num != 0);

	        System.out.println("Minimum digit = " + minDigit);

	        sc.close();
	    }
	

}
