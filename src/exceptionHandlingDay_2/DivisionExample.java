package exceptionHandlingDay_2;

public class DivisionExample 
{
	public static int operation(int dividend , int divisor) throws ArithmeticException
	{
			int s = dividend/divisor;
			return s;
		
	}
	
	public static void main (String[] args) 
	{
		int a = 12;
		int b = 0;
		try
		{
			
			int s = operation(a,b);
			System.out.println(s);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException caught: Division by zero: dividend = "+a+", divisor = "+b);
	
		}
	}
}
/*
Create a class named DivisionExample:

Implement a static method performDivision :
Takes two integer parameters: dividend and divisor.
Access Modifier : public
Non-Access Modifier : static
return type : int
parameters : int, int

Performs division dividend / divisor.
Throws an ArithmeticException if divisor is zero.

Implement the main method:
Inside the main method, call the performDivision method with different inputs, including zero as a divisor.
Use a try-catch block to catch and handle any ArithmeticException thrown by performDivision.
Print an appropriate error message when division by zero occurs.
Test the program:

*/