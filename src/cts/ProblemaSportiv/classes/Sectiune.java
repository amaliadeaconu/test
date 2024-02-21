package cts.ProblemaSportiv.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiune{
    private String denumire;
    private List<IOptiune> lista;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        lista=new ArrayList<IOptiune>();
    }

    @Override
    public void adaugaElement(IOptiune element) {
    lista.add(element);
    }

    @Override
    public void stergeElement(IOptiune element) {
    lista.remove(element);
    }

    @Override
    public IOptiune getElement(int index) {
        return lista.get(index);   //!!!!
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: "+ denumire);
        for(IOptiune element:lista){
            element.descriere();
        }
    }
}
