package exceptionHandlingDay_4;

public class CarStoppedException extends Exception
{

	public CarStoppedException() 
	{
		super();
	}

	public CarStoppedException(String errorMessage) 
	{
		super(errorMessage);
	}
	
	
}
/*
For CarStoppedException: extends Exception
Purpose: Represents an exception when the car stops for reasons other than puncture or overheating.

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter

*/