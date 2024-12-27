package exceptionHandlingDay_1;

import java.util.Scanner;

public class IlligalStateExceptionDemo {

	public static void main(String[] args) 
	{
		throwIllegalException();
		
	}

	
	public static void throwIllegalException( ) 
	{ 
		 try
		 { 
		 	throw new IllegalStateException("MyException");
		  }
		  catch(IllegalStateException e)
		  { 
		  	System.out.println("caught:" +e); 
		  	e.printStackTrace();
		  }
	}
	
}
/*
IllegalStateException…
a. Write a program to create a class ‘IllegalStateExceptionDemo’ which implements
 a method as follows static void throwIllegalException( ) 
{ 
	 try
	 { 
	 	throw new IllegalStateException("MyException");
	  }
	  catch(IllegalStateException objA)
	  { 
	  	System.out.println("caught:" +objA); 
	  }
}
b. Implement the main method, and from main method call the above method.
c. Check the output of the program.
*/