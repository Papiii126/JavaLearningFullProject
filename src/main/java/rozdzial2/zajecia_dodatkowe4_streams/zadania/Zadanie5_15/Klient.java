package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie5_15;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Klient {
    private String imie;
    private String nazwsiko;
    private String miasto;
    private String adres;
}
