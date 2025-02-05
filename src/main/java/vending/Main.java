package vending;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    Product product = new Lollipop(1, 30.00, "Lollipop");
        System.out.println(product.examine());
        Product product2 = new Lollipop(2, 45.00, "Lollipop");
        System.out.println(product2.examine());

        var vendingMachine = new VendingMachineImpl(10);
        vendingMachine.addProduct(product);
        vendingMachine.addProduct(product2);
        vendingMachine.addCurrency(100.00);
        System.out.println(vendingMachine.getDescription());
        System.out.println(vendingMachine.selectProduct(1));
        System.out.println(vendingMachine.useProduct(1));

/*        vendingMachine.addCurrency(100.00);
        vendingMachine.selectProduct(1);
        vendingMachine.useProduct(1);
        vendingMachine.endSession();*/
    }



}
