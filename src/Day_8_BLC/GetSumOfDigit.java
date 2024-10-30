package Day_8_BLC;

public class GetSumOfDigit {

	public static int num(int num ) 
	{
		int r =0;
		for(int i =num ; i!=0;i=i/10)
		{
			r=r+(i%10);
		}
		return r;
	}

}
