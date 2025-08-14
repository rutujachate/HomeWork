package ForLoopstring;
import java.util.Scanner;
public class WordCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = sc.nextLine();

	        int wordCount = 0;
	        boolean inWord = false;

	        // Loop through each character
	        for (int i = 0; i < sentence.length(); i++) {
	            char ch = sentence.charAt(i);

	            // If character is not space, we are inside a word
	            if (ch != ' ' && !inWord) {
	                inWord = true;
	                wordCount++;
	            } 
	            // If character is space, we are outside a word
	            else if (ch == ' ') {
	                inWord = false;
	            }
	        }

	        System.out.println("Total words in the sentence: " + wordCount);

	        sc.close();
	    }
	

}
