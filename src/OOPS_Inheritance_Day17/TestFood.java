package OOPS_Inheritance_Day17;

public class TestFood {

	public static void main(String[] args) 
	{
		int n=0;
		
		Egg e = new Egg(4.0, 1.1, 13.4);
		n++;
		System.out.println(n);
		e.getType();
		e.getTaste();
		e.getMacroNutrients();
		
		
		Bread b = new Bread(8.9,2.1,7.8);
		n++;
		System.out.println(n);
		b.getType();
		b.getTaste();
		b.getMacroNutrients();
		
	}

}
