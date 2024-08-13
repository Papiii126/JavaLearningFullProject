package rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte;

import java.util.ArrayList;

public class Szkola {
    private String nazwa;
    private Dyrektor dyrektor;
    private String patron;
    private ArrayList<Nauczyciel> nauczyciele;
    private ArrayList<Uczen> uczniowie;

    public Szkola(String nazwa, Dyrektor dyrektor, String patron) {
        this.nazwa = nazwa;
        this.dyrektor = dyrektor;
        this.patron = patron;
        this.nauczyciele = new ArrayList<>();
        this.uczniowie = new ArrayList<>();

    }

    public void dodajNauczyciela(Nauczyciel nauczyciel) {
        nauczyciele.add(nauczyciel);
    }

    public void dodajUcznia(Uczen uczen) {
        uczniowie.add(uczen);
    }

    public void wyswietlUczniow() {
        System.out.println("Uczniowie w szkole " + nazwa + ":");
        for (Uczen uczen : uczniowie) {
            System.out.println(uczen.getImie() + " " + uczen.getNazwisko() + " - Klasa: " + uczen.getKlasa());
        }
    }

    public void wyswietlNauczycieli() {
        System.out.println("Nauczyciele w szkole " + nazwa + ":");
        for (Nauczyciel nauczyciel : nauczyciele) {
            System.out.println(nauczyciel.getImie() + " " + nauczyciel.getNazwisko() + " - Przedmiot: " + nauczyciel.getPrzedmiot());
        }
    }

    public static class tSzkola {
        private String nazwa;
        private Dyrektor.tDyrektor dyrektor;
        private String patron;
        private ArrayList<OsobaSzkola.Nauczyciel> nauczyciele;
        private ArrayList<Nauczyciel.Uczen> uczniowie;

        public tSzkola(String nazwa, Dyrektor.tDyrektor dyrektor, String patron) {
            this.nazwa = nazwa;
            this.dyrektor = dyrektor;
            this.patron = patron;
            this.nauczyciele = new ArrayList<>();
            this.uczniowie = new ArrayList<>();

        }

        public void dodajNauczyciela(OsobaSzkola.Nauczyciel nauczyciel) {
            nauczyciele.add(nauczyciel);
        }

        public void dodajUcznia(Nauczyciel.Uczen uczen) {
            uczniowie.add(uczen);
        }

        public void wyswietlUczniow() {
            System.out.println("Uczniowie w szkole " + nazwa + ":");
            for (Nauczyciel.Uczen uczen : uczniowie) {
                System.out.println(uczen.getImie() + " " + uczen.getNazwisko() + " - Klasa: " + uczen.getKlasa());
            }
        }

        public void wyswietlNauczycieli() {
            System.out.println("Nauczyciele w szkole " + nazwa + ":");
            for (OsobaSzkola.Nauczyciel nauczyciel : nauczyciele) {
                System.out.println(nauczyciel.getImie() + " " + nauczyciel.getNazwisko() + " - Przedmiot: " + nauczyciel.getPrzedmiot());
            }
        }

    }
}

