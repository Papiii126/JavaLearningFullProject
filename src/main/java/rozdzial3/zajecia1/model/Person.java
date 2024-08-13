package rozdzial3.zajecia1.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;

    public Person(String imie, String nazwisko, String miasto, int wiek) {
        if (imie == null || imie.length() < 2) {
            throw new IllegalArgumentException("Imie jest null, lub jest za krótkie!");
        } else if (nazwisko == null || nazwisko.length() < 2) {
            throw new IllegalArgumentException("Nazwisko jest null, lub jest za krótkie!");
        } else if (miasto == null) {
            throw new IllegalArgumentException("Miasto nie może być null!");
        } else {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.miasto = miasto;
            this.wiek = wiek;
        }
    }
}