package cts.ProblemaRestaurant.main;

import cts.ProblemaRestaurant.classes.IOptiuneMeniu;
import cts.ProblemaRestaurant.classes.Item;
import cts.ProblemaRestaurant.classes.Sectiune;

public class Main {
    public static void main(String[] args) {
        IOptiuneMeniu optiuneMeniu1=new Sectiune("Startere");
        IOptiuneMeniu optiuneMeniu2=new Sectiune("Bauturi");
        IOptiuneMeniu optiuneMeniu3=new Sectiune("Desert");
        IOptiuneMeniu optiuneMeniu4=new Item("Sucuri");
        IOptiuneMeniu optiuneMeniu5=new Item("Cafea");
        IOptiuneMeniu optiuneMeniu6=new Item("Apa plata");
        IOptiuneMeniu optiuneMeniu7=new Item("Apa minerala");


        optiuneMeniu2.adaugaOptiune(optiuneMeniu4);
        optiuneMeniu2.adaugaOptiune(optiuneMeniu5);
        optiuneMeniu2.adaugaOptiune(optiuneMeniu6);
        optiuneMeniu2.adaugaOptiune(optiuneMeniu7);
       optiuneMeniu1.descriere();
       optiuneMeniu2.descriere();
       optiuneMeniu3.descriere();

    }
}
