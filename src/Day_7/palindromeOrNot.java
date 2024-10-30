package Day_7;
public class palindromeOrNot {

	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		int r=0,c=0 ;
		for(int i=a;i!=0;i=i/10)
		{
			r=(r*10)+i%10;
			c++;
		}
		if(a<=0)
		{
			System.out.println("-1");
			System.out.println("kindly provide the +ve number only");
		}
		else
		{
			if (c==3)
			{
				if(r==a)
				{
					System.out.println("1");
					System.out.println("the number is pallindrome");
				}
				else
				{
					System.out.println("0");
					System.out.println("the number is not a pallindrome");
				}
			}
			else
			{
				System.out.println("-2");
				System.out.println("this program can check the operation for the 3 number only");
			}
		}
	}
}

/*Write a java program which print the given three digit number is palindrome or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is pallindrome
if 0 then print a message that the number is not a pallindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.
*/
