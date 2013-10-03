package org.boza.dessignpatterns.composite.entities;

import java.lang.String;
import java.lang.System;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarean;
    double price;

    public MenuItem(final String name,
                    final String description,
                    final boolean isVegetarean,
                    final double price){
        this.name = name;
        this.description = description;
        this.vegetarean = isVegetarean;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public boolean isVegetarian(){
        return vegetarean;
    }

    public double getPrice(){
        return price;
    }

    public void print(){
        System.out.print(" " + getName());
        if(isVegetarian()){
            System.out.print("(v)");
        }
        System.out.print("\t"+getPrice());
        System.out.print("\t\t"+getDescription());
    }


}