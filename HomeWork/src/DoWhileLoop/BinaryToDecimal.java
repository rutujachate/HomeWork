package DoWhileLoop;
import java.util.Scanner;
public class BinaryToDecimal {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a binary number: ");
	        int binary = sc.nextInt();

	        int decimal = 0;
	        int base = 1; // 2^0 position

	        do {
	            int lastDigit = binary % 10;  // Get last binary digit
	            decimal += lastDigit * base;  // Add to decimal value
	            base *= 2;                     // Move to next power of 2
	            binary /= 10;                  // Remove last digit
	        } while (binary > 0);

	        System.out.println("Decimal value: " + decimal);
	        sc.close();
	    }
	

}
