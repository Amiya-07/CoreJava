package OOPS_Day2;

public class Car 
{
	String companyName;
	String modelName;
	double price;
	public void getDetails(String cName , String mName , double cost)
	{
		companyName= cName;
		modelName = mName;
		price = cost;
	}
	public void showDetails()
	{
		System.out.println("The car brand is "+ companyName);
		System.out.println("The car model is "+ modelName);
		System.out.println("The car price is "+ price);
	}
}
