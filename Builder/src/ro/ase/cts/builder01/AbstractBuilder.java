package ro.ase.cts.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String nume);
    AbstractBuilder setPatRabatabil(boolean bool);
    AbstractBuilder setMicDejunInclus(boolean bool);
    AbstractBuilder setPapuciCamera(boolean bool);
    AbstractBuilder setHalatInterior(boolean bool);
}
