package rozdzial2.zajecia3.rozszerzenie.zadanie5.pierwsze;

public class Kobieta extends Czlowiek {
    private String nazwiskoPanieńskie;

    public Kobieta(String imie, String nazwisko, String adresZamieszkania, int wiek, String nazwiskoPanieńskie) {
        super(imie, nazwisko, adresZamieszkania, wiek);
        this.nazwiskoPanieńskie = nazwiskoPanieńskie;
    }

    public String getNazwiskoPanieńskie() {
        return nazwiskoPanieńskie;
    }

    public void setNazwiskoPanieńskie(String nazwiskoPanieńskie) {
        this.nazwiskoPanieńskie = nazwiskoPanieńskie;
    }



    @Override
    public String toString() {
        return "imie: " + getImie() + " nazwisko: " + getNazwisko() + " nazwisko panieńskie: " + getNazwiskoPanieńskie();
    }
}

