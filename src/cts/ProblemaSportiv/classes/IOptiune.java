package cts.ProblemaSportiv.classes;

public interface IOptiune {
    void adaugaElement(IOptiune element);
    void stergeElement(IOptiune element);
    IOptiune getElement(int index);
    void descriere();
}
