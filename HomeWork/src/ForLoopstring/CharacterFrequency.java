package ForLoopstring;
import java.util.Scanner;
public class CharacterFrequency {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        boolean[] counted = new boolean[str.length()]; // Track counted characters

	        // Loop through each character
	        for (int i = 0; i < str.length(); i++) {
	            if (counted[i]) continue; // Skip if already counted

	            char ch = str.charAt(i);
	            int count = 1;

	            // Count frequency of current character
	            for (int j = i + 1; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                    counted[j] = true; // Mark as counted
	                }
	            }

	            System.out.println("'" + ch + "' appears " + count + " times");
	        }

	        sc.close();
	    }
	


}
