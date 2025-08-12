package DoWhileLoop;
import java.util.Scanner;
public class DigitRevesre {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int originalNum = num;
	        int reversed = 0;

	        // Work with positive value for reversing digits
	        num = Math.abs(num);

	        do {
	            int digit = num % 10;           // get last digit
	            reversed = reversed * 10 + digit; // append digit
	            num /= 10;                     // remove last digit
	        } while (num != 0);

	        // If original number was negative, make reversed negative too
	        if (originalNum < 0) {
	            reversed = -reversed;
	        }

	        System.out.println("Reversed number = " + reversed);

	        sc.close();
	    }
	

}
