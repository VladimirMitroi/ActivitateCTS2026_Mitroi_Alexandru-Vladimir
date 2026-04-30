package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.LinieFactory;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Mercedes",2008,60);
        Autobuz autobuz2=new Autobuz("OTOKAR", 2024, 70);
        Autobuz autobuz3=new Autobuz("Renault", 2000, 50);

        LinieFactory linieFactory=new LinieFactory();
        linieFactory.getLinie(102,"CFR","Pantelimon").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(103,"Romana","Universitate").afiseazaAutobuzLinie(autobuz1);
        linieFactory.getLinie(102,"Ferentari","Rahova").afiseazaAutobuzLinie(autobuz1);
    }
}
