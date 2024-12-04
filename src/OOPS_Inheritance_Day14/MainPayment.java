package OOPS_Inheritance_Day14;

public class MainPayment {

	public static void main(String[] args) 
	{
		Payment p1 = new Payment();
		p1.processPayment();
		
		Payment c1 = new CreditCardPayment();
		c1.processPayment();
		
		Payment p2 = new PayPalPayment();
		p2.processPayment();
		
		Payment b = new BankTransferPayment();
		b.processPayment();
		
		
		System.out.println("\n===============  Using Var...Args  ================");
		MainPayment.processMultiplePayments(p1,c1,p2,b);
		
	}

	public static void processMultiplePayments(Payment... payments)
	{
		for(Payment p:payments)
		{
			p.processPayment();
		}
	}
}
/*
Create a Main Class in which take main method and take one static method

Method :

Method to process multiple payments in a single transaction:

Method Name: processMultiplePayments
Access Modifier: public
Return Type: void
Arguments: Payment... payments

Task: Loop through each payment and call the processPayment method.

Create instances of Payment, CreditCardPayment, PayPalPayment, and BankTransferPayment.
Use polymorphism to call the processPayment method on each instance.
*/