package OOPS_Inheritance_Day4;

public class Circle 
{
	double radius ;
	final double pi = 3.141;
	public Circle ()
	{
		super();
		
	}
	public Circle (double radius )
	{
		super();
		if(radius>0)
		{
			this.radius=radius;
		}
		else
		{
			System.err.print("ERROR Invalid input");
			System.exit(0);
		}
		
	}
	
	public double getArea()
	{
		
		double area = pi*radius*radius;
		return area;
	}
	
}
/*
 * Class Circle is given to you. 
----------------------------

Add below details to the class

1. Instance variables:

radius: double.

2. Create a no constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius.

4. Create below methods,

Method name: getArea

Return type: double

This method should return the area of the circle. Return -1 if radius is negative
*/
