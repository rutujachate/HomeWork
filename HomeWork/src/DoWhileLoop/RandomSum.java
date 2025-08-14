package DoWhileLoop;
import java.util.Random;
public class RandomSum {
	    public static void main(String[] args) {
	        Random rand = new Random();

	        int sum = 0;
	        int count = 0;

	        System.out.println("Generated numbers:");

	        do {
	            int num = rand.nextInt(20) + 1; // random number between 1–20
	            sum += num;
	            count++;
	            System.out.println("Number " + count + ": " + num + " (Current sum = " + sum + ")");
	        } while (sum <= 100);

	        System.out.println("\n✅ Stopped after " + count + " numbers because sum exceeded 100.");
	    }
	

}
