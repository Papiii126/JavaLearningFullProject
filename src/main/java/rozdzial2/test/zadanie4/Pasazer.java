package rozdzial2.test.zadanie4;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pasazer {
    private String imie;
    private String pesel;
    private double waga;

    public Pasazer(String imie, String pesel, double waga) {
        if (imie == null || imie.length() < 2) {
            throw new IllegalArgumentException("Imie jest null , lub jest za krótkie!");
        } else if (pesel == null || pesel.length() != 11 || !pesel.matches(("\\d+"))) {
            throw new IllegalArgumentException("Podano błędny pesel!");
        } else if (waga <= 0) {
            throw new IllegalArgumentException("Waga nie może być mniejsza od 0!");
        } else {
            this.imie = imie;
            this.pesel = pesel;
            this.waga = waga;
        }
    }
}
