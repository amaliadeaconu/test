package cts.ProblemaSpital.classes;

public interface Optiune {
    void adaugaNod(Optiune optiune) throws Exception;
    void stergeNod(Optiune optiune) throws Exception;
    void getNod(int index) throws Exception;
    //Optiune getNod(int index) throws Exception; ?
    void descriere();
}
