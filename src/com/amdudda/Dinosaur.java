package com.amdudda;

/**
 * Created by tk0654wm on 9/28/2015.
 */
public class Dinosaur {

    public void roar(boolean swipe) {
        System.out.println("RRRAWWWRRRR!!!!");
        if (swipe) System.out.println("Also, CLAWSWIPE!");
    }

    public void stomp() {
        System.out.println("STOMP!");
    }

    public void evolve() {
        // chickens are supposedly dinosaurs, I guess?
        System.out.println("Billions of years from now, I will shrink and say cluck!");
    }
}
