package cts.ProblemaSportiv.classes;

public class Loc implements IOptiune{
    private String denumire;

    public Loc(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaElement(IOptiune element) {
        System.out.println("Acesat este un nod frunza!");
    }

    @Override
    public void stergeElement(IOptiune element) {
        System.out.println("Acesat este un nod frunza!");
    }

    @Override
    public IOptiune getElement(int index) {
        return null;
    }

    @Override
    public void descriere() {
        System.out.println("Loc: " + denumire);
    }
}
