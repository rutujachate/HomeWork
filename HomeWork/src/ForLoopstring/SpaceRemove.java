package ForLoopstring;
import java.util.Scanner;
public class SpaceRemove {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // If not a space, add to result
	            if (ch != ' ') {
	                result = result + ch;
	            }
	        }

	        System.out.println("String without spaces: " + result);

	        sc.close();
	    }
	

}
