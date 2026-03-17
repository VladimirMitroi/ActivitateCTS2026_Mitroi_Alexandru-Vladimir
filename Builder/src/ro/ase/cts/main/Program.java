package ro.ase.cts.main;

import ro.ase.cts.builder01.AbstractBuilder;
import ro.ase.cts.builder01.Internare;
import ro.ase.cts.builder01.InternareBuilder;
import ro.ase.cts.builder02.AbstractBuilder02;
import ro.ase.cts.builder02.Internare02;
import ro.ase.cts.builder02.InternareBuilder02;

public class Program {
    public static void main(String[] args){
        Internare internare1=new Internare();
        internare1.setNumePacient("Georgel Vasilescu");
        internare1.setPatRabatabil(true);

        Internare internare2=new Internare();
        internare1.setNumePacient("Vasile Georgescu");
        internare1.setMicDejunInclus(true);

        AbstractBuilder builder=new InternareBuilder("Georgica");

        Internare internare3=builder.setPatRabatabil(true).build();
        Internare internare4=builder.setNumePacient("Gigel").setHalatInterior(true).setPapuciCamera(true).build();
        System.out.println(internare3);
        System.out.println(internare4);

        AbstractBuilder02 builder02=new InternareBuilder02();
        builder02.setMicDejunInclus(true);
        Internare02 internare5=builder02.build("Alex");
        Internare02 internare6=builder02.build("Mihai");
        System.out.println(internare5);
        System.out.println(internare6);

        internare5.setHalatInterior(true);
        System.out.println(internare5);
    }
}
