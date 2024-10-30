package Day_5;

public class CalculateProfitLoss {

	public static void main(String[] args)
	{
		int cp = Integer.parseInt(args[0]);
		int sp = Integer.parseInt(args[1]);
		int p , l ,pp,lp;
		l = cp - sp;
		lp=(l*																			cp)/100;
		p=sp-cp;
		pp=(p*cp)/100;
		if (sp>cp)
		{
			System.out.println("Profit is "+p+" and profit percentage is "+pp+"%");
		}
		else
		{
			System.out.println("loss is "+l+" and loss percentage is "+lp+"%");
		}
	}

}
/*
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/