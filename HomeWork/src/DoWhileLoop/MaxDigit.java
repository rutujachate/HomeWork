package DoWhileLoop;
import java.util.Scanner;
public class MaxDigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Work with positive value
	        num = Math.abs(num);

	        int maxDigit = 0;

	        do {
	            int digit = num % 10;   // get last digit
	            if (digit > maxDigit) {
	                maxDigit = digit;   // update maxDigit if current digit is greater
	            }
	            num /= 10;              // remove last digit
	        } while (num != 0);

	        System.out.println("Maximum digit = " + maxDigit);

	        sc.close();
	    }
	

}
