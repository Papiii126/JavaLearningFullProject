package rozdzial2.zajecia11.ZadanieSklep;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Randka {
    private Osoba osoba1;
    private Osoba osoba2;

    public Osoba getOsoba1() {
        return osoba1;
    }

    public Osoba getOsoba2() {
        return osoba2;
    }

    public void addOsobatoRandka(Osoba osoba1, Osoba osoba2) throws NoHomoHereException {
        if (osoba1.getPlec() == osoba2.getPlec()) {
            throw new NoHomoHereException("Nie ma opcji tworzenie par jednopłciowych!!!");
        }
    }
}





