import java.util.Scanner;

public class Exercise3_14 {
	
	public static void main (String [] args){
		
		Scanner input = new Scanner (System.in);
		
		int coin = (int)(Math.random() * 2);
		
		int userAnswer;
		
		System.out.println("Enter 0 for heads and 1 for tails: ");
		userAnswer = input.nextInt();
		
		if (userAnswer == coin) {
			System.out.println("You are correct!");
			
		} else {
			System.out.println("That is incorrect!");
		}
	
	}
	

}
