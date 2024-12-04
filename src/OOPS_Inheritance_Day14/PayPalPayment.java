package OOPS_Inheritance_Day14;

public class PayPalPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Done PayPal payment");
	}
}
/*
Subclass PayPalPayment:

Override processPayment method to print a PayPal-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void
 
Task: Print a message for PayPal payment (e.g., "Processing PayPal payment").
*/