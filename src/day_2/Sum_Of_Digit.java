package day_2;

public class Sum_Of_Digit {

	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b=a/10;
		int c =a%10;
		System.out.println("The sum of each digit is : "+(b+c));
	}

}
