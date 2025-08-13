package DoWhileLoop;
import java.util.Scanner;
public class AverageMarks {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int marks, count = 0, sum = 0;

	        do {
	            System.out.print("Enter marks (enter 1 to stop): ");
	            marks = sc.nextInt();

	            if (marks != 1) { // Only count if not stop value
	                sum += marks;
	                count++;
	            }
	        } while (marks != 1);

	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("Average marks: " + average);
	        } else {
	            System.out.println("No marks entered.");
	        }

	        sc.close();
	    }
	

}
