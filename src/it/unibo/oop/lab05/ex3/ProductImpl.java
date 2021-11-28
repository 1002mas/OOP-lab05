package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

    private final String productName;
    private double quantity;

    public ProductImpl(String productName, double quantity) {
	super();
	this.productName = productName;
	this.quantity = quantity;
    }

    public String getName() {
	return productName;
    }

    public double getQuantity() {
	return quantity;
    }

    public String toString() {
	return "ProductImpl [productName=" + productName + ", quantity=" + quantity + "]";
    }

}
