package DoWhileLoop;
import java.util.Scanner;
public class LefttoRightDigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = Math.abs(num); // Handle negatives
	        int reversed = 0;

	        // Step 1: Reverse the number using do-while
	        do {
	            int digit = temp % 10;
	            reversed = reversed * 10 + digit;
	            temp /= 10;
	        } while (temp > 0);

	        // Step 2: Print digits from the reversed number (which is original left to right)
	        System.out.println("Digits from left to right:");
	        do {
	            int digit = reversed % 10;
	            System.out.println(digit);
	            reversed /= 10;
	        } while (reversed > 0);

	        sc.close();
	    }
	

}
