package rozdzial2.zajecia3.rozszerzenie.zadanie5.piate;

public class Telefon extends Urzadzenie {
    private String kolor;

    public Telefon(String nazwa, String firma, int cena, String kolor) {
        super(nazwa, firma, cena);
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void wyswietlDane() {
        System.out.println("Nazwa: " + getNazwa() + "\nFirma: " + getFirma() + "\nCena: " + getCena() + "\nKolor: " + getKolor());
    }
}
