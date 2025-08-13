package DoWhileLoop;
import java.util.Scanner;
public class RepetedDigitsum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        do {
	            int sum = 0;
	            while (num > 0) { 
	                sum += num % 10; // Add last digit
	                num /= 10;       // Remove last digit
	            }
	            num = sum; // Replace original number with the sum
	        } while (num >= 10); // Repeat until single digit

	        System.out.println("Final single digit: " + num);
	        sc.close();
	    }
	

}
