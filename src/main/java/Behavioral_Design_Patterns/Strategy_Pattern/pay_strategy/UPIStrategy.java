package Behavioral_Design_Patterns.Strategy_Pattern.pay_strategy;

public class UPIStrategy implements PayStrategy{


    public UPIStrategy() {
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount paid by UPI");
    }
}
