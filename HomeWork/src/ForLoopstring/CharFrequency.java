package ForLoopstring;
import java.util.Scanner;
public class CharFrequency {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        // Input character
	        System.out.print("Enter the character to count: ");
	        char target = sc.next().charAt(0);

	        int count = 0;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == target) {
	                count++;
	            }
	        }

	        System.out.println("Frequency of '" + target + "' = " + count);

	        sc.close();
	    }
	

}
