package Day_8_BLC;
import java.util.Scanner;

public class Get_Sum_Of_Digit_Elc {

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
		System.out.println("The sum of digit is "+GetSumOfDigit.num(n));
		}
	}

}
