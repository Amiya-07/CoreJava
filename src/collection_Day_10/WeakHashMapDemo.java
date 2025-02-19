
package collection_Day_10;

import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) 
	{
		WeakHashMap<Employee,String> hs = new WeakHashMap<>();
		Employee e = new Employee("Amiya",24);
		hs.put(e,"1");
		System.out.println(hs.size());
		e = null;
		//It is a weak type  so it will call the Employee class Finalize() method
		System.gc();

	}

}

class Employee
{
	String name;
	int age;
	public Employee(String name, int age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	
	@Override
	public void finalize()
	{
		System.out.println("calling Employee class Finalize Method");
	}
}
/*
Write a program to show that WeakHashMap keys are weak in comparison to HashMap,
 if key is a reference key and it's value is set to be null.
*/