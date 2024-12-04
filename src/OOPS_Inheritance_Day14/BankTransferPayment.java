package OOPS_Inheritance_Day14;

public class BankTransferPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Done bank transfer payment");
	}
}
/*
Subclass BankTransferPayment:

Override processPayment method to print a bank transfer-specific message:

Method Name: processPayment
Access Modifier: public
Return Type: void

Task: Print a message for bank transfer payment (e.g., "Processing bank transfer payment").

*/