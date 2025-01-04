package exceptionHandlingDay_5;

public class InvalidAmountException extends RuntimeException
{

	public InvalidAmountException() 
	{
		super();
	}
	
	public InvalidAmountException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}
