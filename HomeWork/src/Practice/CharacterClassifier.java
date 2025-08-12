package Practice;
import java.util.Scanner;

public class CharacterClassifier {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Prompet user for a single character
		System.out.println("Enter a single Character :");
		char ch = scanner.next().charAt(0);
		
		//classify the character
		if(Character.isUpperCase(ch)) {
			System.out.println("It is a Upper Case Letter");			
		} else if(Character.isLowerCase(ch)) {
				System.out.println("It is a Lower Case Letter");
				
		}else if(Character.isDigit(ch)) {
			System.out.println("It is a Digit");
			
		}else  {
			System.out.println("It is a special character.");

}
		scanner.close();
	}
}