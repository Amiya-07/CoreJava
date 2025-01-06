package exceptionHandlingDay_6;

public class InvalidItemException extends Exception
{

	public InvalidItemException() 
	{
		super();
	}
	public InvalidItemException(String errorMessage) 
	{
		super(errorMessage);
	}
	
}
