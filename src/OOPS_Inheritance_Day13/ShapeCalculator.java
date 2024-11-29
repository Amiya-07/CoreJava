package OOPS_Inheritance_Day13;

public class ShapeCalculator 
{
	final double pi = 3.141;
	public int calculateArea(int sideLength)
	{
		return sideLength*sideLength;
	}
	
	public int calculateArea(int length, int width)
	{
		return length*width;
	}
	
	public double calculateArea(double radius)
	{
		double area = pi*radius*radius;
		return area;
	}
}
/*
ShapeCalculator - Method overloading


take 4 public Method :

calculateArea(int sideLength): Returns the area of a square (side * side).

calculateArea(int length, int width): Returns the area of a rectangle (length * width).

calculateArea(double radius): Returns the area of a circle (p * radius^2).
*/