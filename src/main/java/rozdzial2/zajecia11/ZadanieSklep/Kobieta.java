package rozdzial2.zajecia11.ZadanieSklep;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

public class Kobieta extends Osoba {
    public Kobieta(String imie, String nazwisko, int wiek, String miasto, String plec) {
        super(imie, nazwisko, wiek, miasto, plec);
    }
}

