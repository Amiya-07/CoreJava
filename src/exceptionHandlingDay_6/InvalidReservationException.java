package exceptionHandlingDay_6;

public class InvalidReservationException extends RuntimeException 
{

	public InvalidReservationException()
	{
		super();
	}
	
	public InvalidReservationException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
/*
* InvalidReservationException (Unchecked Exception):
->This exception should be thrown when an attempt is made to reserve seats when no seats are available.

*/