package Day_7;

public class SumOfDigitUsingRules {

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		if(a<99&&a>10)
		{
			int r = (a/10)+(a%10);
			System.out.println("sum of it's digits"+r);
		}
		else if (a<0)
		{
			System.out.println("-3");
		}
		else if (a>99) 
		{
			System.out.println("-2");
		}
		else 
		{
			System.out.println("-1");
		}
	}

}
/*Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1
*/