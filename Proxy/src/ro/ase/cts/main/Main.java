package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.AutobuzCursaSpeciala;
import ro.ase.cts.clase.AutobuzDeNoapte;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz=new Autobuz("226",30);
        autobuz.opresteInStatie();
        autobuz.opresteInStatie();
        autobuz.opresteInStatie();

        MijlocDeTransport autobuzDeNoapte=new AutobuzDeNoapte(autobuz);
        autobuzDeNoapte.opresteInStatie();

        MijlocDeTransport autobuz1=new Autobuz("381",0);
        MijlocDeTransport autobuzDeNoapte1=new AutobuzDeNoapte(autobuz1);
        autobuzDeNoapte1.opresteInStatie();

        MijlocDeTransport autobuz2=new Autobuz("100Special",20);
        MijlocDeTransport autobuzSpecial=new AutobuzCursaSpeciala(autobuz2);
        autobuzSpecial.opresteInStatie();
    }
}
