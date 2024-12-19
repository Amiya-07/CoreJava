package OOPS_FunctionalInterface_Day1;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

	public static void main(String[] args)
	{
		Function<String,Integer> f1 = str ->
		{
			return str.length();
		};
		
		Function<Integer,Double> f2 = n -> 
		{
			return n/2.0;
		};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		String str = sc.nextLine();
		
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		
		System.out.println("String length of "+ str +" is : "+f1.apply(str) );
		System.out.println("Result of dividing "+n+" by 2: "+f2.apply(n) );
	}

}
/*
Ques - 4
------------
Design a Java program that utilizes the Function interface within the
main method to perform operations on both strings and integers. Implement 
two functions for string operations: calculating the string length and 
formatting an integer division result. Your task is to implement these 
operations inline within the main method using lambda expressions.

FunctionApplier class(ELC):

Requirements:
Main Method:

Define two lambda expressions by using Function<-,->:
getStringLength: Computes and returns the length of the input string.
divideAndFormat: Takes an integer input, divides it by 2.0, and returns the formatted result as a double.

Print the results by calling the functions.


*/