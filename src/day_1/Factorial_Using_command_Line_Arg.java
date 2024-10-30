package day_1;

public class Factorial_Using_command_Line_Arg {

	public static void main(String[] s) 
	{
		int a=Integer.parseInt(s[0]);
		int s1= 1;
		for(int j=1;j<=a;j++)
		{
			s1=s1*j;
		}
		System.out.println("The factorial of the number is : "+s1);
	}

}
