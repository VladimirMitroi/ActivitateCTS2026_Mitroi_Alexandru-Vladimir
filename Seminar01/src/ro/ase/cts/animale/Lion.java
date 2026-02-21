package ro.ase.cts.animale;

public class Lion extends Animal{
    private float greutate;

    public Lion(String name, int age, String food,float greutate) {
        super(name, age, food);
        this.greutate = greutate;
    }

    @Override
    public void eat(String numeZooKeeper) {
        System.out.println("Zookeperul " + numeZooKeeper + " hraneste leul " + super.name + " cu " + super.food);
    }
}
