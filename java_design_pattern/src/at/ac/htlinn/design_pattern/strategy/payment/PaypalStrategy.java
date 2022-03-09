package at.ac.htlinn.design_pattern.strategy.payment;

public class PaypalStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public PaypalStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println(amount + " paid using Paypal.");
	}

	@Override
	public String toString() {
		return "PaypalStrategy [emailId=" + emailId + ", password=" + password + "]";
	}

	
}
