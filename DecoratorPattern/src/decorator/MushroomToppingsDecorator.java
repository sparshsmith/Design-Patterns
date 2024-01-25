package decorator;

import base.Pizza;

public class MushroomToppingsDecorator extends ToppingsDecorator{

    Pizza pizza;

    public MushroomToppingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return pizza.cost() + 30;
    }
}
