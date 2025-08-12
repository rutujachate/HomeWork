package WhikeLoop;
import java.util.Scanner;
public class OddNumberSum {
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number (n): ");
		        int n = sc.nextInt();

		        int i = 1;      // first even number
		        int sum = 0;    // to store the sum

		        while (i <= n) {
		            sum += i;   // add current even number to sum
		            i += 2;     // move to next even number
		        }

		        System.out.println("Sum of even numbers between 1 and " + n + " = " + sum);

		        sc.close();
		    }
		

	}



