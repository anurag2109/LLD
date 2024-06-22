package Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory;

import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.Car;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.LuxuryCar1;
import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.LuxuryCar2;

public class LuxuryCarFactory implements AbstractFactory{

    @Override
    public Car getCarInstance(int price) {
        if(price >= 4500000 && price <= 9000000) return new LuxuryCar1();
        else if(price > 9000000) return new LuxuryCar2();
        return null;
    }
}
