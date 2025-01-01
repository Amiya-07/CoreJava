package exceptionHandlingDay_3;

public class Testparent {

	public static void main(String[] args) 
	{
		try
		{
			ParentClass c = new ChildClass();
			c.loadingClass("java.lang.String");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}

}
		