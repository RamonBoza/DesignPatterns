package org.boza.dessignpatterns.factory.pattern;

import org.boza.dessignpatterns.factory.entities.enums.PizzaType;

public interface Factory<T> {

    /**
     * Creates a new element of type @param <T>
     * @return a new Object
     * @param type the type of object to create
     */
    T create(PizzaType type);

}
