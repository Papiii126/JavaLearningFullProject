package rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie;

public abstract class Zwierze {
    private String imie, kolor;
    private int waga, dlugosc;

    public Zwierze(String imie, String kolor, int waga, int dlugosc) {
        this.imie = imie;
        this.kolor = kolor;
        this.waga = waga;
        this.dlugosc = dlugosc;
    }

    void dajGlos(String odgłos) {
        System.out.println(odgłos);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "imie='" + imie + '\'' +
                ", kolor='" + kolor + '\'' +
                ", waga=" + waga +
                ", dlugosc=" + dlugosc +
                '}';
    }

    abstract void dajGlos();
}
