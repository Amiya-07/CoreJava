package OOPS_Day7;

import java.util.Scanner;

public class RetailStoreDemo 
{

	public static void main(String[] args)
	{
		int count =0;Scanner sc = new Scanner(System.in);
		System.out.println("Enter total item");
		int frequence=sc.nextInt();
		while(frequence>count)
		{
			System.out.print("Enter item name ");
			String name = sc.nextLine();
			name = sc.nextLine();
			System.out.print("Enter item price per quantity ");
			double pricePerUnit = sc.nextDouble();
			System.out.print("Enter item quantity");
			int quantity = sc.nextInt();
			RetailStore r = new RetailStore(name, pricePerUnit, quantity);
			System.out.println("Total Value of "+r.getItemName()+" in Stock: "+r.calculateTotalValue());
			count++;
		}
	}
		


}
