package at.ac.htlinn.design_pattern.strategy.payment;

public class Article {

	private String articleId;
	private String name;
	private double price;

	public Article(String articleId, String name, int cost) {
		this.articleId = articleId;
		this.name = name;
		this.price = cost;
	}

	public String getUpcCode() {
		return articleId;
	}

	public double getPrice() {
		return price;
	}

	public String getArticleId() {
		return articleId;
	}

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
