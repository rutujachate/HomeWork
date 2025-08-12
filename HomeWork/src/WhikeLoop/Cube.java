package WhikeLoop;
import java.util.Scanner;
public class Cube {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (n): ");
	        int n = sc.nextInt();

	        int i = 1; // starting number

	        while (i <= n) {
	            System.out.println("Cube of " + i + " = " + (i * i * i));
	            i++; // increment
	        }

	        sc.close();
	    }
	

}
