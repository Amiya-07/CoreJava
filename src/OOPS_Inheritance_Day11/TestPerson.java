package OOPS_Inheritance_Day11;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : "); String name = sc.next();
		System.out.print("Street "); String street = sc.next();
		System.out.print("City "); String city = sc.next();
		

		Address a = new Address(street, city);
		Person p = new Person(name,a);
		
		p.displayInfo();
	}

}
