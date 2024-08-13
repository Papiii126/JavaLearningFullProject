package rozdzial2.zajecia10.daty.zadanie.turniej;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
class Gracz extends Turniej{
    private String imie;
    private String nazwisko;
    private String nick;
}

