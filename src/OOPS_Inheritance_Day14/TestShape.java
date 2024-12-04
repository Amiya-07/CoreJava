package OOPS_Inheritance_Day14;

public class TestShape 
{

	public static void main(String[] args) 
	{
		Shape s =Shape.randShape();
		
		if( s instanceof Circle)
		{
			
			s.draw();
			s.erase();
		}
		else if( s instanceof Triangle)
		{
			
			s.draw();
			s.erase();
		}
		else if( s instanceof Square)
		{
		
			s.draw();
			s.erase();
		}
	}

}
