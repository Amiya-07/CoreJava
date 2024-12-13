package OOPS_Inheritance_Day19;

public class TestBank 
{

	public static void main(String[] args)
	{
		Costumer c = new Costumer("Amiya",10000);
		
		Bank b = new SBI(10000);
		
		c.checkBalance(b);
		c.wihdraw(b, 1000);
		c.checkBalance(b);
		c.deposite(b, 90);
		c.checkBalance(b);
	}

}
