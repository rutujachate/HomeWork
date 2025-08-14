package DoWhileLoop;
import java.util.Scanner;
import java.util.Random;
public class NumberGeussingGame {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        int target = rand.nextInt(100) + 1; // random number 1–100
	        int guess;

	        System.out.println("🎲 Guess the number between 1 and 100!");

	        do {
	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();

	            if (guess > target) {
	                System.out.println("Too high! Try again.");
	            } else if (guess < target) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("🎉 Correct! The number was " + target);
	            }
	        } while (guess != target);

	        sc.close();
	    }
	}
