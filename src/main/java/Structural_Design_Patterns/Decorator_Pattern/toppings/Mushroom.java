package Structural_Design_Patterns.Decorator_Pattern.toppings;

import Structural_Design_Patterns.Decorator_Pattern.basePizza.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza pizza;
    public Mushroom(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 40;
    }
}
