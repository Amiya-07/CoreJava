package collection_Day_4;

import java.util.ArrayList;

public class AirlineBookingService
{
	ArrayList<AirlineCustomer> al = new ArrayList<>();
	
	public void bookFlight(AirlineCustomer ac)
	{
		al.add(ac);
	}
	
	public boolean isFirstTimeCustomer(AirlineCustomer ac)
	{
		boolean flag=true;
		for(AirlineCustomer a : al)
		{
			if(a.getPhoneNumber().equals(ac.getPhoneNumber())) {
				flag=false;
			}
		}
		return flag;
	}
	
	public double calculateBookingCost(AirlineCustomer ac)
	{
		if(isFirstTimeCustomer(ac))
		{
			System.out.println("\n"+ac.getFullName()+" You are not an Existing customer");
			al.add(ac);
			return 0.0;
		}
		else
		{
			System.out.println("\n"+ac.getFullName()+" You are an Existing customer");
			return 1500;
		}
	}
	
	public void printBookingDetails(AirlineCustomer ac)
	{
		System.out.println(ac.getFullName()+" Your total Booking cost is "+calculateBookingCost(ac)+"\n");
	}
}
