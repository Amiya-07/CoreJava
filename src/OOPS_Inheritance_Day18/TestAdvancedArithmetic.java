package OOPS_Inheritance_Day18;

public class TestAdvancedArithmetic {

	public static void main(String[] args) 
	{
		MyCalculator m = new MyCalculator();
		System.out.println("Divisor sum of 6 is : "+m.divisorSum(6));
	}

}
/*
Then write a class called MyCalculator which implements the interface AdvancedArithmetic. 

divisorSum function just takes an integer as input and return the sum of all its divisors.

For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12. 

Sample Input 
6 
Sample Output 
12 
Explanation 
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12. 
A class Testing is given to you with a main method. Use this class to test your solution's classes and meth
ods.
*/