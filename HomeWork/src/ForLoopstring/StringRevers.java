package ForLoopstring;
import java.util.Scanner;
public class StringRevers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        String reversed = "";

	        // Loop backwards using for loop
	        for (int i = str.length() - 1; i >= 0; i--) {
	            reversed = reversed + str.charAt(i);
	        }

	        System.out.println("Reversed string: " + reversed);

	        sc.close();
	    }
	

}
