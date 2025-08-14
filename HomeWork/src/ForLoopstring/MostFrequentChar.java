package ForLoopstring;
import java.util.Scanner;
public class MostFrequentChar {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int maxCount = 0;
	        char mostFrequent = ' ';

	        // Outer loop: pick each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;

	            // Inner loop: count frequency of str.charAt(i)
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                }
	            }

	            // Update if higher frequency found
	            if (count > maxCount) {
	                maxCount = count;
	                mostFrequent = ch;
	            }
	        }

	        System.out.println("Most frequent character: '" + mostFrequent + "' (appears " + maxCount + " times)");

	        sc.close();
	    }
	


}
