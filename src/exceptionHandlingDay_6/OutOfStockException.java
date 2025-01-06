package exceptionHandlingDay_6;

public class OutOfStockException extends RuntimeException
{
	public OutOfStockException() 
	{
		super();
	}
	public OutOfStockException(String errorMessage) 
	{
		super(errorMessage);
	}
}
