package Practice;
import java.util.Scanner;

public class OddNumberSum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (n): ");
	        int n = sc.nextInt();

	        int i = 1;      // first odd number
	        int sum = 0;    // to store the sum

	        while (i <= n) {
	            sum += i;   // add current odd number to sum
	            i += 2;     // move to next odd number
	        }

	        System.out.println("Sum of odd numbers between 1 and " + n + " = " + sum);

	        sc.close();
	    }
	

}
