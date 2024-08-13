package rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie;

public class Kon extends Zwierze {
    String podkowa;

    public Kon(String imie, String kolor, int waga, int dlugosc, String podkowa) {
        super(imie, kolor, waga, dlugosc);
        this.podkowa = podkowa;
    }

    @Override
   public void dajGlos() {
        super.dajGlos("Ihaaaa");

    }
}


