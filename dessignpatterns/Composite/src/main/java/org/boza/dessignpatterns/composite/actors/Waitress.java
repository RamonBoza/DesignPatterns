package org.boza.dessignpatterns.composite.actors;

import org.boza.dessignpatterns.composite.entities.MenuComponent;

public class Waitress {

    MenuComponent menu;

    public Waitress(final MenuComponent menu){
        this.menu = menu;
    }

    public void printMenu(){
        menu.print();
    }

}