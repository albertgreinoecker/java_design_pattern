package at.ac.htlinn.design_pattern.factory.kitchen;

import java.util.ArrayList;
import java.util.List;


public class Lasagne implements Meal {

	@Override
	public void prepare() {
		System.out.println("Pferd kochen");
		System.out.println("Blätter drauflegen");
	}

	@Override
	public List<Ingredient> ingredients() {
		List<Ingredient> zutaten = new ArrayList<Ingredient>();
		zutaten.add(new Ingredient("Pferd", 1));
		zutaten.add(new Ingredient("LasagneBlätter", 20));
		return zutaten;
	}
}
