package rozdzial2.zajecia15;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Projekt {
    private String nazwa;
    private double koszt;
    private List<Pracownik> pracownikList2;

    @Builder
    public Projekt(String nazwa, double koszt) {
        this.nazwa = nazwa;
        this.koszt = koszt;
        this.pracownikList2 = new ArrayList<>();
    }

    public void addPracownikToProjekt(Pracownik pracownik) {
        if (pracownik.getProjekt() != null) {
            throw new IllegalArgumentException("Pracownik już jest przypisany do innego projektu.");
        } else {
            pracownik.setProjekt(this);
            System.out.println("Pomyślnie dodano pracownika do projektu.");
        }
    }
}
