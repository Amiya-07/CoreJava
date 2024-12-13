package OOPS_Inheritance_Day19;

public class Airtel implements SIMcardInterface {

	@Override
	public String getPhoneNumber() {
		return "9187685434";

	}

	@Override
	public String getNetworkProvider() 
	{
		return "Airtel";

	}

	@Override
	public void getSimStatus() 
	{
		System.out.println("Sim Status : Activate");
	}

}
