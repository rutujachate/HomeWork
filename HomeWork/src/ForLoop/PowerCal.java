package ForLoop;
import java.util.Scanner;
public class PowerCal {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take base and exponent as input
	        System.out.print("Enter the base number: ");
	        int base = sc.nextInt();

	        System.out.print("Enter the exponent: ");
	        int exponent = sc.nextInt();

	        long result = 1; // To store result

	        // Calculate base^exponent using for loop
	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        // Display the result
	        System.out.println(base + " raised to the power " + exponent + " is: " + result);

	        sc.close();
	    }
	}


