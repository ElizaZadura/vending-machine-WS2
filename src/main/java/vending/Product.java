package vending;

public abstract class Product {
    private static int idCounter = 0;
    private final int id;
    private double price;
    private String productName;

    protected Product(int id, double price, String productName) {
        this.id = ++idCounter;
        setPrice(price);
        setProductName(productName);
    }

    protected Product(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new IllegalArgumentException("Price is not valid");
        }
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if(productName == null || productName.trim().isEmpty()){
            throw new IllegalArgumentException("Product name is not valid");
        }
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }

    public abstract String examine();
    public abstract String use();


}
