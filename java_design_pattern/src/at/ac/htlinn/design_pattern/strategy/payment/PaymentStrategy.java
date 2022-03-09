package at.ac.htlinn.design_pattern.strategy.payment;

/**
 * based on: https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 */
public interface PaymentStrategy {
	public void pay(int amount);
}
