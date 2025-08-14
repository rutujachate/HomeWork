package ForLoopstring;
import java.util.Scanner;
public class UpperLowerCaseCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int upperCount = 0, lowerCount = 0;

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            // Check uppercase
	            if (ch >= 'A' && ch <= 'Z') {
	                upperCount++;
	            }
	            // Check lowercase
	            else if (ch >= 'a' && ch <= 'z') {
	                lowerCount++;
	            }
	        }

	        System.out.println("Number of uppercase letters: " + upperCount);
	        System.out.println("Number of lowercase letters: " + lowerCount);

	        sc.close();
	    }
	

}
