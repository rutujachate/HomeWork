package WhikeLoop;
import java.util.Scanner;
public class Factorial {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Factorial of 0 is 1
	        if (num < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	            return;
	        }

	        int i = 1;
	        long fact = 1; // use long to handle large factorial values

	        // While loop to calculate factorial
	        while (i <= num) {
	            fact = fact * i;
	            i++;
	        }

	        // Output result
	        System.out.println("Factorial of " + num + " is: " + fact);
	    }
	

}
