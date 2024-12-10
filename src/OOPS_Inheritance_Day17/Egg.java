package OOPS_Inheritance_Day17;

public class Egg extends Food 
{
	String type ="Non-vegetarian";
	
	public Egg(double proteins, double fats, double carbs)
	{
		super();
		super.proteins = proteins;
		super.fats = fats;
		super.carbs = carbs;
	}
	
	{
	super.tastyScore = 7;
	}
	
	@Override
	public void getMacroNutrients()
	{
		System.out.println("An egg has "+super.proteins+" gms of protein, "+super.fats+" gms of fats and "+super.carbs+" gms of carbohydrates.");
	}
	
	public void getType()
	{
		System.out.println("Egg Type : "+this.type);
	}
	
	public void getTaste()
	{
		System.out.println("Taste: "+super.tastyScore);
	}
}
/*
2. class Egg which extends class Food and has the following properties:

Constructor to initialize the attributes (proteins, fats, and carbs) in the same order.
int tastyScore = 7
String type = "non-vegetarian"
void getMacroNutrients => prints("An egg has [this.proteins] gms of protein, [this.fats] gms of fats and [this.carbs] gms of carbohydrates.")

*/