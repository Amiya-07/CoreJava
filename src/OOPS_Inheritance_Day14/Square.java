package OOPS_Inheritance_Day14;

public class Square extends Shape
{
	public void draw()
	{
		System.out.println("Square Draw");
	}
	public void erase()
	{
		System.out.println("Square Erase");
	}
}
/*
For Square class sub class of Shape class

Take No argument constructor

Methods: 
 draw():void 
 erase():void 
 
Override:
draw() method print "Square draw" and erase() method print "Square erase"
*/