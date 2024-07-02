package Behavioral_Design_Patterns.state_pattern.state;

import Behavioral_Design_Patterns.state_pattern.VendingMachine;

public class DispenseItemState implements State {
    private VendingMachine vendingMachine;

    public DispenseItemState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Wait, dispensing item.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Wait, dispensing item.");
    }

    @Override
    public void dispenseItem() {
        if (vendingMachine.dispenseSelectedItem()) {
            vendingMachine.setState(vendingMachine.getIdleState());
            System.out.println("Item dispensed.");
        } else {
            vendingMachine.setState(vendingMachine.getOutOfStockState());
            System.out.println("Item out of stock.");
        }
    }

    @Override
    public void refund() {
        System.out.println("Cannot refund while dispensing.");
    }
}