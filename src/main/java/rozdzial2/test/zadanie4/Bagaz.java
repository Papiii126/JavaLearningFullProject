package rozdzial2.test.zadanie4;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bagaz {
    private String nazwaFirmy;
    private double waga;

    public Bagaz(String nazwaFirmy, double waga) {
        if (nazwaFirmy == null) {
            throw new IllegalArgumentException("Nazwa firmy nie może być null!");
        } else if (waga <= 0 || waga >= 32.5) {
            throw new IllegalArgumentException("Waga nie może być mniejsza od 0 kg i nie może być większa niż 32.5 kg!");
        } else {
            this.nazwaFirmy = nazwaFirmy;
            this.waga = waga;
        }
    }
}

