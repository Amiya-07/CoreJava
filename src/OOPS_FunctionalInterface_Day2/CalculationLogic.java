package OOPS_FunctionalInterface_Day2;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a1 = sc.nextInt();
		Predicate<Integer>p1 =  q -> q%2==0;
		System.out.println(a1+" is Even : "+testPredicate(a1,p1));
		
		Predicate<Integer> p2 =  q -> q>10;
		System.out.println(a1+" is greater than 10 : "+testPredicate(a1,p2));
		
		Predicate<Integer> p3 =  q -> 
		{
			for(int i=2;i<=q/2;i++)
			{
				if(q%i==0)
				{
					return false;
				}
			}
			return true;
		};
		System.out.println(a1+" is prime: "+testPredicate(a1,p3));
		sc.close();
		
	}
	
	public static boolean testPredicate(int a, Predicate<Integer> p1)
	{
		return p1.test(a);
	}

}
/*
Write a Java program that defines a method testPredicate to test a given number against a provided predicate.
class name CalculationLogic(ELC) :

Method name : testPredicate
Access Modifier : public
Non-Access Modifier : static
return type : boolean
parameters : int, Predicate<Integer>
This method should return a boolean value indicating whether the given number satisfies the provided predicate.



In the main method:
Define three predicates:
isEven: Checks if a given number is even.
isGreaterThanTen: Checks if a given number is greater than 10.
isPrime: ishat it tests the given number against the provided predicate and returns the result.

Define a sample integer number (e.g., 13).
Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.


*/
