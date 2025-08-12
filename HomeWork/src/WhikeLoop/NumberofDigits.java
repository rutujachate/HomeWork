package WhikeLoop;
import java.util.Scanner;
public class NumberofDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int count = 0;

	        // Handle case when number is 0
	        if (num == 0) {
	            count = 1;
	        } else {
	            // If number is negative, make it positive
	            if (num < 0) {
	                num = -num;
	            }

	            while (num > 0) {
	                num /= 10; // remove last digit
	                count++;   // increase count
	            }
	        }

	        System.out.println("Number of digits = " + count);

	        sc.close();
	    }
	

}
