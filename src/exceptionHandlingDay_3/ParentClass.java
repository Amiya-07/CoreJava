package exceptionHandlingDay_3;

public class ParentClass 
{
	public void loadingClass(String s) throws ClassNotFoundException
	{
		System.out.println("Class Loaded successfully :"+Class.forName(s));
	}
}
/*
Create a superclass BLC named ParentClass:
Accepts a String parameter representing the class name to be loaded.

Implement a method loadingClass :
method name : loadingClass
Access modifier : public 
return type : void
parameter :String

Load the class by using Class.forName(-) method.
Throws a checked exception, ClassNotFoundException, if the class is not found.



*/