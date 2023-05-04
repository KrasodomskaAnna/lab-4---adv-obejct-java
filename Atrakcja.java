package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

public abstract class Atrakcja implements ElementWycieczki {
    private double godziny;
    public Atrakcja(double godziny) { this.godziny = godziny; }
    public double getWymaganyCzas() { return godziny; }
}
