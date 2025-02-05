package collection_Day_1;

import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> al = new ArrayList<>();
	
	public void addCabCustomer( CabCustomer c )
	{
		al.add(c);
	}
	
	public boolean isFirstCustomer(CabCustomer c)
	{
		for(CabCustomer a : al)
		{
			if(a.getPhonenumber().equals(c.getPhonenumber()))
			{
				return false;
			}
		}
		return true;
	}
	
	public int calculateBill(CabCustomer c)
	{
		if(isFirstCustomer(c))
		{
			addCabCustomer(c);
			return 0;
		}
		else if(c.getDistance()<=4)
		{
			return 80;
		}else
		{
			return 80+c.getDistance()*6;
		}
	}
	
	public void printBill(CabCustomer c)
	{
		System.out.println(c.getCustomerName()+" Please pay your bill of Rs."+calculateBill(c));
	}
}
