package Behavioral_Design_Patterns.Strategy_Pattern;

import Behavioral_Design_Patterns.Strategy_Pattern.pay_strategy.CreditCardStrategy;
import Behavioral_Design_Patterns.Strategy_Pattern.pay_strategy.PayStrategy;
import Behavioral_Design_Patterns.Strategy_Pattern.pay_strategy.UPIStrategy;

public class Main {
    public static void main(String[] args) {
        PayStrategy creditCardPayStrategy = new CreditCardStrategy();
        creditCardPayStrategy.pay(1000);

        PayStrategy upiPayStaPayStrategy = new UPIStrategy();
        upiPayStaPayStrategy.pay(2000);
    }
}
