package cts.ProblemaSpital.classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements Optiune {
    private String nume;
    private List<Optiune> lista;

    public Categorie(String nume) {
        this.nume = nume;
        lista=new ArrayList<Optiune>();
        //this.lista=new ArrayList<>();
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
    lista.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
    lista.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
    lista.get(index);
    //return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+nume);
        for(Optiune optiune:lista) {
            optiune.descriere();
        }
    }
}
