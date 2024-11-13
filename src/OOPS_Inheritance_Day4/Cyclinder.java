package OOPS_Inheritance_Day4;

public class Cyclinder extends Circle  
{
	double height;
	
	public Cyclinder()
	{
		super();
	}
	public Cyclinder(double radius , double height)
	{
		super(radius);
		if(height>0)
		{
			this.height = height;
		}
		else
		{
			System.err.print("\nERROR Invalid input");
			System.exit(0);
		}
		
	}
	
	public double getVolume()
	{
		double volume = super.pi*super.radius*super.radius*this.height;
		return volume;
		
	}
	
}
/*
reate a sub class of Circle with name Cylinder 
-----------------------------------------------

Add below details to the class

1. Instance variables:

height: double.

2. Create a No constructor that assigns default values to instance variables.

3. Create parameterized constructor that accepts radius, height.

4. Create below methods,

Method name: getVolume

Return type: double

This method should return the volume of the cylinder. Return -1 if height is negative.
*/
