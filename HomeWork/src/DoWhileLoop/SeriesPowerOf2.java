package DoWhileLoop;
import java.util.Scanner;
public class SeriesPowerOf2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of terms (n): ");
	        int n = sc.nextInt();

	        int term = 2;   // first term
	        int count = 1;  // to track number of terms printed

	        System.out.println("Series:");
	        do {
	            System.out.print(term + " ");
	            term *= 2;   // multiply by 2 each time
	            count++;
	        } while (count <= n);

	        sc.close();
	    }
	

}
