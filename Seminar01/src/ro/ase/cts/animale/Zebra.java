package ro.ase.cts.animale;

public class Zebra extends Animal{
    private int nrDungi;

    public Zebra(String name, int age, String food, int nrDungi) {
        super(name, age, food);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String numeZooKeeper) {
        System.out.println("Zookeperul " + numeZooKeeper + " hraneste zebra " + super.name +" cu "+ super.food);
    }
}
