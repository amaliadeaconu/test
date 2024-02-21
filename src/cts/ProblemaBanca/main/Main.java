package cts.ProblemaBanca.main;

import cts.ProblemaBanca.classes.IOptiune;
import cts.ProblemaBanca.classes.ItemAgentie;
import cts.ProblemaBanca.classes.ItemFiliala;
import cts.ProblemaBanca.classes.ItemSucursala;

public class Main {
    public static void main(String[] args) {
        IOptiune optiune1=new ItemSucursala("Sucursala Centrală București 1");
        IOptiune optiune2=new ItemAgentie("Agenția Sector 4");
        IOptiune optiune3=new ItemFiliala("Filiala Berceni");
        IOptiune optiune4=new ItemSucursala("Sucursala Centrală București 2");
        IOptiune optiune5=new ItemAgentie("Agenția Sector 5");
        IOptiune optiune6=new ItemFiliala("Filiala Rahova");

        try{
            optiune1.adaugaNod(optiune2);
            optiune2.adaugaNod(optiune3);
            optiune4.adaugaNod(optiune5);
            optiune5.adaugaNod(optiune6);
            optiune1.descriere();
            optiune4.descriere();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
