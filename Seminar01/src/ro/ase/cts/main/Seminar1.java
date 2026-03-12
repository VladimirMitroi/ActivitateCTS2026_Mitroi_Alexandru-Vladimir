package ro.ase.cts.main;

import ro.ase.cts.animale.Lion;
import ro.ase.cts.animale.Otter;
import ro.ase.cts.animale.Zebra;
import ro.ase.cts.zoo.ZOO;
import ro.ase.cts.zoo.ZooKeeper;

public class Seminar1 {
    public static void main(String[] args) {
        ZooKeeper keeper = new ZooKeeper("Popescu");
        ZOO zoo= new ZOO("Baneasa", keeper);

        zoo.addAnimal(new Lion("Leu1", 7, "Carne", 90));
        zoo.addAnimal(new Lion("Leu2", 9, "Carne", 100));
        zoo.addAnimal(new Zebra("Zebra1", 6, "Iarba", 50));
        zoo.addAnimal(new Zebra("Zebra1", 10, "Iarba", 70));
        zoo.addAnimal(new Otter("Vidra1", 2, "Ton", "Lac"));
        zoo.addAnimal(new Otter("Vidra2", 3, "Somn", "Rau"));

        zoo.feedAllAnimals();


    }
}
