package Day_7;

public class NextMultipleOfHundred 
{
	public static void main (String [] args)
	{
		int a = Integer.parseInt(args[0]);
		if(a<=0)
		{
			System.out.println("-1");
		}
		else
		{
			int n = (100-(a%100))+a;
			System.out.println("The next multiple of 100 for "+a+" is "+n);
		}
	}
}
/*
Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.
*/