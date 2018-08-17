//This program takes the subtotal entry from user and GR rate and convert to total 

import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double subtotal;
		
		double gratuityRate;
		//Remember like before, this is double because not whole number
		System.out.println("Enter the subtotal and the gratuity rate: ");//user input
		subtotal = input.nextDouble(); //used for the scanner
		gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);//formula
		double total = gratuity + subtotal;//total formula
		
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
		//console output
		
	}

}
