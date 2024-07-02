package Behavioral_Design_Patterns.state_pattern;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.insertMoney(50);
        vendingMachine.selectItem("Soda");
        vendingMachine.dispenseItem();

        vendingMachine.insertMoney(100);
        vendingMachine.selectItem("Chips");
        vendingMachine.refund();
    }
}
