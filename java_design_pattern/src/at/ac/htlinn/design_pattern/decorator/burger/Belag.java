package at.ac.htlinn.design_pattern.decorator.burger;

public abstract class Belag implements Burger{
	Burger b;

	public Belag(Burger b) {
		this.b = b;
	}
}
