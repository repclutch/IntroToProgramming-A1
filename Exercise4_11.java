import java.util.Scanner;

public class Exercise4_11 {
	
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int userValue;
		
		System.out.println("Enter a decimal value (0-15): ");
		userValue = input.nextInt();
		
		if(userValue < 0 || userValue > 15) {
			System.out.println("Please enter a value between 0-15");
			System.exit(0);
		}
		
		System.out.println("The hex value is " + Integer.toHexString(userValue).toUpperCase());
		
		
	}

}
