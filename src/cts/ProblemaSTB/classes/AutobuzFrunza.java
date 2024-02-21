package cts.ProblemaSTB.classes;

public class AutobuzFrunza implements Autobuz{

    private String producator;
    private String model;
    private int nrLocuri;

    public AutobuzFrunza(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriere() {
        System.out.println("Model: "+this.model+" producator: "+this.producator+"nr locuri: "+nrLocuri);
    }

    @Override
    public void adaugaNod(Autobuz optiune) throws Exception {

    }

    @Override
    public void stergeNod(Autobuz optiune) throws Exception {

    }

    @Override
    public void getNod(int index) throws Exception {

    }
}
