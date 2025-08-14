package ForLoopstring;
import java.util.Scanner;
public class ASCIISum {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int sum = 0;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            sum = sum + (int) ch;  // Add ASCII value
	        }

	        System.out.println("ASCII sum of all characters: " + sum);

	        sc.close();
	    }
	


}
