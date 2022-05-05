package at.ac.htlinn.design_pattern.factory.kitchen;

import java.util.ArrayList;
import java.util.List;


public class Schnitzel implements Meal {

	@Override
	public void prepare() {
		System.out.println("Klopfen");
		System.out.println("In Mehl wenden");
		System.out.println("...");
		System.out.println("panieren");
		System.out.println("braten");
	}

	@Override
	public List<Ingredient> ingredients() {
		List<Ingredient> zutaten = new ArrayList<Ingredient>();
		zutaten.add(new Ingredient("Kalb", 1));
		zutaten.add(new Ingredient("Eier", 2));
		zutaten.add(new Ingredient("Mehl", 1));
		zutaten.add(new Ingredient("Brösel", 1));
		return zutaten;
	}

}
