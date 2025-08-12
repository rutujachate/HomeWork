package DoWhileLoop;
import java.util.Scanner;
public class DigitCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int count = 0;

	        // Handle 0 separately (it has 1 digit)
	        if (num == 0) {
	            count = 1;
	        } else {
	            // Work with positive value
	            num = Math.abs(num);

	            do {
	                num /= 10;  // remove last digit
	                count++;    // increment digit count
	            } while (num != 0);
	        }

	        System.out.println("Number of digits = " + count);

	        sc.close();
	    }
	

}
