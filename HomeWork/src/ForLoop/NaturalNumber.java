package ForLoop;
import java.util.Scanner;
public class NaturalNumber {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from the user
	        System.out.print("Enter the value of n: ");
	        int n = sc.nextInt();

	        // Print numbers from 1 to n
	        System.out.println("Natural numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }

	        sc.close();
	    }
	}


