package rozdzial2.zajecia3.rozszerzenie.zadanie5.piate;

public class Tablet extends Urzadzenie {
    private int rokProdukcji;

    public Tablet(String nazwa, String firma, int cena, int rokProdukcji) {
        super(nazwa, firma, cena);
        this.rokProdukcji = rokProdukcji;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }
    public void wyswietlDane() {
        System.out.println("Nazwa: " + getNazwa() + "\nFirma: " + getFirma() + "\nCena: " + getCena() + "\nRok Produkcji: " + getRokProdukcji());
    }
}

