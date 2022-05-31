package at.ac.htlinn.design_pattern.decorator.burger;

public class BroetchenBoden implements Burger {

	@Override
	public double getPreis() {
		return 0.1;
	}

	@Override
	public String getBeschreibung() {
		return "Broetchenboden";
	}
}
