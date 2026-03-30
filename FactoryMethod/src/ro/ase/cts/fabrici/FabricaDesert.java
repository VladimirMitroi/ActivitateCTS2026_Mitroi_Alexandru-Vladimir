package ro.ase.cts.fabrici;

import ro.ase.cts.clase.Clatite;
import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.clase.Papanasi;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipFelDeMancare;

public class FabricaDesert implements FabricaFelDeMancare{
    @Override
    public FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret) {
        return creeazaFelDeMancare(tipFelDeMancare,gramaj,pret,500);
    }

    @Override
    public FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii) {
        return switch(tipFelDeMancare){
            case TipDesert.Papanasi->new Papanasi(calorii,pret,gramaj);
            case TipDesert.Clatite->new Clatite(calorii,pret,gramaj);
            default->null;
        };
    }
}
