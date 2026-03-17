package ro.ase.cts.builder02;

public class InternareBuilder02 implements AbstractBuilder02{
    private boolean patRabatabil=false;
    private boolean micDejunInclus=false;
    private boolean papuciCamera=false;
    private boolean halatInterior=false;

    @Override
    public Internare02 build(String nume) {
        return new Internare02(nume,patRabatabil,micDejunInclus,papuciCamera,halatInterior);
    }

    @Override
    public AbstractBuilder02 setPatRabatabil(boolean bool) {
        this.patRabatabil=bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setMicDejunInclus(boolean bool) {
        this.micDejunInclus=bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setPapuciCamera(boolean bool) {
        this.papuciCamera=bool;
        return this;
    }

    @Override
    public AbstractBuilder02 setHalatInterior(boolean bool) {
        this.halatInterior=bool;
        return this;
    }
}
