package DoWhileLoop;
import java.util.Scanner;
public class DecimaltoOctal {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a decimal number: ");
	        int decimal = sc.nextInt();

	        int temp = decimal;
	        int octal = 0;
	        int place = 1; // Place value (1, 10, 100...)

	        do {
	            int remainder = temp % 8;       // Get remainder for octal digit
	            octal += remainder * place;     // Add digit to octal result
	            place *= 10;                    // Move to next place in octal
	            temp /= 8;                      // Reduce decimal number
	        } while (temp > 0);

	        System.out.println("Octal value: " + octal);
	        sc.close();
	    }
	

}
