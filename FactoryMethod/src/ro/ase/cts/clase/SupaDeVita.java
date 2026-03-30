package ro.ase.cts.clase;

public class SupaDeVita extends Supa{

    public SupaDeVita(double pret, int gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Supa de vita costa " + super.pret + " lei si are " + super.gramaj + " grame.");
    }
}
