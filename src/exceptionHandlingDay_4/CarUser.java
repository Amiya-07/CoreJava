package exceptionHandlingDay_4;

public class CarUser {

	public static void main(String[] args)
	{
		try
		{
			CarTest.stop("go");
			CarTest.stop("stop");
		}
		catch(CarStoppedException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("===================================");
		
		try
		{
			CarTest.puncture("move");
			CarTest.puncture("puncture");
		}
		catch(CarPuncturedException e)
		{
			e.printStackTrace();
			
		}
		
		System.out.println("===================================");
		
		try
		{
			CarTest.carHeat(40);
			CarTest.carHeat(60);
		}
		catch(CarHeatException e)
		{
			e.printStackTrace();
			
		}
	}

}
