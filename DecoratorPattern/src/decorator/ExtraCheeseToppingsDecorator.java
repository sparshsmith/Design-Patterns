package decorator;

import base.Pizza;

public class ExtraCheeseToppingsDecorator extends ToppingsDecorator{
    Pizza pizza;

    public ExtraCheeseToppingsDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return this.pizza.cost() + 50;
    }
}
