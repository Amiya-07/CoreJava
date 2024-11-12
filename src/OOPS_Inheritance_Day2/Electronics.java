package OOPS_Inheritance_Day2;

public class Electronics extends Product
{
	private String brandName;

	public Electronics(String name, double price, String brandName) 
	{
		super(name, price);
		this.brandName = brandName;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("The brand name is : "+this.brandName);
	}
	

}
