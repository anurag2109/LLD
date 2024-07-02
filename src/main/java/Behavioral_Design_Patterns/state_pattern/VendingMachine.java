package Behavioral_Design_Patterns.state_pattern;

import Behavioral_Design_Patterns.state_pattern.state.*;

public class VendingMachine {
    private State idleState;
    private State hasMoneyState;
    private State dispenseItemState;
    private State outOfStockState;
    private State currentState;
    private int money;
    private String selectedItem;

    public VendingMachine() {
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        dispenseItemState = new DispenseItemState(this);
        outOfStockState = new OutOfStockState(this);
        currentState = idleState;
        money = 0;
        selectedItem = "";
    }

    public void insertMoney(int amount) {
        currentState.insertMoney(amount);
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void refund() {
        currentState.refund();
    }

    public void addMoney(int amount) {
        money += amount;
    }

    public void refundMoney() {
        System.out.println("Refunding money: " + money);
        money = 0;
    }

    public boolean isItemAvailable(String item) {
        // Logic to check item availability
        return true;
    }

    public boolean dispenseSelectedItem() {
        // Logic to dispense item
        return true;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public State getDispenseItemState() {
        return dispenseItemState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }
}
