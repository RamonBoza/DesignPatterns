package org.boza.dessignpatterns.composite.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

    String name;
    String description;

    List<MenuComponent> menuElements = new ArrayList<MenuComponent>();

    public Menu(final String name, final String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void add(MenuComponent component){
        menuElements.add(component);
    }

    public void remove(MenuComponent component){
        menuElements.remove(component);
    }

    public MenuComponent getChild(final int index){
        return menuElements.get(index);
    }

    public void print(){
        System.out.print("\n"+getName());
        System.out.println(", " + getDescription());
        System.out.println("--------------------");

        Iterator it = menuElements.iterator();
        while(it.hasNext()){
            MenuComponent comp = (MenuComponent) it.next();
            comp.print();
        }
    }
}