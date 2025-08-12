package DoWhileLoop;
import java.util.Scanner;
public class NumberReverse {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        int i = n; // start from n

	        do {
	            System.out.println(i);
	            i--; // decrement
	        } while (i >= 1); // loop until i reaches 1

	        sc.close();
	    }
	

}
