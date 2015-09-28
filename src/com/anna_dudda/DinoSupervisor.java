package com.anna_dudda;

public class DinoSupervisor {

    public static void main(String[] args) {
	// write your code here
        Dinosaur t_rex = new Dinosaur();
        Dinosaur velociraptor = new Dinosaur();
        Dinosaur apatosaurus = new Dinosaur();

        System.out.println("trex sez:");
        t_rex.roar(true);
        System.out.println("velociraptor sez:");
        velociraptor.roar(false);
        System.out.println("Apatosaurus sez:");
        apatosaurus.roar(false);
    }
}
