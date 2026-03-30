package ro.ase.cts.clase;

public class SupaDeLegume extends Supa{

    public SupaDeLegume(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de legume costa " + super.pret + " lei si are " + super.gramaj + " grame.");
    }
}
