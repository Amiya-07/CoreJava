package exceptionHandlingDay_3;

public class CommandLineDivision {

	public static void main(String[] args)
	{
		int dividend = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		
		try
		{
			try
			{
				if(divisor>0)
				{
					int result=dividend/divisor;
					System.out.println(result);
				}
				else
				{
					throw new ArithmeticException("Divisor can't be Zero");
				}
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println(e);
			}
		}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

	
}
/*
Create a ELC class named CommandLineDivision.
Implement the main method that:
Checks if exactly two command line arguments are provided.
Parses these arguments into integers (dividend and divisor).
Uses nested try-catch blocks:
Outer block catches IllegalArgumentException for insufficient arguments or invalid input types (NumberFormatException).
Inner block attempts the division and catches ArithmeticException for division by zero.
Prints the result of the division if successful.
Includes a finally block to print "Division operation completed."
Test the program with different scenarios:
*/