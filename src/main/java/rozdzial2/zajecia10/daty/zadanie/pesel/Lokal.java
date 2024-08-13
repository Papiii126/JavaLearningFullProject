package rozdzial2.zajecia10.daty.zadanie.pesel;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Lokal {
    private String nazwa;
    private String miejsce;
    private int minimalnyWiek;

    private static List<Osoba> goscie = new ArrayList<>();

    public void dodajGoscia(Osoba osoba) throws JestesZaMlodyZiomException {
        if (osoba.obliczWiek() < this.minimalnyWiek) {
            throw new JestesZaMlodyZiomException("Nie masz tylu lat");
        }
        if (!goscie.contains(osoba)){
            goscie.add(osoba);
            osoba.przypiszLocal(this);

        }
    }

    // wejscie do lokalu
    public void wejscieDoLokalu(Osoba osoba) throws JestesZaMlodyZiomException {
        try {
            this.dodajGoscia(osoba);
        } catch (JestesZaMlodyZiomException e) {
            throw new JestesZaMlodyZiomException("nie da rady");
        }
    }

    public List<Osoba> returnGosci(){
        return goscie;
    }
}







