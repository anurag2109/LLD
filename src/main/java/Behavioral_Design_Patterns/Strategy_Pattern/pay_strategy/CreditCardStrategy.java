package Behavioral_Design_Patterns.Strategy_Pattern.pay_strategy;

public class CreditCardStrategy implements PayStrategy{



    public CreditCardStrategy() {

    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount has been paid through credit card");
    }
}
