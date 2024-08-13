package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie8_19;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Produktt {
    private String nazwa;
    private int cena;
    private String kategoria;
}
