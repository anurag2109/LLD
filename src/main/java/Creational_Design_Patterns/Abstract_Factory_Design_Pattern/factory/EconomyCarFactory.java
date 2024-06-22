package Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory;

import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.Car;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.EconomyCar1;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.EconomyCar2;

public class EconomyCarFactory implements AbstractFactory{

    @Override
    public Car getCarInstance(int price) {
        if(price <= 500000) return new EconomyCar1();
        else if(price > 500000) return new EconomyCar2();
        return null;
    }
}
