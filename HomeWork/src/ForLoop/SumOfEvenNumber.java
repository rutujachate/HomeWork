package ForLoop;
import java.util.Scanner;
public class SumOfEvenNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        // Loop from 1 to n
	        for (int i = 1; i <= n; i++) {
	            // Check if number is even
	            if (i % 2 == 0) {
	                sum += i; // Add to sum
	            }
	        }

	        // Display the result
	        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

	        sc.close();
	    }
	}


