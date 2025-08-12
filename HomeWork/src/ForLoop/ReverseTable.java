package ForLoop;
import java.util.Scanner;
public class ReverseTable {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from user
	        System.out.print("Enter a number to print its reverse table: ");
	        int num = sc.nextInt();

	        // Print multiplication table in reverse
	        System.out.println("Reverse Multiplication Table of " + num + ":");
	        for (int i = 10; i >= 1; i--) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	        sc.close();
	    }

}