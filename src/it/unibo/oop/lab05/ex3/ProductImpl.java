package it.unibo.oop.lab05.ex3;

import java.util.Objects;

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

    public int hashCode() {
        return Objects.hash(productName);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductImpl other = (ProductImpl) obj;
        return Objects.equals(productName, other.productName);
    }

    public String toString() {
        return "ProductImpl [productName=" + productName + ", quantity=" + quantity + "]";
    }

}
