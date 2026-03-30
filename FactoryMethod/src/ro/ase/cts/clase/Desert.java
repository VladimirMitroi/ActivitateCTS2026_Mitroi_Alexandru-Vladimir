package ro.ase.cts.clase;

public abstract class Desert implements FelDeMancare{
    int calorii;
    double pret;
    int gramaj;

    public Desert(int calorii, double pret, int gramaj) {
        this.calorii = calorii;
        this.pret = pret;
        this.gramaj = gramaj;
    }
}
