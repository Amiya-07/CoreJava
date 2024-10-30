package Day_6;

public class CelsiusToFarenheit {

	public static void main(String[] args) 
	{
		double c= Double.parseDouble(args[0]);
		double f = ((9*c)/5)+32;
		System.out.println(c+" Celsius is "+f+" Farenheit");
	}

}
