package rozdzial2.zajecia9;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Uzytkownik implements Serializable {
    private String imie;
    private String nazwisko;
    private String haslo;

}
