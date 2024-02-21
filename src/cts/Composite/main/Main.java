package cts.Composite.main;

import cts.Composite.classes.IOptiuneMeniu;
import cts.Composite.classes.ItemComposite;
import cts.Composite.classes.ItemFrunza;

public class Main {

    public static void main(String[] args) {
        IOptiuneMeniu optiune1=new ItemComposite("Destinatie"); //primul nod
        IOptiuneMeniu optiune2=new ItemComposite("Exotice");
        IOptiuneMeniu optiune3=new ItemComposite("Continentale");
        IOptiuneMeniu optiune4=new ItemFrunza("Brasov");
        IOptiuneMeniu optiune5=new ItemFrunza("Thailanda"); //frunza
        IOptiuneMeniu optiune6=new ItemFrunza("Bali"); //frunza

        optiune1.adaugaOptiune(optiune2);
        optiune1.adaugaOptiune(optiune3);
        optiune1.adaugaOptiune(optiune4);
        optiune2.adaugaOptiune(optiune5);
        optiune2.adaugaOptiune(optiune6);

        optiune1.descriere();
    }
}
