package at.ac.htlinn.design_pattern.factory.kitchen;

public class Kitchen {
	public static void main(String[] args) {
		Meal s1 = MealFactory.prepare("Lasagne");
		System.out.println(s1.getClass().getName());

	}
}
