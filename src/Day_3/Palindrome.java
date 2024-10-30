package Day_3;

public class Palindrome {

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		int r =0;
		for(int i=n;i!=0;i=i/10)
		{
			r =(r*10)+i%10;
		}
		if(r==n)
		{
			System.out.println(n+" is a palindrome number");
		}
		else
		{
			System.out.println(n+" is not a palindrome number");
		}
	}

}
