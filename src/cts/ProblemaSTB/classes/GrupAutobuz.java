package cts.ProblemaSTB.classes;

import java.util.ArrayList;
import java.util.List;

public class GrupAutobuz implements Autobuz{
    private String groupName;
    private List<Autobuz> autobuze = new ArrayList<>();

    public GrupAutobuz(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void descriere() {
        System.out.println("Bus Group: " + groupName);
        for (var bus : autobuze) {
            bus.descriere();
    }
    }

    @Override
    public void adaugaNod(Autobuz optiune) throws Exception {
    autobuze.add(optiune);
    }

    @Override
    public void stergeNod(Autobuz optiune) throws Exception {
    autobuze.remove(optiune);
    }

    @Override
    public void getNod(int index) throws Exception {
    autobuze.get(index);
    }
}
