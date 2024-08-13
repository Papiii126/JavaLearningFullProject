package rozdzial2.zajecia3.rozszerzenie.zadanie5.piate;

public class Komputer extends Urzadzenie {
    private int iloscRam;

    public Komputer(String nazwa, String firma, int cena, int iloscRam) {
        super(nazwa, firma, cena);
        this.iloscRam = iloscRam;
    }

    public int getIloscRam() {
        return iloscRam;
    }

    public void setIloscRam(int iloscRam) {
        this.iloscRam = iloscRam;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: " + getNazwa() + "\nFirma: " + getFirma() + "\nCena: " + getCena() + "\nIlość RAM: " + getIloscRam());
    }
}





