package Structural_Design_Patterns.Decorator_Pattern;

import Structural_Design_Patterns.Decorator_Pattern.basePizza.BasePizza;
import Structural_Design_Patterns.Decorator_Pattern.basePizza.FarmhousePizza;
import Structural_Design_Patterns.Decorator_Pattern.toppings.Extracheeze;
import Structural_Design_Patterns.Decorator_Pattern.toppings.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new Extracheeze(new FarmhousePizza()));
        System.out.println(pizza.cost());

    }
}
