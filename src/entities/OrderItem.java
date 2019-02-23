package entities;

public class OrderItem {
	private Integer quantity;
	private Double productPrice;
	
	Product product = new Product();
	
	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double productPrice, Product product) {
		this.quantity = quantity;
		this.productPrice = productPrice;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return productPrice;
	}

	public void setPrice(Double price) {
		this.productPrice = price;
	}
	
	public Double subTotal() {
		return quantity * productPrice;
	}
	public String toString() {
		return product.getName()
		+ ", $"
		+ String.format("%.2f", productPrice) 
		+ ", Quantity: " 
		+ quantity  
		+ ", Subtotal: $" 
		+ String.format("%.2f", subTotal());
	}
}
