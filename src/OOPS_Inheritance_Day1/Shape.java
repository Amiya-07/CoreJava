package OOPS_Inheritance_Day1;

public class Shape 
{
	String color;

	public Shape(String color) 
	{
		super();
		this.color = color;
	}
	public void displayColor()
	{
		System.out.println("The color is "+this.color);
	}


}

class Circle extends Shape
{
	final double pi = 3.141;
	double radius;

	public Circle(String color, double radius) 
	{
		super(color);
		this.radius = radius;
	} 
	public double area ()
	{
		double area = pi * radius * radius;
		return area;
	}
	

}