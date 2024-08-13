package rozdzial2.zajecia11;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pracownik {
    private String imie;

    public double obliczPensje(double liczbaGodzin) {
        if (liczbaGodzin < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być większa od 0");
        }
        return liczbaGodzin * 35;
    }
}
