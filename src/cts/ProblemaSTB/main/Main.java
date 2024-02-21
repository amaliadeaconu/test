package cts.ProblemaSTB.main;

import cts.ProblemaSTB.classes.Autobuz;
import cts.ProblemaSTB.classes.AutobuzFrunza;
import cts.ProblemaSTB.classes.GrupAutobuz;

public class Main {
    public static void main(String[] args) throws Exception {
        Autobuz smallBus1 = new AutobuzFrunza("Mercedes", "Sprinter", 10);
        Autobuz smallBus2 = new AutobuzFrunza("Ford", "Transit", 10);
        Autobuz mediumBus1 = new AutobuzFrunza("Volvo", "9900", 30);
        Autobuz largeBus1 = new AutobuzFrunza("Scania", "Touring", 50);

        GrupAutobuz grup1 = new GrupAutobuz("Toate Autobuzele");
        GrupAutobuz grup2 = new GrupAutobuz("Grup Mic");

        grup2.adaugaNod(smallBus1);
        grup2.adaugaNod(smallBus1);
        grup2.descriere();

        grup1.adaugaNod(mediumBus1);
        grup1.adaugaNod(grup2);
        grup1.adaugaNod(largeBus1);
        System.out.println("\n");
        grup1.descriere();

    }
}
