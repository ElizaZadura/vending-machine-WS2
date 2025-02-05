package vending;

public class Crunchie extends Product {
    protected Crunchie(int id, double price, String productName) {
        super(id, price, productName);
    }

    protected Crunchie(int id) {
        super(id);
    }

    @Override
    public String examine() {
        return "";
    }

    @Override
    public String use() {
        return "";
    }
}
