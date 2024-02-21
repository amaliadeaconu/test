package cts.ProblemaRestaurant.classes;

public interface IOptiuneMeniu {
    void adaugaOptiune(IOptiuneMeniu optiuneMeniu);
    void stergereOptiune(IOptiuneMeniu optiuneMeniu);
    void getOptiune(int index);
    void descriere();
}
