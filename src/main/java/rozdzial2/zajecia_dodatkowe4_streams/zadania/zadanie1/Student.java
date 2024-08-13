package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie1;

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
