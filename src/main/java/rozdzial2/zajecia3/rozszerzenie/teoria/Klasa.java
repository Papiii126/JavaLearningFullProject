package rozdzial2.zajecia3.rozszerzenie.teoria;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
    private String nazwa;

    public Klasa(String nazwa) {
        this.nazwa = nazwa;
    }

    // asocjacja dla wielu uczniow w klasie

    private List<Uczen> listaUczniow = new ArrayList<>();

    public void dodajUczeniaDoKlasy(Uczen uczen) {
        if (uczen.getKlasa() != null) {
            System.out.println("nie mozna przypisac ucznnia do klasy poniważ już ma klasę");
        } else {
            uczen.setKlasa(this);
            listaUczniow.add(uczen);
        }
    }

    public void removeStudent(Uczen uczen) {
        if (uczen.getKlasa() != null) {
            uczen.setKlasa(null);
            listaUczniow.remove(uczen);
        }
    }

    public void displayStudents () {
        for(Uczen czesiek : listaUczniow)  {
            System.out.println(czesiek);
        }
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;

    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
