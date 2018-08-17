 

import java.util.Scanner;

public class Exercise2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		double x3;
		double y3;
		
		System.out.println("Enter x1 and y1 ");
		x1=input.nextDouble();
		y1=input.nextDouble();
		
		System.out.println("Enter x2 and y2 ");
		x2 = input.nextDouble();
		y2=input.nextDouble();
		
		System.out.println("Enter x3 and y3 ");
		x3=input.nextDouble();
		y3=input.nextDouble();
		
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		
		double s =(side1 + side2 + side3)/2;
		
		double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
				
		System.out.printf("The area is  %.1f", area);
	}

}
