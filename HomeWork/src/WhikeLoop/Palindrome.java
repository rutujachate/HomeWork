package WhikeLoop;
import java.util.Scanner;
public class Palindrome {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int originalNum = num; // store original number
	        int reverse = 0;

	        // Handle negative numbers: negative numbers can't be palindromes
	        if (num < 0) {
	            System.out.println(num + " is NOT a palindrome.");
	            return;
	        }

	        // While loop to reverse the number
	        while (num > 0) {
	            int digit = num % 10; // get last digit
	            reverse = reverse * 10 + digit;
	            num = num / 10; // remove last digit
	        }

	        // Compare original and reversed number
	        if (originalNum == reverse) {
	            System.out.println(originalNum + " is a palindrome.");
	        } else {
	            System.out.println(originalNum + " is NOT a palindrome.");
	        }
	    }
	

}
