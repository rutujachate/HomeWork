package DoWhileLoop;
import java.util.Random;
public class DivBy7 {
	    public static void main(String[] args) {
	        Random rand = new Random();
	        int num;

	        do {
	            num = rand.nextInt(100) + 1; // Random number between 1 and 100
	            System.out.println("Generated: " + num);
	        } while (num % 7 != 0);

	        System.out.println(num + " is divisible by 7! 🎉");
	    }
	

}
