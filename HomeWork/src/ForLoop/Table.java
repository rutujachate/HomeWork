package ForLoop;
import java.util.Scanner;
public class Table {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from the user
	        System.out.print("Enter a number to print its table: ");
	        int num = sc.nextInt();

	        // Print multiplication table using for loop
	        System.out.println("Multiplication Table of " + num + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }

	        sc.close();
	    }
	}


