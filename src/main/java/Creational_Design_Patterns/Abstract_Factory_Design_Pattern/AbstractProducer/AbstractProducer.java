package Creational_Design_Patterns.Abstract_Factory_Design_Pattern.AbstractProducer;

import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory.AbstractFactory;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory.EconomyCarFactory;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory.LuxuryCarFactory;

public class AbstractProducer {
    public AbstractFactory getFactoryInstance(String value){
        if(value.equals("Luxury")) return new LuxuryCarFactory();
        else if(value.equals("Economical")) return new EconomyCarFactory();
        else return null;
    }
}
