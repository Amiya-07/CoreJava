package exceptionHandlingDay_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc) 
		{
			System.out.println("Enter first number");
			int a = sc.nextInt();
			System.out.println("Enter second number");
			int b = sc.nextInt();
			
			System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
			
		}
		catch(InputMismatchException e)
		{
			System.out.println("Message : "+e.getMessage());
			System.out.println("Exception : "+e.toString());
			e.printStackTrace();
			
		}
	}

}
/*
1. Exception and Messages…
a. Write a program to create a class ‘SimpleExceptionDemo’ ,which implements main method.
b. This program should read two integer numbers for the variables a and b from console using Scanner class.
c. If you enter any other character except number (0 - 9 ) then the error is caught by InputMisMatchException object.
d. After that using following methods print the information about the error occurring causes in the console. 
getMessages() printStackTrace() println() toString()
*/