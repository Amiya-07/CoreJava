package Day_6;

public class SurfaceAreaOfCylinder {

	public static void main(String[] args)
	{
		double r = Double.parseDouble(args[0]);
		double h = Double.parseDouble(args[1]);
		final double pi = 3.14;
		double s= (2*pi*r*r)*(2*pi*r*h);
		System.out.println("The surface area of cyclinder is "+s);
		
	}

}
//2 pi square r * 2 pi r h 
//(take the pi as 3.14).