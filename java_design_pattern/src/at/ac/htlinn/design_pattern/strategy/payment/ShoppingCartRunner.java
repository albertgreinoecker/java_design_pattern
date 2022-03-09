package at.ac.htlinn.design_pattern.strategy.payment;

public class ShoppingCartRunner {

	public static void main(String[] args) {
ShoppingCart cart = new ShoppingCart();
		
		Article item1 = new Article("1", "Raspberry Pi 4",10);
		Article item2 = new Article("2", "Java ist auch eine Insel",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new PaypalStrategy("user1@gmail.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Max Mustermann", "1234567890123456", "445", "12/23"));

	}

}
