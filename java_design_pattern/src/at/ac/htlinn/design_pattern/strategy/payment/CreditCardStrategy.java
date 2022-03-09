package at.ac.htlinn.design_pattern.strategy.payment;

/**
 * based on:
 * https://www.journaldev.com/1754/strategy-design-pattern-in-java-example-tutorial
 */
public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate) {
		this.name = nm;
		this.cardNumber = ccNum;
		this.cvv = cvv;
		this.dateOfExpiry = expiryDate;
	}

	@Override
	public void pay(double amount) {
		System.out.println(amount + " paid with credit/debit card");
	}

	@Override
	public String toString() {
		return "CreditCardStrategy [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpiry="
				+ dateOfExpiry + "]";
	}
	
	

}
