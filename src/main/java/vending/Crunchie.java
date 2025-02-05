package vending;

public class Crunchie extends Product {
    private boolean isNuts;
    protected Crunchie(double price, String productName) {
        super(price, productName);
    }

    public boolean isNuts() {
        return isNuts;
    }

    public void setNuts(boolean nuts) {
        isNuts = nuts;
    }

    @Override
    public String examine() {
        return super.toString();
    }

    @Override
    public String use() {
        return isNuts() ? "Don't eat me, I'm nutty!" : "All nut free";
    }
}
