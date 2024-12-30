package exceptionHandlingDay_2;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of rectangle: ");
		double length =sc.nextDouble();
		System.out.println("Enter width of rectangle: ");
		double width =sc.nextDouble();
		
		try 
		{
			double result = calculateArea(length,width);
			System.out.println("Area of rectangle : "+result);
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
	}
	
	public static double calculateArea(double length,double width)
	{
		if(length<0||width<0)
		{
			 throw new IllegalArgumentException();
		}
		return length*width;
	}
}
/*Create a class named AreaCalculator:

Implement a static method calculateArea :
Takes two integer parameters: length and width.
Access Modifier : public
Non-Access Modifier : static
return type : double
parameters : double, double

Calculates the area using the formula length * width.
Throws an IllegalArgumentException if either length or width is non-positive.
Implement the main method:

Inside the main method, use a Scanner object to read input from the user.
Prompt the user to enter the length and width of the rectangle.

Call the calculateArea method within a try-catch block to handle any IllegalArgumentException.
Print the area of the rectangle if dimensions are valid; otherwise, print an error message.
Test the program:
*/