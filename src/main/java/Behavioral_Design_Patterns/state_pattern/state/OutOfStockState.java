package Behavioral_Design_Patterns.state_pattern.state;

import Behavioral_Design_Patterns.state_pattern.VendingMachine;

public class OutOfStockState implements State {
    private VendingMachine vendingMachine;

    public OutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        System.out.println("Item out of stock. Cannot insert money.");
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Item out of stock.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item out of stock.");
    }

    @Override
    public void refund() {
        vendingMachine.refundMoney();
        vendingMachine.setState(vendingMachine.getIdleState());
        System.out.println("Money refunded.");
    }
}