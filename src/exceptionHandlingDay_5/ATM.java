package exceptionHandlingDay_5;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BankAccount b = new BankAccount(123456789,10000);
		BankAccount b1 = new BankAccount(12363449,100000);
		while(true)
		{
			System.out.println("Select an Option:\n1.Deposite\n2.Withdraw\n3.Transfer\n4.Loan Application\n5.Check Balance\n6.Exit\nSelect your Option :");
			int choice = sc.nextInt();
			
			try
			{
				switch(choice)
				{
					case 1:
						System.out.println("Enter amount you want to deposite");
						double amount = sc.nextDouble();
						b.deposite(amount); break;
					case 2:
						System.out.println("Enter amount you want to withdraw");
						amount = sc.nextDouble();
						b.withdraw(amount); break;
					case 3:
						System.out.println("Enter amount you want to transfer");
						amount = sc.nextDouble();
						b.transfer(b1,amount); break;
					case 4:
						System.out.println("Enter amount you want to Loan");
						amount = sc.nextDouble();
						b.applyForLoan(amount);	 break;
					case 5:
						b.getBalance(); break;
						
					case 6:
						sc.close();
						System.exit(0);
					
				}
			}
			catch(InvalidAmountException | AccountNotFoundException | InsufficientFundsException e)
			{
				System.err.println(e.getMessage());
			}
			catch(LoanNotAllowedException e)
			{
				System.err.println(e.getMessage());
			} 
			
		}
	}
}
