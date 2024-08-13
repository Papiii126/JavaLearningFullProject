package rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte;

public class Dyrektor extends OsobaSzkola {
    private String staz_Nauczycielski;

    public Dyrektor(String imie, String nazwisko, int wiek, String staz_Nauczycielski) {
        super(imie, nazwisko, wiek);
        this.staz_Nauczycielski = staz_Nauczycielski;
    }

    @Override
    public String toString() {
        return "Dyrektor{" +
                "staz_Nauczycielski='" + staz_Nauczycielski + '\'' +
                '}';
    }

    public static class tDyrektor extends OsobaSzkola {
        private String staz_Nauczycielski;

        public tDyrektor(String imie, String nazwisko, int wiek, String staz_Nauczycielski) {
            super(imie, nazwisko, wiek);
            this.staz_Nauczycielski = staz_Nauczycielski;
        }

        @Override
        public String toString() {
            return "Dyrektor{" +
                    "staz_Nauczycielski='" + staz_Nauczycielski + '\'' +
                    '}';
        }
    }
}



