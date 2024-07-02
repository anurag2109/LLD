package Behavioral_Design_Patterns.state_pattern.state;

import Behavioral_Design_Patterns.state_pattern.VendingMachine;

public class IdleState implements State {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {
        vendingMachine.addMoney(amount);
        vendingMachine.setState(vendingMachine.getHasMoneyState());
        System.out.println("Money inserted: " + amount);
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Insert money first.");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Insert money and select item first.");
    }

    @Override
    public void refund() {
        System.out.println("No money to refund.");
    }
}