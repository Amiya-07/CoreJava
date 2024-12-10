package OOPS_Inheritance_Day17;

public class Bread extends Food
{
	String type ="Vegetarian";
	public Bread(double proteins, double fats, double carbs)
	{
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
	}
	
	{
		super.tastyScore = 8;
	}
	
	@Override
	public void getMacroNutrients()
	{
		System.out.println("A slice of bread has "+super.proteins +" gms of protein, "+super.fats+" gms of fats and "+super.carbs+" gms of carbohydrates.");
	}
	
	public void getType()
	{
		System.out.println("Bread Type : "+this.type);
	}
	
	public void getTaste()
	{
		System.out.println("Taste: "+this.tastyScore);
	}
}
/*
3. class Bread which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 8
String type = "vegetarian"
void getMacroNutrients => prints(" A slice of bread has "+super.proteins+" gms of protein, "+super.fats+" gms of fats and "+super.carbs+" gms of carbohydrates.")
*/