package ro.ase.cts.clase;

public class Rezervare implements PrototypeRezervare {
    protected String numeClient;
    protected int numarPersoane;
    protected String ora;
    protected String numarTelefon;

    public Rezervare(String numeClient, int numarPersoane, String ora, String numarTelefon) {
        if(this.numeClient.length()>2) {
            this.numeClient = numeClient;
        }
        else {
            this.numeClient="Nume Necunoscut";
        }
        if(numarPersoane>0) {
            this.numarPersoane = numarPersoane;
        }
        else {
            this.numarPersoane=2;
        }
        this.ora = ora;
        if(this.numarTelefon.length()==10) {
            this.numarTelefon = numarTelefon;
        }
        else {
            this.numarTelefon="Lipsa telefon";
        }
    }

    public void setOra(String ora) {
        this.ora = ora;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }

    private Rezervare(){

    }

    @Override
    public PrototypeRezervare copiaza() {
        Rezervare rezervare=new Rezervare();
        rezervare.numeClient=this.numeClient;
        rezervare.numarPersoane=this.numarPersoane;
        rezervare.numarTelefon=this.numarTelefon;
        rezervare.ora=this.ora;
        return rezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarPersoane=").append(numarPersoane);
        sb.append(", ora='").append(ora).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
