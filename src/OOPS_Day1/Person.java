package OOPS_Day1;

public class Person
{
	String name ;
	int age ;
	String cname;
	String city;
	double marks;
	
	public void PersonalData()
    {
		System.out.println("My name is : "+name);
		System.out.println("My age is : "+age);
		System.out.println("My hometown is : "+city);
	}
	public void Education()
	{
		System.out.println("I've completed my B.tech from "+cname);
		System.out.println("I secured "+marks+" percentage in B.tech");
	}
}
