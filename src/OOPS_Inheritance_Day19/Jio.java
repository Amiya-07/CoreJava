package OOPS_Inheritance_Day19;

public class Jio implements SIMcardInterface {

	@Override
	public String getPhoneNumber()
	{
		return "6377141732";
	}

	@Override
	public String getNetworkProvider() 
	{
		return "Jio";
	}

	@Override
	public void getSimStatus() 
	{
		
		System.out.println("Sim Status : Active");
	}

}
