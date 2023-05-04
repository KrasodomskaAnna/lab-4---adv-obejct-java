package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.PrzeprawaPrzezRzeke;

public class BagiennyBiegacz extends Czlowiek {
    public BagiennyBiegacz(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko, plec, 6.0, 12.0, 20.0);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if(w instanceof PrzeprawaPrzezRzeke) {
            aktualizujZmeczenie(czas*0.5);
            mow("Uuu! Przeprawa przez rzekę. Uwielbiam chodzic na terenach pod woda.");

        } else {
            aktualizujZmeczenie(czas);
            mow("Hmm, wędrówka: "+w.getNazwa());
        }
    }
}
