package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class ChatkaStudencka extends Atrakcja {
    private String kolo;

    public String getKolo() { return kolo; }

    public ChatkaStudencka(String kolo) {
        super(0.5);
        this.kolo = kolo;
    }

    @Override
    public String getNazwa() { return "Chatka Studencka"; }
}
