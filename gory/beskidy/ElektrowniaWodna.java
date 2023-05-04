package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class ElektrowniaWodna extends Atrakcja {
    private String rzeka;

    public String getRzeka() { return rzeka; }

    public ElektrowniaWodna(String rzeka) {
        super(0.75);
        this.rzeka = rzeka;
    }

    @Override
    public String getNazwa() { return "Elektrownia Wodna"; }
}
