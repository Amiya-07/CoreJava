package exceptionHandlingDay_2;

public class ClassCastExceptionDemo 
{
	public static void handleClassCastException() 
	{
			Object []o = {"Hello",true,"java"};

			try {
			for(Object i :o)
			{
				
				String s = (String) i;
				System.out.println("Casting Successfull : "+s);
				
			}	
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	
	public static void main(String[] args)
	{
			handleClassCastException();
	}
}
/*
Create a class named ClassCastExceptionDemo:

Implement a static method handleClassCastException :
Access Modifier : public
Non-Access Modifier : static
return type : void
parameters : No-Param

Declares an array of Object type and initializes it with some values of different types.
Attempts to cast each element of the array to String.
Use a try block to perform the casting.
Catch ClassCastException and print an appropriate message along with the stack trace.
Create a main method:

Inside the main method, call the handleClassCastException method.
Test the program:

*/