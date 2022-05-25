package at.ac.htlinn.design_pattern.decorator.burger;

public class Tomaten extends Belag {

	public Tomaten(Burger b) {
		super(b);
	}

	@Override
	public double getPreis() {
		return b.getPreis() + 0.2;
	}

	@Override
	public String getBeschreibung() {
		return b.getBeschreibung() + " Tomaten";
	}
}
