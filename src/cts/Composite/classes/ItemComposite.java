package cts.Composite.classes;

import java.util.ArrayList;
import java.util.List;

public class ItemComposite implements IOptiuneMeniu{
    private String denumire;
    private List<IOptiuneMeniu> listaItem=new ArrayList<>();

    public ItemComposite(String denumire) {
        this.denumire = denumire;
    }

    public ItemComposite(String denumire, List<IOptiuneMeniu> listaItem) {
        this.denumire = denumire;
        this.listaItem = listaItem;
    }

    @Override
    public void adaugaOptiune(IOptiuneMeniu optiuneMeniu) {
    listaItem.add(optiuneMeniu);
    }

    @Override
    public void stergereOptiune(IOptiuneMeniu optiuneMeniu) {
    listaItem.remove(optiuneMeniu);
    }

    @Override
    public void getOptiune(int index) {
    listaItem.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Categorie: " + denumire);
        for(var optiune: listaItem){
            optiune.descriere();
        }
    }
}
