package exceptionHandlingDay_6;

public class SeatUnavailableException extends Exception
{

	public SeatUnavailableException()
	{
		super();
	}

	public SeatUnavailableException(String errorMessage)
	{
		super(errorMessage);
	}
	
}
/*
* SeatUnavailableException (Checked Exception):
->This exception should be thrown when an attempt is made to reserve seats that are not available at the moment or when there are 
insufficient seats for the specified reservation.

*/