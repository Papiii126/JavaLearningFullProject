package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie3_17;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Product {
    private String nazwa;
    private int cena;
}
