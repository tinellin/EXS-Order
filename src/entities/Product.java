package entities;

public class Product {
	private String productName;
	private Double productPrice;
	
	public Product() {
	}

	public Product(String productName, Double productPrice) {

		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public Double getPrice() {
		return productPrice;
	}

	public void setPrice(Double price) {
		this.productPrice = price;
	}
}
