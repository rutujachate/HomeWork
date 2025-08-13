package DoWhileLoop;
import java.util.Scanner;
public class CheckingPrimeNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;
	        boolean isPrime;

	        do {
	            System.out.print("Enter a number: ");
	            num = sc.nextInt();

	            isPrime = checkPrime(num);

	            if (!isPrime) {
	                System.out.println(num + " is not a prime number. Try again!");
	            }
	        } while (!isPrime);

	        System.out.println(num + " is a prime number! 🎉");
	        sc.close();
	    }

	    // Method to check if a number is prime
	    static boolean checkPrime(int n) {
	        if (n <= 1) return false; // 0, 1, and negatives are not prime
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	

}
