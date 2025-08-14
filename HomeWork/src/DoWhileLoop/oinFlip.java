package DoWhileLoop;
import java.util.Random;
public class oinFlip {
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int headsCount = 0;
	        int flips = 0;

	        do {
	            flips++;
	            // 0 = Tails, 1 = Heads
	            int coin = rand.nextInt(2);

	            if (coin == 1) {
	                headsCount++;
	                System.out.println("Flip " + flips + ": Heads (" + headsCount + " total)");
	            } else {
	                System.out.println("Flip " + flips + ": Tails");
	            }

	        } while (headsCount < 3);

	        System.out.println("✅ It took " + flips + " flips to get 3 Heads.");
	    }
	

}
