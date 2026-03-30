package ro.ase.cts.clase;

public class Clatite extends Desert{
    public Clatite(int calorii, double pret, int gramaj) {
        super(calorii, pret, gramaj);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Clatite costa " + super.pret + " lei, au " + super.gramaj + " grame si " + super.calorii + " calorii.");
    }
}
