package cts.ProblemaSTB.classes;

import cts.ProblemaSpital.classes.Optiune;

public interface Autobuz {
    void descriere();
    void adaugaNod(Autobuz optiune) throws Exception;
    void stergeNod(Autobuz optiune) throws Exception;
    void getNod(int index) throws Exception;
}
