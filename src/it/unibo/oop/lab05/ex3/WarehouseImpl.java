package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse {

    private LinkedHashSet<Product> products;

    public WarehouseImpl() {
	this.products = new LinkedHashSet<>();
    }

    public void addProduct(Product p) {
	if (!containsProduct(p)) {
	    products.add(p);
	}
    }

    public Set<String> allNames() {
	Set<String> names = new TreeSet<>();
	for (Product p : products) {
	    names.add(p.getName());
	}
	return names;
    }

    public Set<Product> allProducts() {
	return Set.copyOf(this.products);
    }

    public boolean containsProduct(Product p) {
	return products.contains(p);
    }

    public double getQuantity(String name) {
	for (Product p : products) {
	    if (p.getName().equals(name)) {
		return p.getQuantity();
	    }
	}
	return 0;
    }

}
