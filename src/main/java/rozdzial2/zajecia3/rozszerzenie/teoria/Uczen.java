package rozdzial2.zajecia3.rozszerzenie.teoria;

import java.util.ArrayList;
import java.util.List;

public class Uczen {
    private int id;
    private String imie;
    private String nazwisko;

    // asocjacja dla wielu ucznia

    private static int GENERATOR = 1;
    private Szkola szkola;

    private Klasa klasa;

   public List<Uczen> uczenList = new ArrayList<>();

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        uczenList.add(this);
        id = GENERATOR;
        GENERATOR++;
    }
    public void displayUczen () {
        for (Uczen uczen : uczenList) {
            System.out.println(uczen.getImie() + " " + uczen.getNazwisko());
        }
    }

    public Szkola getSzkola() {
        return szkola;
    }

    public void setSzkola(Szkola szkola) {
        this.szkola = szkola;
    }

    public Klasa getKlasa() {
        return klasa;
    }

    public void setKlasa(Klasa klasa) {
        this.klasa = klasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", szkola=" + szkola +
                ", klasa=" + klasa +
                '}';
    }
}
