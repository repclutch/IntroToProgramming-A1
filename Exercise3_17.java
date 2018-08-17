import java.util.Scanner;

public class Exercise3_17 {
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		int randomNumber = (int)(Math.random() * 3);
		
		System.out.println("rock (0), paper (1), scissors (2): "); 
		int userInput = input.nextInt();
		
		
		System.out.println("The computer is: ");
		switch (randomNumber) {
		
		case 0:
			System.out.println("rock");
			break;
			
		case 1:
			System.out.println("paper");
			break;
			
		case 2: 
			System.out.println("scissors");
			
		}
		
		System.out.println();
		
		System.out.println("You are: ");
		switch (userInput) {
		
		case 0:
			System.out.println("rock");
			break;
			
		case 1:
			System.out.println("paper");
			break;
			
		case 2: 
			System.out.println("scissors");
		
			
		}
		
		if (userInput == randomNumber) {
			System.out.println();
			System.out.println("It is a tie!");
			System.exit(0);
		} 
		
		if (((userInput == 2 && randomNumber == 1)) || ((userInput == 0 && randomNumber == 2)) || 
				((userInput == 1 && randomNumber == 0))) {
			System.out.println();
			System.out.println("You win!");
		}
		else {
			System.out.println();
			System.out.println("You lose!");
		}
		
	}

}
