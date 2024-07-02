package Behavioral_Design_Patterns.state_pattern.state;

import Behavioral_Design_Patterns.state_pattern.VendingMachine;

public class HasMoneyState implements State {
    private VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        vendingMachine.addMoney(amount);
        System.out.println("Additional money inserted: " + amount);
    }

    @Override
    public void selectItem(String item) {
        if (vendingMachine.isItemAvailable(item)) {
            vendingMachine.setSelectedItem(item);
            vendingMachine.setState(vendingMachine.getDispenseItemState());
            System.out.println("Item selected: " + item);
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
            System.out.println("Item out of stock: " + item);
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select an item first.");
    }

    @Override
    public void refund() {
        vendingMachine.refundMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
        System.out.println("Money refunded.");
    }
}
