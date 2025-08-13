package DoWhileLoop;
import java.util.Scanner;
public class RighttoLeftDigit {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = Math.abs(num); // Handle negative numbers

	        System.out.println("Digits from right to left:");
	        do {
	            int digit = temp % 10;  // Get last digit
	            System.out.println(digit);
	            temp /= 10;             // Remove last digit
	        } while (temp > 0);

	        sc.close();
	    }
	

}
