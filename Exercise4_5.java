 

import java.util.Scanner;

public class Exercise4_5 {
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		double side;
		double area;
		double numSides;
		
		
		System.out.print( " Enter number of sides ");
		numSides =input.nextDouble();
		
		System.out.print("Enter the side ");
		side=input.nextDouble();
		
		area=(numSides* Math.pow(side, 2)/(4*Math.tan(Math.PI/numSides)));
		
		System.out.print("The are is " + area);
		
		
	}
}
