package ForLoop;
import java.util.Scanner;
public class ReverseNumber {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from user
	        System.out.print("Enter a number to reverse: ");
	        int num = sc.nextInt();

	        int reverse = 0;

	        // Reverse the number using for loop
	        for (; num != 0; num /= 10) {
	            int digit = num % 10; // Get last digit
	            reverse = reverse * 10 + digit; // Add digit to reverse
	        }

	        // Display result
	        System.out.println("Reversed number: " + reverse);

	        sc.close();
	    }
	}

   
