package ForLoop;
import java.util.Scanner;

public class Factorial {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take user input
	        System.out.print("Enter a number to find its factorial: ");
	        int n = sc.nextInt();

	        long factorial = 1; // Use long to store large values

	        // Calculate factorial using for loop
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }

	        // Display result
	        System.out.println("Factorial of " + n + " is: " + factorial);

	        sc.close();
	    }
	}


