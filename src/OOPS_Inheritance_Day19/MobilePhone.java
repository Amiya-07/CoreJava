package OOPS_Inheritance_Day19;

public class MobilePhone implements MobilePhoneInterface 
{
	private SIMcardInterface sc ;

	@Override
	public void inserting(SIMcardInterface s)
	{
		this.sc=s;
		System.out.println(s.getNetworkProvider()+" Sim card is Inserted");

	}

	@Override
	public void removingSimcard(SIMcardInterface s) 
	{
		this.sc=null;
		System.out.println(s.getNetworkProvider()+" Sim card is removed");
	}

	@Override
	public void makingCalls(SIMcardInterface s)
	{
		System.out.println(s.getNetworkProvider()+" Sim is ready to make calls");
	}

	@Override
	public void sendingText(SIMcardInterface s) 
	{
		System.out.println(s.getNetworkProvider()+" Sim is ready to send text messages");
	}

}
