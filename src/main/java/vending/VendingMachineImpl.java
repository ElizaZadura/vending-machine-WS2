package vending;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    private final List<Product> products;
    private int depositPool;

    public VendingMachineImpl() {
        this.products = new ArrayList<>();
        this.depositPool = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String selectProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return "Selected: " + product.getProductName() + " for $" + product.getPrice();
            }
        }
        return "Product not found.";
    }

    @Override
    public String useProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice()) {
                    depositPool -= product.getPrice();
                    return "Dispensed: " + product.getProductName();
                } else {
                    return "Insufficient balance.";
                }
            }
        }
        return "Product not found.";
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Available products:\n");
        for (Product product : products) {
            description.append(product.toString()).append("\n");
        }
        return description.toString();
    }

    @Override
    public void endSession() {
        depositPool = 0; // Reset the deposit pool
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product.toString();
            }
        }
        return "Product not found.";
    }

    @Override
    public void addCurrency(double amount) {
        depositPool += amount; // Assuming depositPool is in cents
    }

    @Override
    public int getBalance() {
        return depositPool; // Return the current balance
    }

    @Override
    public Product request(int id) {
        return null;
    }

    @Override
    public String[] getProduct() {
        return new String[0];
    }
}
