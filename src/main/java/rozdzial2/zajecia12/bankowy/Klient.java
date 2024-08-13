package rozdzial2.zajecia12.bankowy;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Klient {
    private String imie;
    private String nazwisko;
    private List<Konto> konta;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.konta = new ArrayList<>();
    }

    public void addAccount(Konto konto) throws NullIsForbiddenException {
        if (Objects.nonNull(konto)) {
            konta.add(konto);
        } else {
            throw new NullIsForbiddenException("Parametr nie może być null");
        }
        System.out.println("Operacja została wykonana pomyślnie");
    }
}
