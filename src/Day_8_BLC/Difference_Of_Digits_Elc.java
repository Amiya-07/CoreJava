package Day_8_BLC;

import java.util.Scanner;

public class Difference_Of_Digits_Elc
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if(n>=100||n<10)
		{
			System.out.println("Please enter 2 digit number");
		}
		else
		{
		System.out.println("The difference of digits is "+Difference_Of_digit_Blc.num(n));
		}
	}

}
