package rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte;

public class Uczen extends OsobaSzkola {
    private String klasa;

    public Uczen(String imie, String nazwisko, int wiek, String klasa) {
        super(imie, nazwisko, wiek);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "klasa='" + klasa + '\'' +
                '}';
    }
}
