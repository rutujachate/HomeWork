package ForLoop;
import java.util.Scanner;

public class SumOfNaturalNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        int sum = 0;

	        // Loop from 1 to n
	        for (int i = 1; i <= n; i++) {
	            sum += i; // Add each number to sum
	        }

	        // Display the result
	        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);

	        sc.close();
	    }
	}



