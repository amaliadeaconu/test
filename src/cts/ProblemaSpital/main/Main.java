package cts.ProblemaSpital.main;

import cts.ProblemaSpital.classes.Categorie;
import cts.ProblemaSpital.classes.Item;
import cts.ProblemaSpital.classes.Optiune;

public class Main {
    public static void main(String[] args) {
        Optiune optiune1=new Categorie("Departamentul de Pediatrie");
        Optiune optiune2=new Categorie("Departamentul de Medicină internă");
        Optiune optiune3=new Categorie("Departamentul de Cardiologie");
        Optiune optiune4=new Item("Secția de pediatrie chirurgicală");
        Optiune optiune5=new Item("Secția de neonatologie");
        Optiune optiune6=new Item("Secția de pediatrie oncologică");
        Optiune optiune8=new Item("Secția de gastroenterologie");
        Optiune optiune9=new Item("Secția de endocrinologie");
        Optiune optiune10=new Item("Secția de pneumologie");
        Optiune optiune11=new Item("Secția de cardiologie non-invazivă");


       try {

           optiune1.adaugaNod(optiune4);
           optiune1.adaugaNod(optiune5);
           optiune1.adaugaNod(optiune6);
           optiune2.adaugaNod(optiune8);
           optiune2.adaugaNod(optiune9);
           optiune2.adaugaNod(optiune10);
           optiune3.adaugaNod(optiune11);

           optiune1.stergeNod(optiune5);

           optiune2.getNod(1);

           optiune1.descriere();
           optiune2.descriere();
           optiune3.descriere();

       }catch(Exception e){
           e.printStackTrace();
       }
    }
}
