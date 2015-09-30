package com.amdudda;

public class DinoSupervisor {

    public static void main(String[] args) {
	// write your code here
        Dinosaur t_rex = new Dinosaur();
        t_rex.name = "Tyrannosaurus Rex";
        t_rex.color = "octarine";
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur apatosaurus = new Dinosaur();
        apatosaurus.color = "indigo";
        apatosaurus.name = "Brontosaurus";

        // make t_rex roar, swipe, and stomp.
        System.out.println("trex sez:");
        t_rex.roar(true);
        t_rex.stomp();
        // make velociraptor roar, but not swipe.
        System.out.println("velociraptor sez:");
        velociraptor.roar(false);
        // make apatosaurus roar, but not swipe.
        System.out.println("Apatosaurus sez:");
        apatosaurus.roar(false);
        System.out.println(String.format("Apatosaurs are also known as %s " +
                        "and their color \nis believed to have been %s.",
                apatosaurus.name, apatosaurus.color));
        // evolve the apatosaurus into a chicken
        apatosaurus.evolve();
    } // end main
} // end DinoSupervisor
