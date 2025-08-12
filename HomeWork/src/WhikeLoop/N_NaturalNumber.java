package WhikeLoop;
import java.util.Scanner;

public class N_NaturalNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number (n): ");
	        int n = sc.nextInt();

	        int i = 1; // starting number

	        while (i <= n) {
	            System.out.println(i);
	            i++; // increment
	        }

	        sc.close();
	    }
	

}
