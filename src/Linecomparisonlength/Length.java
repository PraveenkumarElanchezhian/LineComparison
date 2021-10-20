package Linecomparisonlength;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) 
	{
     	Scanner n = new Scanner(System.in);

		System.out.println("Enter the value of x1: ");
		 double x1 = n.nextDouble();

		System.out.println("Enter the value of x2: ");
		 double x2 = n.nextDouble();

		System.out.println("Enter the value of y1: ");
		 double y1 = n.nextDouble();

		System.out.println("Enter the value of y2: ");
		 double y2 = n.nextDouble();

		 double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("Distance between two points :" + length);
	}

}
