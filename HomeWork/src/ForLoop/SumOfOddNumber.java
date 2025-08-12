package ForLoop;
import java.util.Scanner;
public class SumOfOddNumber {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        // Loop from 1 to n
	        for (int i = 1; i <= n; i++) {
	            // Check if number is odd
	            if (i % 2 != 0) {
	                sum += i; // Add to sum
	            }
	        }

	        // Display the result
	        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);

	        sc.close();
	    }
	

}
