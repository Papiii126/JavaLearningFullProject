package rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie;

public class Pies extends Zwierze {

    private String siersc;

    public Pies(String imie, String kolor, int waga, int dlugosc, String siersc) {
        super(imie, kolor, waga, dlugosc);
        this.siersc = siersc;
    }

    @Override
    public void dajGlos() {
        super.dajGlos("Hauuu");
    }
}


