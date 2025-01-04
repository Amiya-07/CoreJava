package exceptionHandlingDay_5;

public class LoanNotAllowedException extends RuntimeException
{

	public LoanNotAllowedException() {
		super();
	}

	public LoanNotAllowedException(String errorMessage)
	{
		super(errorMessage);
	}
	
	
}
