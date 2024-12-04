package OOPS_Inheritance_Day14;

public class Shape 
{
	public static Shape randShape()
	{
		int n= (int)(Math.random()*3);
		switch (n)
		{
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2: 
			return new Triangle(); 
		default:
			return new Shape();
		}
		
	}
		
		public void draw()
		{
			System.out.println("Shape draw");
			
		}
		
		public void erase()
		{
			System.out.println("Shape Erase");
		}
		
	
}
/*
 Methods:
public static Shape randshape()
No Argument constructor
randshape(): Using switch ((int) (Math.random()*3))
case 0: create an object for Circle Object using return
case 1: create an object for Square Object using return
case 2: create an object for Triangle Object using return
default: Print as default message
finally return an object for Shape class
Use this class to test your solution's class and methods in main method

For Shape class
Methods: In draw():void and erase():void and No argument constructor
draw(): print "shape draw"
erase(): print "Shape erase"
For Circle class sub class of Shape class
Methods: In draw():void and erase():void and No argument constructor
Override:
draw() method print "Circle draw" and erase() method print "Circle erase"
*/
