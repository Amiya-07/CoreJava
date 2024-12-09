package OOPS_Inheritance_Day15;

public class BankManagementSystem {

	public static void main(String[] args) 
	{
		SavingAccount s = new SavingAccount("1234321",1000,8);
		s.generateStatement();
		
		System.out.println("\n\n=============Checking Account details===========\n");
		CheckingAccount c = new CheckingAccount("1234321",1000,500);
		c.generateStatement();
	}

}
/*
BankManagementSystem:

Create an ELC named BankManagementSystem that:
Instantiates a SavingsAccount object with sample data.
Invokes methods on the SavingsAccount object to demonstrate the generation of a savings account statement.
Instantiates a CheckingAccount object with sample data.
Invokes methods on the CheckingAccount object to demonstrate the generation of a checking account statement.
*/