package Day_6;

public class CompoundInterest {

	public static void main(String[] args)
	{
		double rate = Double.parseDouble(args[0]);
		double principle = Double.parseDouble(args[1]);
		double amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("after applying compound interest total amount is : "+amount);
	}

}
//amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));