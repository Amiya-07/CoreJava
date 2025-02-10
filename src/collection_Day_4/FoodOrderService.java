package collection_Day_4;

import java.util.ArrayList;

public class FoodOrderService 
{
	private ArrayList<FoodCustomer> al = new ArrayList<>();
	
	
	public void placeOrder(FoodCustomer fc)
	{
		al.add(fc);
	}
	
	public boolean isFirstTimeCustomer(FoodCustomer fc)
	{
		boolean flag=true;
		for(FoodCustomer c : al)
		{
			if(c.getPhoneNumber().equals(fc.getPhoneNumber()))
			{
				flag=false;
			}
		}
		return flag;
		
		
	}
	
	public double calculateBill(FoodCustomer fc)
	{
		if(isFirstTimeCustomer(fc))
		{
			System.out.println(fc.getName()+" You are not an Existing Customer");
			al.add(fc);
			return 0;
		}
		else 
		{
			return 50.00;
		}
		
	}
	
	public void printBill(FoodCustomer fc)
	{
		System.out.println("");
		System.out.println(fc.getName()+" Your Order Has been Confirmed \nYour Delivery Charge is : "+calculateBill(fc));
	}
}
