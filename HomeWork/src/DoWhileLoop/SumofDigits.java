package DoWhileLoop;
import java.util.Scanner;
public class SumofDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = 0;

	        // Work with positive value
	        num = Math.abs(num);

	        do {
	            int digit = num % 10; // extract last digit
	            sum += digit;         // add to sum
	            num /= 10;            // remove last digit
	        } while (num != 0);

	        System.out.println("Sum of digits = " + sum);

	        sc.close();
	    }
	

}
