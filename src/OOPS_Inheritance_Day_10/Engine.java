package OOPS_Inheritance_Day_10;

public class Engine 
{
	private String model;

	public Engine(String model) 
	{
		super();
		this.model = model;
	}
	
	public String getModel()
	{
		return model;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + "]";
	}
	
	
}
/*
Create the Engine Class
-----------------------
A class to represent an engine with a model attribute.
Variable Declaration:
private String model; — This variable stores the model of the engine.

Constructor Declaration
public Engine(String model) — A constructor that initializes the engine model.

Getter Method Declaration:
public String getModel() — A method to get the engine model.

toString Method Declaration:
@Override public String toString() — A method to return a string representation of 
the engine.
*/