package DoWhileLoop;

public class DivBy4n6 {
	
	    public static void main(String[] args) {
	        int num = 101; // Start checking from 101

	        do {
	            num++;
	        } while (!(num % 4 == 0 && num % 6 == 0));

	        System.out.println("The first number greater than 100 divisible by both 4 and 6 is: " + num);
	    }
	

}
