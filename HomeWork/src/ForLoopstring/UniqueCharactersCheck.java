package ForLoopstring;
import java.util.Scanner;
public class UniqueCharactersCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        boolean isUnique = true;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check for duplicates in the remaining string
	            for (int j = i + 1; j < str.length(); j++) {
	                if (ch == str.charAt(j)) {
	                    isUnique = false;
	                    break;
	                }
	            }

	            if (!isUnique) {
	                break;
	            }
	        }

	        if (isUnique) {
	            System.out.println("All characters are unique.");
	        } else {
	            System.out.println("The string contains duplicate characters.");
	        }

	        sc.close();
	    }
	


}
