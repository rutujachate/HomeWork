package DoWhileLoop;
import java.util.Scanner;
public class OddDigitCount {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int count = 0;
	        int temp = Math.abs(num); // Handle negative numbers

	        do {
	            int digit = temp % 10;
	            if (digit % 2 != 0) {
	                count++;
	            }
	            temp /= 10;
	        } while (temp > 0);

	        System.out.println("Number of odd digits: " + count);
	        sc.close();
	    }
	
}
