package cts.ProblemaFarmacie.classes;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements OptiuneFarmacie {
    private String denumire;
    private List<OptiuneFarmacie> lista;

    public Categorie(String denumire) {
        this.denumire = denumire;
        lista=new ArrayList<OptiuneFarmacie>();
    }

    @Override
    public void adaugaNod(OptiuneFarmacie optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(OptiuneFarmacie optiune) throws Exception {
    lista.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
        lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: "+denumire);
        for(OptiuneFarmacie optiune:lista) {
            optiune.descriere();
        }
    }
}
