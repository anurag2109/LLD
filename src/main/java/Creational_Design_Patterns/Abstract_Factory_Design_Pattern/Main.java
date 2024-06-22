package Creational_Design_Patterns.Abstract_Factory_Design_Pattern;

import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.AbstractProducer.AbstractProducer;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.EconomyCar1;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory.EconomyCarFactory;

public class Main {
    public static void main(String[] args) {
        AbstractProducer abstractProducer = new AbstractProducer();
        EconomyCarFactory economyCarFactory = (EconomyCarFactory) abstractProducer.getFactoryInstance("Economical");
        EconomyCar1 economyCar1 = (EconomyCar1) economyCarFactory.getCarInstance(400000);
        System.out.println(economyCar1.getTopSpeed());
    }
}
