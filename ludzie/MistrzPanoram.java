package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Panorama;

public class MistrzPanoram extends Czlowiek {
    public MistrzPanoram(String imie, String nazwisko, Czlowiek.Plec plec) {
        super(imie, nazwisko, plec, 5.0, 18.0, 18.0);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() { return 4; }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if(a instanceof Panorama) {
            regeneruj(czas*2.0);
            mow("Uuu!  Alez widoki! Uwielbiam takie panoramy!");

        } else {
            regeneruj(czas);
            mow("Hmm, atrakcja: "+a.getNazwa());
        }
    }
}
