package at.ac.htlinn.design_pattern.decorator.burger;

public class Fleischloabl extends Belag {

	public Fleischloabl(Burger b) {
		super(b);
	}

	@Override
	public double getPreis() {
		return b.getPreis() + 1.2;
	}

	@Override
	public String getBeschreibung() {
		return b.getBeschreibung() + " Fleischloabl";
	}
}
