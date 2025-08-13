package DoWhileLoop;
import java.util.Scanner;
public class EvenOddDigitCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = Math.abs(num); // Handle negatives
	        int evenCount = 0, oddCount = 0;

	        do {
	            int digit = temp % 10;
	            if (digit % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	            temp /= 10;
	        } while (temp > 0);

	        if (evenCount > oddCount) {
	            System.out.println("The number has more even digits.");
	        } else if (oddCount > evenCount) {
	            System.out.println("The number has more odd digits.");
	        } else {
	            System.out.println("The number has an equal number of even and odd digits.");
	        }

	        sc.close();
	    }
	

}
