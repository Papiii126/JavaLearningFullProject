package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie12_13_16;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Student {
    private String imie;
    private String nazwsiko;
    private int liczbaPunków;

}
