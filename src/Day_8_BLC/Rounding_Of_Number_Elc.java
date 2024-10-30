package Day_8_BLC;

import java.util.Scanner;

public class Rounding_Of_Number_Elc {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd number");
		int n3 = sc.nextInt();
		System.out.println("The sum of rounded number is "+Rounding_Of_Number_Blc.num(n1,n2,n3));
	}

}
