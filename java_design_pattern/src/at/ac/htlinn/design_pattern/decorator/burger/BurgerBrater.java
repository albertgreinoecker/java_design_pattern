package at.ac.htlinn.design_pattern.decorator.burger;

public class BurgerBrater {

	public static void main(String[] args) {
		Burger boden = new BroetchenBoden();
		Burger komplett = new SalatBlatt(new Ketchup(new Fleischloabl(new Tomaten(boden))));
		System.out.println("Zutaten zum Burger: " + komplett.getBeschreibung());
		System.out.println("Preis: " + komplett.getPreis());
	}
}
