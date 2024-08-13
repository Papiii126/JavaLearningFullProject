package rozdzial2.zajecia15;

import lombok.Builder;
import lombok.Data;

import java.util.regex.Pattern;

@Data
@Builder
public class Adres {
    private String nazwaUlicy;
    private int numerMieszkania;
    private String kodPocztowy;
    private String miasto;

    public void validateKodPocztowy() {
        if (kodPocztowy == null || !Pattern.matches("^\\d{2}-\\d{3}$", kodPocztowy)) {
            throw new IllegalArgumentException("Podano błędny format kodu pocztowego. Podaj date w formacie: XX-XXX");
        }
        this.kodPocztowy = kodPocztowy;
    }
}
