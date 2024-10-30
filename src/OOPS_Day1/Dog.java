package OOPS_Day1;

// properties
public class Dog 
{
	String name ;
	int age ;
	double height;
	public void getDogInformation()
	{
		System.out.println("The name of dog is "+name);
		System.out.println("The height of dog is "+height);
		System.out.println("The age of dog is "+age);
		
	}
	public void bark ()
	{
		System.out.println("BOW BOW");
	}
}
//
/*
Write a Program on OOPs to define Dog class properties and behaviour.

properties :

name    : String
height  : double
age	: int

behaviour:

getDogInformation() : public void
             bark() : public void   
*/