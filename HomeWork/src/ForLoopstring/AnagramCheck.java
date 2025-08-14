package ForLoopstring;
import java.util.Scanner;
public class AnagramCheck {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input two strings
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine();
	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine();

	        // If lengths differ, they cannot be anagrams
	        if (str1.length() != str2.length()) {
	            System.out.println("The strings are NOT anagrams.");
	            sc.close();
	            return;
	        }

	        // Frequency arrays for 256 ASCII characters
	        int[] freq1 = new int[256];
	        int[] freq2 = new int[256];

	        // Count frequency of each character in str1
	        for (int i = 0; i < str1.length(); i++) {
	            freq1[str1.charAt(i)]++;
	        }

	        // Count frequency of each character in str2
	        for (int i = 0; i < str2.length(); i++) {
	            freq2[str2.charAt(i)]++;
	        }

	        // Compare frequency arrays
	        boolean isAnagram = true;
	        for (int i = 0; i < 256; i++) {
	            if (freq1[i] != freq2[i]) {
	                isAnagram = false;
	                break;
	            }
	        }

	        if (isAnagram) {
	            System.out.println("The strings are ANAGRAMS.");
	        } else {
	            System.out.println("The strings are NOT anagrams.");
	        }

	        sc.close();
	    }
	


}
