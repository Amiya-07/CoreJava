package OOPS_Day4;
import java.util.Scanner;
public class BankCostumer 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		System.out.print("Enter Bank Name ");
		String bname =  sc.nextLine();
		System.out.print("Enter Customer name ");
		String cname = sc.nextLine(); 
		System.out.print("Enter Bank Address ");
		String badd = sc.nextLine(); 
		System.out.print("Enter Bank IFSC code");
		String ifsc = sc.next(); 
		System.out.print("Enter customer Account Number");
		int acc = sc.nextInt();
		System.out.print("Enter current Balance");
		int amount = sc.nextInt();
		
		b.setDeatils(bname, cname, badd, ifsc, acc, amount);
		while(true)
		{
			
		System.out.println("enter choice \n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Exit");
		int choice  = sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("Enter amount to withdraw");
			double amount1 = sc.nextDouble();
			b.withdraw(amount1);
		}
		else if (choice==2)
		{
			System.out.println("Enter amount to deposite");
			double amount2 = sc.nextDouble();
			b.deposit(amount2);
		}
		else if (choice==3)
		{
			b.currentBalance();
		}
		else if (choice==4)
		{
			System.out.println(b.displayDetails());
			System.exit(0);
		}
		
		
		}
		
		
	}

}
