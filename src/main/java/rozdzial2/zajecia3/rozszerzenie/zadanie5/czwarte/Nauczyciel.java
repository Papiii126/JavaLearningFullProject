package rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte;

public class Nauczyciel extends OsobaSzkola {
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

    public static class Uczen extends OsobaSzkola {
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
}
