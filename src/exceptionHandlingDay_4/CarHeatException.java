package exceptionHandlingDay_4;

public class CarHeatException extends Exception
{

	public CarHeatException() 
	{
		super();
	}

	public CarHeatException(String errorMessage)
	{
		super(errorMessage);
	}

}
/*
For CarHeatException: extends Exception
This class is used for raise the exception if the car engine is more than 50 degrees Celsius

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter
*/