package OOPS_Inheritance_Day8;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Electronic\n2.Clothing\n3.Exit");
			int choice = sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter the Product name ");
				String pName = sc.next();
				System.out.println("Enter the product price ");
				double price = sc.nextDouble();
				System.out.println("Enter the brand name ");
				String bName = sc.next();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				Electronics e = new Electronics(pName, price, bName );
				e.displayInfo();
				System.out.println("the total bill is : "+e.calculateTotalCost(quantity));
			}
			else if (choice==2)
			{
				System.out.println("Enter the Product name ");
				String pName = sc.next();
				System.out.println("Enter the product price ");
				double price = sc.nextDouble();
				System.out.println("Enter product size ");
				String size = sc.next();
				System.out.println("Enter quantity");
				int quantity = sc.nextInt();
				Clothing c = new Clothing(pName, price,size );
				c.displayInfo();
				System.out.println("the total bill is : "+c.calculateTotalCost(quantity));
			}
			else
			{
				System.exit(0);
			}
		}
		
	}

}
