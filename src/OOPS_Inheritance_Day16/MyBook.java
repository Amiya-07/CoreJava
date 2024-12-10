package OOPS_Inheritance_Day16;

public class MyBook extends Book
{
	@Override
	public void setTitle(String title)
	{
		super.title=title;
	}
	
	@Override
	public String getTitle()
	{
		return super.title;
	}
}
/*
Create a sub classes of  Book called MyBook class with following specifications 
Methods: 
override setTitle from parent class.
        This method takes the book title as parameter and assigns it into the instance variable of parent class.
override getTitle from parent class.
*/