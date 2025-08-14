package ForLoopstring;
import java.util.Scanner;
public class SecondMostFrequentChar {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int maxCount = 0, secondMaxCount = 0;
	        char maxChar = ' ', secondMaxChar = ' ';

	        // Outer loop: pick each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            int count = 0;

	            // Inner loop: count frequency
	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ch) {
	                    count++;
	                }
	            }

	            // Update max and second max counts
	            if (count > maxCount) {
	                secondMaxCount = maxCount;
	                secondMaxChar = maxChar;
	                maxCount = count;
	                maxChar = ch;
	            } else if (count > secondMaxCount && count != maxCount) {
	                secondMaxCount = count;
	                secondMaxChar = ch;
	            }
	        }

	        if (secondMaxCount > 0) {
	            System.out.println("Second most frequent character: '" + secondMaxChar + "' (appears " + secondMaxCount + " times)");
	        } else {
	            System.out.println("No second most frequent character found.");
	        }

	        sc.close();
	    }
	


}
