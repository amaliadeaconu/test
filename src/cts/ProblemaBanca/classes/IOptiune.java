package cts.ProblemaBanca.classes;

public interface IOptiune {
    void adaugaNod(IOptiune optiune) throws Exception;
    void stergeNod(IOptiune optiune) throws Exception;
    IOptiune getNod(int index);
   // void getNod(int index) throws Exception;
    void descriere();
}
