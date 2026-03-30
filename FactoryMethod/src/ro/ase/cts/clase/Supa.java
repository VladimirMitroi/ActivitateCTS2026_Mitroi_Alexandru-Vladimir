package ro.ase.cts.clase;

public abstract class Supa implements FelDeMancare{
    protected int gramaj;
    protected double pret;

    public Supa(double pret, int gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }
}
