package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class CmentarzZIWojny extends Atrakcja {
    private String miejscowosc;

    public String getMiejscowosc() { return miejscowosc; }

    public CmentarzZIWojny(String miejscowosc) {
        super(1/3.0);
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String getNazwa() { return "Cmentarz z I Wojny"; }
}
