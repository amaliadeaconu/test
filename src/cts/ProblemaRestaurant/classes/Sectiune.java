package cts.ProblemaRestaurant.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuneMeniu {
    private String denumire;
    private List<IOptiuneMeniu>  lista;  //abstract

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.lista=new ArrayList<>();
    }

    @Override
    public void adaugaOptiune(IOptiuneMeniu optiuneMeniu) {
        lista.add(optiuneMeniu);
    }

    @Override
    public void stergereOptiune(IOptiuneMeniu optiuneMeniu) {
    lista.remove(optiuneMeniu);
    }

    @Override
    public void getOptiune(int index) {
    lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: "+denumire);
        for(IOptiuneMeniu optiuneMeniu: lista){
            optiuneMeniu.descriere();
        }
    }
}
