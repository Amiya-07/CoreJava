package exceptionHandlingDay_4;

public class CarPuncturedException extends Exception
{

	public CarPuncturedException() {
		super();
	}

	public CarPuncturedException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
/*
For CarPunctureException: extends Exception
This class is used for raise the exception if car is punctured.
Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

*/