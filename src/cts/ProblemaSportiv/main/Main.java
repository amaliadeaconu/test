package cts.ProblemaSportiv.main;

import cts.ProblemaSportiv.classes.IOptiune;
import cts.ProblemaSportiv.classes.Loc;
import cts.ProblemaSportiv.classes.Sectiune;

public class Main {
    public static void main(String[] args) {
        IOptiune optiune1=new Sectiune("Tribuna");
        IOptiune optiune2=new Sectiune("Peluza");
        IOptiune optiune3=new Loc("Tribuna Nord");
        IOptiune optiune4=new Loc("Tribuna Sud");
        IOptiune optiune5=new Loc("Tribuna Copii");
        IOptiune optiune6=new Loc("VIP");

        optiune1.adaugaElement(optiune3);
        optiune1.adaugaElement(optiune4);
        optiune1.adaugaElement(optiune5);
        optiune1.adaugaElement(optiune6);
        optiune1.descriere();
        optiune2.descriere();
    }
}
