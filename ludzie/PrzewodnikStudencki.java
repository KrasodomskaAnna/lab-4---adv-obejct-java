package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wycieczka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Panorama;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.PrzeprawaPrzezRzeke;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.ChatkaStudencka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.CmentarzZIWojny;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.ElektrowniaWodna;


/**
 *
 * @author TB
 */
public class PrzewodnikStudencki extends Student {

    public PrzewodnikStudencki(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 5.0);
    }

    protected PrzewodnikStudencki(String imie, String nazwisko, Plec plec, double czasPelnejRegeneracji) {
        super(imie, nazwisko, plec, 5.0, czasPelnejRegeneracji, 18.0);
    }

    @Override
    public void opiszWycieczke(Wycieczka wycieczka) {
        mow("Szanowna grupo, proszę o uwagę. Teraz opowiem Wam o wycieczce.");
        super.opiszWycieczke(wycieczka);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 4;
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if(a instanceof DrewnianaCerkiew) {
            DrewnianaCerkiew cerkiewka = (DrewnianaCerkiew) a;
            mow("To jest drewniana cerkiew w miejcowości " + cerkiewka.getMiejscowosc() + ". Wiele taki można spotkać w Beskidach. Po mojej lewej widać wieżę o kontrukcji słupowo ramowej ...");
            regeneruj(czas);
        }
        else if(a instanceof Panorama) {
            mow("Tutaj mamy bardzo ładny widok na sąsiednie pasmo górskie. Od lewej widzimy ...");
            regeneruj(czas);
        }
        else if(a instanceof CmentarzZIWojny) {
            CmentarzZIWojny cmentarz = (CmentarzZIWojny) a;
            mow("Tutaj widzimy cmentarz z I Wojny Światowej w miejcowości "+cmentarz.getMiejscowosc()+". Takie cmentarze projektował m.in. Dušan Jurkovič.");
            regeneruj(czas);
        }
        else if(a instanceof ChatkaStudencka) {
            ChatkaStudencka chatka = (ChatkaStudencka) a;
            mow("Tutaj widzimy Chatke Studencka, ktora zajmuje sie kolo studenckie "+chatka.getKolo()+". Takie chatki projektowali studenci PG.");
            regeneruj(czas);
        }
        else if(a instanceof ElektrowniaWodna) {
            ElektrowniaWodna elektrownia = (ElektrowniaWodna) a;
            mow("Tutaj widzimy elektrownie wodna na rzece "+elektrownia.getRzeka()+". Taka elektrownie wybuduja kiedys nam na PG!");
            regeneruj(czas);
        }
        else {
            super.reagujNaAtrakcje(a, czas);
        }
    }
    
    
    
}
