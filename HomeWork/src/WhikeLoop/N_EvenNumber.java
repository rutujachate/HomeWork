package WhikeLoop;
import java.util.Scanner;
public class N_EvenNumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter how many even numbers you want (n): ");
	        int n = sc.nextInt();

	        int count = 0; // to count how many even numbers printed
	        int num = 2;   // first even number

	        while (count < n) {
	            System.out.println(num);
	            num += 2; // next even number
	            count++;  // increase count
	        }

	        sc.close();
	    }
	


}
