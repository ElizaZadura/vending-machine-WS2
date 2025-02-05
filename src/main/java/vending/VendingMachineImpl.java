package vending;

public class VendingMachineImpl implements VendingMachine {
    private Product[] products;
    private int productCount; // To keep track of the number of products
    private int depositPool;

    public VendingMachineImpl(int capacity) {
        this.products = new Product[capacity]; // Initialize the array with a specified capacity
        this.productCount = 0; // Start with no products
        this.depositPool = 0;
    }

    public void addProduct(Product product) {
        if (productCount >= products.length) {
            // Resize the array
            Product[] newProducts = new Product[products.length * 2]; // Double the size
            System.arraycopy(products, 0, newProducts, 0, products.length);
            products = newProducts;
        }
        products[productCount++] = product; // Add product and increment count
    }


    @Override
    public String selectProduct(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == id) {
                return "Selected: " + products[i].getProductName() + " for " + products[i].getPrice() + " kr";
            }
        }
        return "Product not found.";
    }

    @Override
    public String useProduct(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == id) {
                if (depositPool >= products[i].getPrice()) {
                    depositPool -= (int) products[i].getPrice();
                    return "Dispensed: " + products[i].getProductName();
                } else {
                    return "Insufficient balance. You have " + depositPool + " kr";
                }
            }
        }
        return "Product not found.";
    }

    @Override
    public String getDescription() {
        StringBuilder description = new StringBuilder("Available products:\n");
        for (int i = 0; i < productCount; i++) {
            description.append(products[i].toString()).append("\n");
        }
        return description.toString();
    }

    @Override
    public void endSession() {
        depositPool = 0; // Reset the deposit pool
    }

    @Override
    public String getDescription(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].getId() == id) {
                return products[i].toString();
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
        String[] productDescriptions = new String[productCount];
        for (int i = 0; i < productCount; i++) {
            productDescriptions[i] = "ID: " + products[i].getId() + ", Name: " + products[i].getProductName() + ", Price: " + products[i].getPrice();
        }
        return productDescriptions;
    }
}
