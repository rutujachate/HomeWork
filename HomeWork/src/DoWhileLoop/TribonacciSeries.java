package DoWhileLoop;
import java.util.Scanner;
public class TribonacciSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of terms (n): ");
	        int n = sc.nextInt();

	        int a = 0, b = 1, c = 1; // first 3 terms
	        int count = 1;

	        System.out.println("Tribonacci Series:");

	        if (n >= 1) System.out.print(a + " ");
	        if (n >= 2) System.out.print(b + " ");
	        if (n >= 3) System.out.print(c + " ");

	        count = 4; // start from 4th term
	        do {
	            int next = a + b + c;
	            System.out.print(next + " ");
	            a = b;
	            b = c;
	            c = next;
	            count++;
	        } while (count <= n);

	        sc.close();
	    }
	

}
