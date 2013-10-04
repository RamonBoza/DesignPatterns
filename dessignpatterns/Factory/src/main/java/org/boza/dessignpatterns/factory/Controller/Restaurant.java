package org.boza.dessignpatterns.factory.Controller;

import org.boza.dessignpatterns.factory.entities.enums.PizzaType;

public interface Restaurant<T> {

    /**
     * Prepares a meat for that restaurant
     * @return
     */
    T preparePizza(final PizzaType type);
}
