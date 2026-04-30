package ro.ase.cts.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport mijlocDeTransport;

    public AutobuzCursaSpeciala(MijlocDeTransport mijlocDeTransport) {
        this.mijlocDeTransport = mijlocDeTransport;
    }

    @Override
    public String getLinie() {
        return mijlocDeTransport.getLinie();
    }

    @Override
    public int getNrCalatori() {
        return mijlocDeTransport.getNrCalatori();
    }

    @Override
    public void opresteInStatie() {
        if(mijlocDeTransport.getLinie().contains("Special")){
            System.out.println("Autobuzul este intr-o cursa speciala.");
        }
        else{
            mijlocDeTransport.opresteInStatie();
        }
    }
}
