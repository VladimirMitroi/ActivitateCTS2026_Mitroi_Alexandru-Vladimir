package ro.ase.cts.clase;

public class AutobuzDeNoapte implements MijlocDeTransport{

    private MijlocDeTransport mijlocDeTransport;

    public AutobuzDeNoapte(MijlocDeTransport mijlocDeTransport) {
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
        if(mijlocDeTransport.getNrCalatori()>0){
            mijlocDeTransport.opresteInStatie();
        }else {
            System.out.println("Autobuzul "+getLinie()+" se retrage.");
        }
    }
}
