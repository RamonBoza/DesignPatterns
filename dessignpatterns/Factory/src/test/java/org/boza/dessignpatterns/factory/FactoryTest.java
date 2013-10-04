package org.boza.dessignpatterns.factory;

import org.boza.dessignpatterns.factory.Controller.impl.Pizzeria;
import org.boza.dessignpatterns.factory.entities.BasePizza;
import org.boza.dessignpatterns.factory.entities.CheesePizza;
import org.boza.dessignpatterns.factory.entities.Pizza;
import org.boza.dessignpatterns.factory.entities.enums.PizzaType;
import org.boza.dessignpatterns.factory.pattern.impl.PizzaFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FactoryTest {

    @Test
    public void testFactoryReturnsCheesePizza(){
        Pizzeria restaurant = new Pizzeria(new PizzaFactory());
        Pizza pizza = restaurant.preparePizza(PizzaType.CHEESE);
        Assert.assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testFactoryReturnsBasePizza(){
        Pizzeria restaurant = new Pizzeria(new PizzaFactory());
        Pizza pizza = restaurant.preparePizza(PizzaType.CARBONARA);
        Assert.assertTrue(pizza instanceof BasePizza);
    }
}
