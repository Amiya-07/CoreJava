package OOPS_Inheritance_Day13;
import java.util.Scanner;

public class MathOperations 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
		System .out.println("1. Integer\n2. Double\n3. Exit ");
		int choice = sc.nextInt();
		Calculator calculator = new Calculator();
		if(choice==1)
		{
			System.out.println("Enter first number for Integer ");
			int num1=sc.nextInt();
			System.out.println("Enter second number for Integer ");
			int num2=sc.nextInt();
			
			System.out.println("\nInteger variable Details\n---------------------------");
			System.out.println("The sum of "+num1+" and "+num2+" is "+calculator.add(num1, num2));
			System.out.println("The multiply of "+num1+" and "+num2+" is "+calculator.multiply(num1, num2)+"\n");
		}
		else if(choice==2)
		{
			System.out.println("Enter first number for Double ");
			double numd1=sc.nextDouble();
			System.out.println("Enter second number for Double");
			double numd2=sc.nextDouble();
			System.out.println("\nDouble variable Details\n---------------------------");
			System.out.println("The sum of "+numd1+" and "+numd2+" is "+calculator.add(numd1, numd2));
			System.out.println("The multiply of "+numd1+" and "+numd2+" is "+calculator.multiply(numd1, numd2)+"\n");
		}
		
		else if(choice==3)
		{
			System.out.println("Now exiting From Program");
			System.exit(0);
		}
		else
		{
			System.err.println("Invalid choice");
		}
		
		
		
		
		
		}
		
		
		
		
	}

}
