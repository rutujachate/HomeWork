package ForLoopstring;
import java.util.Scanner;
public class RemoveSpecialCharacters {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String result = "";

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Keep only letters and digits
	            if ((ch >= 'a' && ch <= 'z') || 
	                (ch >= 'A' && ch <= 'Z') || 
	                (ch >= '0' && ch <= '9')) {
	                result = result + ch;
	            }
	        }

	        System.out.println("String after removing special characters: " + result);

	        sc.close();
	    }
	


}
