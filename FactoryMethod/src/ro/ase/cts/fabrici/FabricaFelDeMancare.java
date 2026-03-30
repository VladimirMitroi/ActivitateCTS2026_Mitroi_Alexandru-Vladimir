package ro.ase.cts.fabrici;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipFelDeMancare;

public interface FabricaFelDeMancare {
    FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret);
    FelDeMancare creeazaFelDeMancare(TipFelDeMancare tipFelDeMancare, int gramaj, double pret, int calorii);
}
