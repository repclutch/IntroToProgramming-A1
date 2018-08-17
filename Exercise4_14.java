import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String letterGrade;
		
		System.out.println("Enter a letter grade: ");
		letterGrade = input.nextLine();
		
		switch (letterGrade) {
		
		case "A": 
			System.out.println("The numeric value for grade " + letterGrade + " is 4");
			break;
		case "B": 
			System.out.println("The numeric value for grade " + letterGrade + " is 3");
			break;
		case "C": 
			System.out.println("The numeric value for grade " + letterGrade + " is 2");
			break;
		case "D": 
			System.out.println("The numeric value for grade " + letterGrade + " is 1");
			break;
		case "F": 
			System.out.println("The numeric value for grade " + letterGrade + " is 0");
			break;
		default: 
			System.out.println("Please enter an appropriate letter grade.");
		}
	}

}
