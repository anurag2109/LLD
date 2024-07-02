package Behavioral_Design_Patterns.state_pattern.state;

public interface State {
    void insertMoney(int amount);
    void selectItem(String item);
    void dispenseItem();
    void refund();
}

