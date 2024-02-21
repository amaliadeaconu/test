package cts.ProblemaBanca.classes;

import java.util.ArrayList;
import java.util.List;

public class ItemAgentie implements IOptiune{
    private String denumireAgentie;
    private List<IOptiune> filiale;

    public ItemAgentie(String denumireAgentie) {
        this.denumireAgentie = denumireAgentie;
        this.filiale = new ArrayList<>();
    }

    @Override
    public void adaugaNod(IOptiune optiune) throws Exception {
        filiale.add(optiune);
    }

    @Override
    public void stergeNod(IOptiune optiune) throws Exception {
        filiale.remove(optiune);
    }

    @Override
    public IOptiune getNod(int index){
        return filiale.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("Agentie: "+denumireAgentie);
        for (IOptiune optiune : filiale) {
            optiune.descriere();
        }
    }
}
