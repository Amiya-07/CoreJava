package OOPS_Inheritance_Day19;

public class BSNL implements SIMcardInterface {

	@Override
	public String getPhoneNumber() {
		return "8328859835";

	}

	@Override
	public String getNetworkProvider() 
	{
		return "BSNL";

	}

	@Override
	public void getSimStatus() 
	{
		System.out.println("Sim Status : Activate");
	}

}
