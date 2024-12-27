package exceptionHandlingDay_1;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			int a [] = new int[2];
			
			System.out.println(a[3]);
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Message : "+e.getMessage());
			System.out.println("Exception : "+e.toString());
			e.printStackTrace();
			
		}
	}

}
/*
2. ArrayIndexOutOfBoundException…
a. Write a program to create a class ‘ArrayIndexExceptionDemo’ which implements main method.
b. Inside main method create an array of int type as follows.
int a[] = new int[2];
c. Now try to print the value of a[3] in the console where handle the Exceptions coming from this line using try catch.
d. In the catch block handle this exception using ArrayIndexOutOfBound Exception and print appropriate
 message in the console from this Exception.
*/