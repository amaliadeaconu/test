package cts.ProblemaFarmacie.classes;

public class Item implements OptiuneFarmacie {
    private String denumire;

    public Item(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adaugaNod(OptiuneFarmacie optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void stergeNod(OptiuneFarmacie optiune) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void getNod(int index) throws Exception {
        throw new Exception("NU este implementata");
    }

    @Override
    public void descriere() {
        System.out.println("Item: "+ denumire);
    }
}
