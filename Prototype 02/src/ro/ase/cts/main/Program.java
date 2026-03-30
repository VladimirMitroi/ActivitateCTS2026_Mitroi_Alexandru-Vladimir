package ro.ase.cts.main;

import ro.ase.cts.clase.PrototypeRezervare;
import ro.ase.cts.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        PrototypeRezervare rezervare=new Rezervare("Eu",4,"20:00","074820745");
        PrototypeRezervare rezervare1= rezervare.copiaza();
//        System.out.println(rezervare1.toString());
    }
}
