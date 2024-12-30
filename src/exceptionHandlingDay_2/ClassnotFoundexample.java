package exceptionHandlingDay_2;

public class ClassnotFoundexample 
{

	public ClassnotFoundexample(String className)
	{
		Class c ;
		
		try
		{
			c = Class.forName(className);
			System.out.println(c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		ClassnotFoundexample a = new ClassnotFoundexample("java.lang.String");
	}
	

}
/*
Create a class named ClassNotFoundExpDemo:

Implement a constructor that takes a String parameter representing the class name.
Access Modifier : public
parameter : String

Inside the constructor, declare a variable of type Class<?>.
Use a try block to attempt to load the class using Class.forName(className).
Catch ClassNotFoundException and print an appropriate message along with the stack trace.

Create a main method:
Inside the main method, create a Scanner object to read input from the user.
Prompt the user to enter a class name.
Read the user's input and pass it to the ClassNotFoundExpDemo constructor.
Close the Scanner object.

*/