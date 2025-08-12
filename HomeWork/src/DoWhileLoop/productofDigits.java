package DoWhileLoop;
import java.util.Scanner;
public class productofDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Work with positive value
	        num = Math.abs(num);

	        int product = 1;

	        do {
	            int digit = num % 10;  // get last digit
	            product *= digit;      // multiply product by digit
	            num /= 10;            // remove last digit
	        } while (num != 0);

	        System.out.println("Product of digits = " + product);

	        sc.close();
	    }
	

}
