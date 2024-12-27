package exceptionHandlingDay_1;

public class ClassNotFoundDemo {

	public ClassNotFoundDemo()
	{
		  Class c;
		  try 
		  {
			  c = Class.forName("exceptionHandlingDay_1.TestClass"); 
			  
			  System.out.println("Hii");
		  }
		  catch (ClassNotFoundException e) 
		  {
			  e.printStackTrace(); 
		  }
	}

}


/*
ClassNotFoundException…
a. Write a program to create a class ‘ClassNotFoundExpDemo’ which implements default constructor as follows ,

b. Implement the main method and inside main method create an object of ClassNotFoundExpDemo class.
c. Now check the O/P.
*/