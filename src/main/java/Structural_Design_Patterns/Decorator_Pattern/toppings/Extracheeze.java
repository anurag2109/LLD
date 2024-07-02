package Structural_Design_Patterns.Decorator_Pattern.toppings;

import Structural_Design_Patterns.Decorator_Pattern.basePizza.BasePizza;

public class Extracheeze extends ToppingDecorator{

    BasePizza pizza;
    public Extracheeze(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return this.pizza.cost() + 15;
    }
}
