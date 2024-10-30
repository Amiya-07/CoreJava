package Day_3;

public class farenheit_To_Celcius {

	public static void main(String[] args) 
	{
		double f = Double.parseDouble(args[0]);
		double c = ((f-32)*5)/9;
		System.out.println(f+" farenheit is "+c+" Celcius");

	}

}
