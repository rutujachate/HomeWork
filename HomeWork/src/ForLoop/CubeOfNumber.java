package ForLoop;
import java.util.Scanner;
public class CubeOfNumber {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Take input from user
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();

	        System.out.println("Number\tCube");

	        // Loop from 1 to n
	        for (int i = 1; i <= n; i++) {
	            int cube = i * i * i; // Calculate cube
	            System.out.println(i + "\t" + cube);
	        }

	        sc.close();
	    }
	

}
