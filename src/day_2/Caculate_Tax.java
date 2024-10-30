package day_2;

public class Caculate_Tax {

	public static void main(String[] args) 
	{
		int a =Integer.parseInt(args[0]);
		float t = 4.9f;
		float f = a*t/100;
		//System.out.println("The tax for given salary is : "+f);
		//System.out.format("The tax for given salary is :%.2f", f);
		System.out.printf("The tax for given salary is :%.2f", f);
	}

}
