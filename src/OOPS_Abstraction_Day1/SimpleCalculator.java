package OOPS_Abstraction_Day1;

public class SimpleCalculator implements Calculator
{

	@Override
	public void calculateSum(int... args)
	{
		int s =0;
		for(int i : args)
		{
			s+=i;
		}
		
		System.out.println("Sum of digits : "+s);
	}
	
}
/*
Take one normal class SimpleCalculator which implements Calculator interface

in this class just implement the overriden method calculateSum and write the specific logic in this method.
*/