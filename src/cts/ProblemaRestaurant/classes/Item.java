package cts.ProblemaRestaurant.classes;

public class Item implements IOptiuneMeniu{
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaOptiune(IOptiuneMeniu optiuneMeniu) {
        System.out.println("Acesat este un nod frunza!");
    }

    @Override
    public void stergereOptiune(IOptiuneMeniu optiuneMeniu) {
        System.out.println("Acesat este un nod frunza!");
    }

    @Override
    public void getOptiune(int index) {
        System.out.println("Acesat este un nod frunza!");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+ denumire);
    }
}
