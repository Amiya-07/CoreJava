package Day_4;

public class NetBillDiscount {

	public static void main(String[] args)
	{
		int nb=Integer.parseInt(args[0]);
		double fr,d;
		int dp;
		if (nb<5000)
		{
			dp=5;
			d=(nb*0.05);
		}
		else if(nb>5000 && nb<10000)
		{
			dp=10;
			d=(nb*0.1);
		}
		else
		{
			dp=15;
			d=(nb*0.15);
		}
		fr=nb-d;
		System.out.println("The payable amount is "+fr+" discount percentage is "+dp+" Discount is "+d);
	}

}
