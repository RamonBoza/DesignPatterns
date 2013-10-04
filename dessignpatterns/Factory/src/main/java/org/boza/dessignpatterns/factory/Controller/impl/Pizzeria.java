package org.boza.dessignpatterns.factory.Controller.impl;

import org.boza.dessignpatterns.factory.Controller.Restaurant;
import org.boza.dessignpatterns.factory.entities.Pizza;
import org.boza.dessignpatterns.factory.entities.enums.PizzaType;
import org.boza.dessignpatterns.factory.pattern.impl.PizzaFactory;

public class Pizzeria implements Restaurant<Pizza> {

    private final PizzaFactory factory;

    public Pizzeria(final PizzaFactory factory){
        this.factory = factory;
    }

    @Override
    public Pizza preparePizza(final PizzaType type) {
        Pizza pizza;

        pizza = factory.create(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
