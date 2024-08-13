package rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie;

public class Kot extends Zwierze {

    private String rasa;

    public Kot(String imie, String kolor, int waga, int dlugosc, String rasa) {
        super(imie, kolor, waga, dlugosc);
        this.rasa = rasa;
    }

    @Override
   public void dajGlos() {
        super.dajGlos("miauuu");
    }
}

