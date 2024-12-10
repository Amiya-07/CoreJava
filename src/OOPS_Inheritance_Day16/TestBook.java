package OOPS_Inheritance_Day16;

public class TestBook 
{
	public static void main(String [] args)
	{
		MyBook m = new MyBook();
		
		m.setTitle("Atomic habit");
		System.out.println("Book Title : "+m.getTitle());
	}
}
