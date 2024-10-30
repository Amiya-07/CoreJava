package miniBank;

import java.util.Scanner;

class Bank 
{
	double balance;
	Scanner sc=new Scanner(System.in);
	Bank(double balance)
	{
		
		this.balance=balance;
		
	}
	
	public synchronized void withdrow() throws InterruptedException
	{
		System.out.print("Enter the money to withdrow : ");
		double amount=sc.nextDouble();
		if(amount<=0)
		{
			System.err.println("Invalid amount");
			 System.out.println("\u001B[34m==============\u001B[33mThankyou\u001B[30m\u001B[34m==============\u001B[0m");

			System.exit(0);
		}
		else {
		 if(this.balance < amount)
		 {
			 System.err.println("Insufficient balance");
			 System.out.println("\u001B[32m"+"Your available balance is : "+this.balance+"\u001B[0m");
			 //first deposit the money
			 this.wait();
		 }
		 
		 this.balance=this.balance-amount;
		 System.out.println("\u001B[32m"+amount+" is debited from your account");
		 if(this.balance==0.0)
		 System.out.println("\u001B[31m"+"Your available balance is : "+this.balance);
		 else {
			 System.out.println("\u001B[32m"+"Your available balance is : "+this.balance); 
			 System.out.println("\u001B[34m==============\u001B[33mThankyou\u001B[30m\u001B[34m==============\u001B[0m");
		 }
		 System.exit(0);
		}
		 
	}
	
	public synchronized void deposite()
	{
		System.out.print("Enter the money to deposite : ");
		double amount=sc.nextDouble();
		if(amount<0)
		{
			System.out.println("\u001B[31m"+"Invalid amount");
			System.exit(0);
		}
		
		this.balance=this.balance+amount;
		System.out.println("\u001B[32m"+amount+" is credited in your account");
		System.out.println("Your available balance is : "+this.balance+"\u001B[0m");
		
		notify();//notifying the waiting thread to execute
		
		
	}
	
}



public class BankManagementSystem {

	public static void main(String[] args) 
	{
		System.out.println("\u001B[34m"+"********\u001B[33mWELCOME\u001B[0m TO SBI \u001B[33mBANK\u001B[0m\u001B[34m*********\u001B[0m");
		System.out.println("\u001B[34m====================================\u001B[0m");
		double amount=5000;
		Bank bank=new Bank(amount);
		
		System.out.println("\u001B[32m"+"Your available balance is : "+amount+"\u001B[0m");
		Thread customer1=new Thread("Sujit") {
			
			@Override
			public void run()
			{
				try
				{
					
				    bank.withdrow();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		};
		
		customer1.start();
		
		Thread customer2=new Thread("Sujit") {
			
			@Override
			public void run()
			{
				bank.deposite();
				
			}
			
		};
		
		customer2.start();
		

	}

}
