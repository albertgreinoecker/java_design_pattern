package at.ac.htlinn.design_pattern.factory.kitchen;

import java.util.ArrayList;
import java.util.List;


public class Pizza implements Meal {

	@Override
	public void prepare() {
		System.out.println("belegen");
		System.out.println("in den ofen");
	}

	@Override
	public List<Ingredient> ingredients() {
		List<Ingredient> zutaten = new ArrayList<Ingredient>();
		zutaten.add(new Ingredient("Teig", 1));
		zutaten.add(new Ingredient("Tomatensosse", 1));
		zutaten.add(new Ingredient("Kaese", 10));
		return zutaten;
	}

}
