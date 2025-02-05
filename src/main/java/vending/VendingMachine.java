package vending;

public interface VendingMachine {
    String selectProduct(int id);
    String useProduct(int id);
    String getDescription();
    void endSession();
    String getDescription(int id);
    void addCurrency(double amount);
    int getBalance();
    Product request(int id);
    String[] getProducts();
}
