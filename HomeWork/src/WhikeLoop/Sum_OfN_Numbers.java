package WhikeLoop;
import java.util.Scanner;
public class Sum_OfN_Numbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (n): ");
	        int n = sc.nextInt();

	        int i = 1;      // starting number
	        int sum = 0;    // to store the sum

	        while (i <= n) {
	            sum += i;   // add current number to sum
	            i++;        // move to next number
	        }

	        System.out.println("Sum from 1 to " + n + " = " + sum);

	        sc.close();
	    }
	

}
