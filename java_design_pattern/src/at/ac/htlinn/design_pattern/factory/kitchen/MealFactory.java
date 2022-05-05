package at.ac.htlinn.design_pattern.factory.kitchen;

public class MealFactory 
{
	public static Meal prepare(String name)
	{
		switch (name)
		{
			case "Lasagne" : return new Lasagne();
			case "Pizza" : return new Pizza();
			case "Schnitzel" : return new Schnitzel();
			default: return null;
		}		
	}
}
