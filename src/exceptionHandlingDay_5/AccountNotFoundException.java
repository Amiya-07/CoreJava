package exceptionHandlingDay_5;

public class AccountNotFoundException extends Exception
{

	public AccountNotFoundException() {
		super();
	}
	public AccountNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	
}
