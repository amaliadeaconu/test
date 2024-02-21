package cts.ProblemaFarmacie.main;

import cts.ProblemaFarmacie.classes.Categorie;
import cts.ProblemaFarmacie.classes.Item;
import cts.ProblemaFarmacie.classes.OptiuneFarmacie;

public class Main {
    public static void main(String[] args) {
        OptiuneFarmacie optiune1=new Categorie("Raceala");
        OptiuneFarmacie optiune2=new Categorie("Durere");
        OptiuneFarmacie optiune3=new Categorie("Antibiotice");
        OptiuneFarmacie optiune4=new Item("Adulti");
        OptiuneFarmacie optiune5=new Item("Copii");
        OptiuneFarmacie optiune6=new Item("Paracetamol");
        OptiuneFarmacie optiune7=new Item("Aspirină");
        OptiuneFarmacie optiune8=new Item("Nospa");
        OptiuneFarmacie optiune9=new Item("Amoxicilină");

        try{
            optiune1.adaugaNod(optiune4);
            optiune1.adaugaNod(optiune5);
            optiune1.adaugaNod(optiune6);
            optiune2.adaugaNod(optiune4);
            optiune2.adaugaNod(optiune5);
            optiune2.adaugaNod(optiune7);
            optiune2.adaugaNod(optiune8);
            optiune3.adaugaNod(optiune4);
            optiune3.adaugaNod(optiune5);
            optiune3.adaugaNod(optiune9);
            optiune1.descriere();
            optiune2.descriere();
            optiune3.descriere();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
