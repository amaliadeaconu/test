package cts.ProblemaFarmacie.classes;

public interface OptiuneFarmacie {
    void adaugaNod(OptiuneFarmacie optiune) throws Exception;
    void stergeNod(OptiuneFarmacie optiune) throws Exception;
    void getNod(int index) throws Exception;
    //Optiune getNod(int index) throws Exception; ?
    void descriere();
}
