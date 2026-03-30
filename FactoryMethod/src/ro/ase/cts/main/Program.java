package ro.ase.cts.main;

import ro.ase.cts.clase.FelDeMancare;
import ro.ase.cts.enums.TipDesert;
import ro.ase.cts.enums.TipSupa;
import ro.ase.cts.fabrici.FabricaDesert;
import ro.ase.cts.fabrici.FabricaFelDeMancare;
import ro.ase.cts.fabrici.FabricaSupa;

public class Program {
    public static void main(String[] args){
        FabricaFelDeMancare fabricaFelDeMancare=new FabricaSupa();
        FelDeMancare supaDeVita=fabricaFelDeMancare.creeazaFelDeMancare(TipSupa.SupaDeVita,400,25);
        FelDeMancare supaDeLegume=fabricaFelDeMancare.creeazaFelDeMancare(TipSupa.SupaDeLegume,350,15);

        fabricaFelDeMancare=new FabricaDesert();
        FelDeMancare papanasi=fabricaFelDeMancare.creeazaFelDeMancare(TipDesert.Papanasi,300,30,600);
        FelDeMancare clatite=fabricaFelDeMancare.creeazaFelDeMancare(TipDesert.Clatite,250,20,400);

        supaDeLegume.afiseazaDescriere();
        supaDeVita.afiseazaDescriere();

        papanasi.afiseazaDescriere();
        clatite.afiseazaDescriere();
    }
}
