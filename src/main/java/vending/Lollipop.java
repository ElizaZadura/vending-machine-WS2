package vending;

public class Lollipop extends Product {
    private static boolean isGood;
    private static Size size;
    public Lollipop(int id, double price, String productName) {
        super(id, price, productName);
        super.setProductName("Lollipop");
        super.setPrice(30.00);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
    @Override
    public int getId() {
        return super.getId();
    }
    @Override
    public String getProductName() {
        return super.getProductName();
    }
    @Override
    public void setProductName(String name) {
        super.setProductName(name);
    }
    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    public static boolean getIsGood() {
        return isGood;
    }

    public static void setIsGood(boolean isGood) {
        Lollipop.isGood = isGood;
    }

    @Override
    public String toString() {
        return "Lollipop{}";
    }

    @Override
    public String examine (){

        return super.toString();
    }

    @Override
    public String use() {
        return "";
    }
}
