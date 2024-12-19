package OOPS_FunctionalInterface_Day1;
import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {

	public static void main(String[] args) 
	{
		Predicate<Integer> p1 = num -> num%2==0;
		
		Predicate<Integer> p2 = num ->
		{
			int c=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					c++;
				}
				
			}
			if(c==2)
			{
				return true;
			}
			else
			{
				return false;
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		
		System.out.println(a+" is a Even Number? "+p1.test(a));
		
		System.out.println(a+" is a Prime  Number ? "+p2.test(a));
		
		
		
		
		
	}

}
/*
Ques - 1
--------------
Create a Java program that demonstrates the usage of the Predicate interface to test
 if a number is even or prime. Your task is to implement a method testPredicate in the
  NumberTester class that tests a given number against a provided predicate.

NumberTester Class(ELC):

In the main method:
Define two predicates:
isEven: Checks if a given number is even.
isPrime: Checks if a given number is prime.

Define a sample integer number (e.g., 13).

Test each predicate using the testPredicate method and print the result indicating whether the number satisfies each predicate.

Test Cases:

Test Case 1:
Input: 13
Output:
Is 13 even? false
Is 13 prime? true

Test Case 2:
Input: 5
Output:
Is 5 even? false
Is 5 prime? true

Test Case 3:
Input: 20
Output:
Is 20 even? true
Is 20 prime? false
*/