package Linecomparisonlength;

import java.util.Scanner;

public class Equality {
	public static void main(String[] args) 
	{
     	Scanner n = new Scanner(System.in);

		System.out.println("Enter the value of x1: ");
		 double x1 = n.nextDouble();

		System.out.println("Enter the value of x2: ");
		 double x2 = n.nextDouble();
		 
		 System.out.println("Enter the value of x1: ");
		 double x3 = n.nextDouble();

		System.out.println("Enter the value of x2: ");
		 double x4 = n.nextDouble();

		System.out.println("Enter the value of y1: ");
		 double y1 = n.nextDouble();

		System.out.println("Enter the value of y2: ");
		 double y2 = n.nextDouble();
		 
		 System.out.println("Enter the value of y1: ");
		 double y3 = n.nextDouble();

		System.out.println("Enter the value of y2: ");
		 double y4 = n.nextDouble();

		 double length_one = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		 double length_two = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println("Distance between two points :" + length_one);
		System.out.println("Distance between two points :" + length_two);
		
		if (length_one == length_two)
        {
            System.out.println("The length is equal");
        }

        else
        {
            System.out.println("The length is not equal");
        }
	}

}
