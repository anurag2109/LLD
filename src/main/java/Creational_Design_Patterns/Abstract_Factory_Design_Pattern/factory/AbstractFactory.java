package Creational_Design_Patterns.Abstract_Factory_Design_Pattern.factory;

import Creational_Design_Patterns.Abstract_Factory_Design_Pattern.cars.Car;

public interface AbstractFactory {
    public Car getCarInstance(int price);
}
