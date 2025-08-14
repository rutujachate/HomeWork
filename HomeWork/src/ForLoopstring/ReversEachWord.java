package ForLoopstring;
import java.util.Scanner;
public class ReversEachWord {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        String result = "";
	        String word = "";

	        // Loop through each character
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);

	            if (ch != ' ') {
	                word = word + ch; // Build current word
	            } else {
	                // Reverse the word and add to result
	                for (int j = word.length() - 1; j >= 0; j--) {
	                    result = result + word.charAt(j);
	                }
	                result = result + ' '; // Add space
	                word = ""; // Reset word
	            }
	        }

	        // Reverse the last word (if any)
	        for (int j = word.length() - 1; j >= 0; j--) {
	            result = result + word.charAt(j);
	        }

	        System.out.println("Sentence with reversed words: " + result);

	        sc.close();
	    }
	

}
