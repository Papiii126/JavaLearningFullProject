package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie20;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.random.RandomGenerator;

@Data
@Builder

public class Student {
    private String imie;
    private String nazwisko;
    private int wynik;
    private int ID;

    private static int GENERATOR = 1;

    public Student(String imie, String nazwisko, int wynik, int ID) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynik = wynik;
        this.ID = ID;
    }
}







