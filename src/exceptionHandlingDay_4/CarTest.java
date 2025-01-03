package exceptionHandlingDay_4;

public class CarTest 
{
	public static void stop(String s) throws CarStoppedException
	{
		if(s.equalsIgnoreCase("stop"))
		{
			throw new CarStoppedException("Car stopped for some reason");
		}
		else
		{
			System.out.println("Car not stalled");
		}
	}
	
	public static void puncture(String p) throws CarPuncturedException
	{
		
		if(p.equalsIgnoreCase("puncture"))
		{
			throw new CarPuncturedException("Car is punctured");
		}
		else
		{
			System.out.println("Car not punctured");
		}
	}
	
	public static void carHeat(int h) throws CarHeatException
	{
		
		if(h>50)
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius");
		}
		else
		{
			System.out.println("Car Temperature is normal");
		}
	}
	
	
}
/*
For CarTest class:
Contains static methods to simulate car operations and throw exceptions based on certain conditions.

Instance Variables:
No Instance Variables

Methods:
Stop(String): void: static

This class throws CarStoppedException. If the string is  stop  throw new exception and get the message or else message is Car not stall
Methods:
puncture(String): void: static: public

This class throws CarPunctureException. If the string is  puncture  throw new exception and 
get the message line  Car is punctured  or else message is Car not stall.

Methods:
carHeat(int): void: static : public

This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it 
throw new exception and get the message line  Car is heated more the 50 degrees  or else message is Car not stall.
*/