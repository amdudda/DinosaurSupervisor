package com.anna_dudda;

public class DinoSupervisor {

    public static void main(String[] args) {
	// write your code here
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur apatosaurus = new Dinosaur();

        // make t_rex roar, swipe, and stomp
        System.out.println("trex sez:");
        t_rex.roar(true);
        t_rex.stomp();
        // make velocirapor roar, but not swipe.
        System.out.println("velociraptor sez:");
        velociraptor.roar(false);
        // make apatosaurus roar, but not swipe.
        System.out.println("Apatosaurus sez:");
        apatosaurus.roar(false);
    }
}
