package cts.ProblemaBanca.classes;

import java.util.ArrayList;
import java.util.List;

public class ItemSucursala implements IOptiune{
    private String denumireSucursala;
    private List<IOptiune>lista;

    public ItemSucursala(String denumireSucursala) {
        this.denumireSucursala = denumireSucursala;
        //lista=new ArrayList<IOptiune>();
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        lista.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
    lista.remove(optiune);
    }

    @Override
    public IOptiune  getNod(int index) {
        return lista.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Sucursala: "+denumireSucursala);
        for(IOptiune optiune:lista) {
            optiune.descriere();
        }
    }
}
