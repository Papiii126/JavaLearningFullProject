package rozdzial2.zajecia15;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class PracownikProjekt {
    private Pracownik pracownik;
    private Projekt projekt;
    private Ocena ocena;
    private LocalDate data;

    public PracownikProjekt(Pracownik pracownik, Projekt projekt, Ocena ocena, LocalDate data) {
        this.pracownik = pracownik;
        this.projekt = projekt;
        this.ocena = ocena;
        this.data = data;
    }
}
