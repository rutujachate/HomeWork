package DoWhileLoop;
import java.util.Random;
public class DiceRoolUniltSix {
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int roll;
	        int attempts = 0;

	        do {
	            roll = rand.nextInt(6) + 1; // generates number 1–6
	            attempts++;
	            System.out.println("Roll " + attempts + ": " + roll);
	        } while (roll != 6);

	        System.out.println("\n✅ It took " + attempts + " rolls to get a 6!");
	    }
	

}
