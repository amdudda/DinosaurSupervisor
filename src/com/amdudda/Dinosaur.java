package com.amdudda;

/**
 * Created by amdudda on 9/28/2015.
 */
public class Dinosaur {

    String name;
    String color;
    int size;
    String diet; // carnivore, herbivore, or omnivore

    public void roar(boolean swipe) {
        System.out.println("RRRAWWWRRRR!!!!");
        if (swipe) System.out.println("Also, CLAWSWIPE!");
    }

    public void stomp() {
        System.out.println("STOMP!");
    } // end method stomp

    public void evolve() {
        // chickens are supposedly dinosaurs, I guess?
        System.out.println(String.format("Billions of years from now, " +
                "%s will shrink and say cluck!", this.name));
    } // end method evolve


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}  // end class Dinosaur

//testing branching