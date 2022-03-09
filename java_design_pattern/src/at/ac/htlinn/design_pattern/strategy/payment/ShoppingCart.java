package at.ac.htlinn.design_pattern.strategy.payment;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	List<Article> items;

	public ShoppingCart() {
		this.items = new ArrayList<Article>();
	}

	public void addItem(Article item) {
		this.items.add(item);
	}

	public void removeItem(Article item) {
		this.items.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;
		for (Article item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + "]";
	}
	
	
	
}