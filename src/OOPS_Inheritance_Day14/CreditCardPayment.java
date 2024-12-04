package OOPS_Inheritance_Day14;

public class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Done credit card payment");
	}
}
/*
subclass CreditCardPayment:

Override processPayment method to print a credit card-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for credit card payment (e.g., "Processing credit card payment").


*/