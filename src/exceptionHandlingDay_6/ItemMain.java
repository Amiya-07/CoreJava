package exceptionHandlingDay_6;

import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ShoppingCart s = new ShoppingCart(20);
		try(sc)
		{
			System.out.println("Enter quantity you want");
			int q = sc.nextInt();
			
			s.addItem(q);
			s.addItemUnchecked(q);
		}
		catch(OutOfStockException e)
		{
			System.err.println(e.getMessage());
		}
		catch(InvalidItemException e)
		{
			System.err.println(e.getMessage());
		}
	}

}
/*
In the main method, create an instance of ShoppingCart with an initial stock of 50 items.
-> Demonstrate the use of addItem for valid and invalid quantities, handling the InvalidItemException.
-> Demonstrate the use of addItemUnchecked for valid and invalid quantities, handling both IllegalArgumentException and
OutOfStockException.

*/