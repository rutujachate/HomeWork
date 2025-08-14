package DoWhileLoop;
import java.util.Scanner;
public class TrianglePattern {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        int i = 1; // row counter

	        do {
	            int j = 1; // number counter
	            do {
	                System.out.print(j);
	                j++;
	            } while (j <= i);

	            System.out.println(); // move to next row
	            i++;
	        } while (i <= rows);

	        sc.close();
	    }
	

}
