package rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte;

public class OsobaSzkola {
    private String imie, nazwisko;
    private int wiek;

    public OsobaSzkola(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public static class Nauczyciel extends OsobaSzkola {
        private String przedmiot;

        public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
            super(imie, nazwisko, wiek);
            this.przedmiot = przedmiot;
        }

        public String getPrzedmiot() {
            return przedmiot;
        }

        public void setPrzedmiot(String przedmiot) {
            this.przedmiot = przedmiot;
        }

        @Override
        public String toString() {
            return "Nauczyciel{" +
                    "przedmiot='" + przedmiot + '\'' +
                    '}';
        }
    }
}
