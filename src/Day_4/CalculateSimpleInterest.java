package Day_4;

public class CalculateSimpleInterest {

	public static void main(String[] args)
	{
		double principle=Double.parseDouble(args[0]);
		double time=Double.parseDouble(args[1]);
		double rateOfInterest=Double.parseDouble(args[2]);
		double simpleInterest=(principle*rateOfInterest*time)/100;
		System.out.println("The simple interest is :"+simpleInterest);
	}

}

