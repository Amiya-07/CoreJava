package exceptionHandlingDay_5;

public class InsufficientFundsException extends Exception
{

	public InsufficientFundsException() 
	{
		super();
	}
	
	public InsufficientFundsException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}
