package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.SupaDeLegume;
import ro.ase.cts.clase.SupaDeVita;
import ro.ase.cts.enums.TipFelDeMancare;
import ro.ase.cts.enums.TipSupa;

public class FabricaSupa implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return switch (tipFelDeMancare) {
            case TipSupa.SupaDeLegume -> new SupaDeLegume(pret, gramaj);
            case TipSupa.SupaDeVita -> new SupaDeVita(pret, gramaj);
            default -> null;
        };
    }

    @Override
    public FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return creeazaFelDeMancare(tipFelDeMancare,gramaj,pret);
    }
}
