package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie7;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Klient {
    private String imie;
    private String nazwisko;
}
