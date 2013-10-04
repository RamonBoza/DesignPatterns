package org.boza.dessignpatterns.factory.pattern.impl;

import org.boza.dessignpatterns.factory.entities.BasePizza;
import org.boza.dessignpatterns.factory.entities.CheesePizza;
import org.boza.dessignpatterns.factory.entities.Pizza;
import org.boza.dessignpatterns.factory.entities.enums.PizzaType;
import org.boza.dessignpatterns.factory.pattern.Factory;


public class PizzaFactory implements Factory<Pizza> {
    @Override
    public Pizza create(PizzaType type) {
        Pizza pizza;
        if(type.equals(PizzaType.CHEESE)){
            pizza = new CheesePizza();
        }else {
            pizza = new BasePizza();
        }

        return pizza;
    }
}
