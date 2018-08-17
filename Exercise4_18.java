import java.util.Scanner;

public class Exercise4_18 {

	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter two characters : ");
		String str = input.nextLine();
		
		char major = str.charAt(0);
		char year = str.charAt(1);
		
		String course = "";
		String classification = "";
		
		switch(major) {
		
		case 'M':
			course = "Mathematics";
			break;
			
		case 'C':
			course = "Computer Science";
			break;
			
		case 'I':
			course = "Informaton Technology";
			break;
			
		default:
			System.out.println("Invalid input");
			
		}
			
			
		switch (year) {
		
		case '1': 
			classification = "Freshman";
			break;
			
		case '2':
			classification = "Sophomore";
			break;
			
		case '3': 
			classification = "Junior";
			break;
			
		case '4':
			classification = "Senior";
			break;
			
		default:
			System.out.println("Invalid input");

		}
		
		System.out.println(course + " " + classification);

	}
}
