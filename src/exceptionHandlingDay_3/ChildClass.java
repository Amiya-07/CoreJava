package exceptionHandlingDay_3;

public class ChildClass extends ParentClass
{
	public void loadingClass(String s) throws ClassNotFoundException
	{
		if(s.length()==0)
		{
			throw new IllegalArgumentException("Class Name cannot be Empty");
		}
		System.out.println("Class Loaded successfully :"+Class.forName(s));
	}
}
/*
Create a subclass BLC named ChildClass:

Override the loadingClass method.
method name : loadingClass
Access modifier : public 
return type : void
parameter :String

Handle the case for an empty string, throwing IllegalArgumentException with message "Class name cannot be empty".
Call the superclass method if the string is valid.
Handle the ClassNotFoundException within the method .
*/