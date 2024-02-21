package cts.ProblemaBanca.classes;

public class ItemFiliala implements IOptiune{
    private String denumireFiliala;

    public ItemFiliala(String denumireFiliala) {
        this.denumireFiliala = denumireFiliala;
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public IOptiune  getNod(int index) {
        return null;    // sau throw new Exception("NU este implementata"); daca pun throws Exception mai sus
    }

    @Override
    public void descriere() {
        System.out.println("Filiala: "+denumireFiliala);
    }
}
