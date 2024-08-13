package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Produkt {
    private String nazwa;
    private int cena;
    private String kategoria;
}
