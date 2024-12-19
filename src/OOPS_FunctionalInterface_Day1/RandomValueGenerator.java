package OOPS_FunctionalInterface_Day1;

import java.util.Scanner;
import java.util.function.Supplier;

public class RandomValueGenerator 
{

	public static void main(String[] args) 
	{
		Supplier<String> s1 = () ->
		{
			
			return "NIT"+(int)((Math.random()*(9999-1000+1))+1000);
		}; 
		
		
		Supplier<Integer> s2 = () ->
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter min range");
			int min = sc.nextInt();
			System.out.println("Enter max range");
			int max=sc.nextInt();
			int range = max-min+1;
			return (int)((Math.random()*range)+1000);
		};
		
		
		System.out.println(s1.get());
		System.out.println(s2.get());
	}

}
/*
Ques - 3
-----------
Create a Java program that utilizes the Supplier interface to generate 
random values. Implement two Supplier instances: one for generating a random
 alphanumeric string in the format "NIT" followed by four random digits, and 
 another for generating a random integer within a specified range.

RandomValueGenerator class(ELC):

Inside the main method, define two consumers:
String Supplier (stringSupplier):
Generates a random alphanumeric string in the format "NIT" followed by four random digits.
Example output: "NIT1234", "NIT5678", etc.

Integer Supplier (integerSupplier):
Generates a random integer between a specified minimum and maximum value (inclusive).
Example output: 57, 92, etc.

Tasks to Implement:
Define the stringSupplier and integerSupplier instances using the Supplier interface and lambda expressions.

Inside the main method, use these suppliers to generate random values and print the results.


*/