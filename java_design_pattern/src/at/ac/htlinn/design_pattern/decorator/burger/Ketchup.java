package at.ac.htlinn.design_pattern.decorator.burger;

public class Ketchup extends Belag {

	public Ketchup(Burger b) {
		super(b);
	}

	@Override
	public double getPreis() {
		return b.getPreis() + 0.01;
	}

	@Override
	public String getBeschreibung() {
		return b.getBeschreibung() + " Ketchup";
	}
}
