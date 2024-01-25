import base.FarmhousePizza;
import base.MargheritaPizza;
import base.Pizza;
import decorator.ExtraCheeseToppingsDecorator;
import decorator.MushroomToppingsDecorator;

public class Main {
    public static void main(String[] args) {
        Pizza farmhousePizzaWithExtraChese = new ExtraCheeseToppingsDecorator(new FarmhousePizza());
        System.out.println("Total cost for Farmhouse Pizza with Extra cheese is : "+ farmhousePizzaWithExtraChese.cost());

        Pizza margheriaPizzaWithExtraCheeseAndMushroom = new ExtraCheeseToppingsDecorator(new MushroomToppingsDecorator(new MargheritaPizza()));
        System.out.println("Total cost for Margherita Pizza with extra cheese and mushroom is : "+ margheriaPizzaWithExtraCheeseAndMushroom.cost());

    }
}