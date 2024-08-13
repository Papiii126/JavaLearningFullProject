package rozdzial2.zajecia10.daty.zadanie.pesel;

import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
public class Osoba {

    private static final double addToYear = 1900;

    private String imie;
    private String nazwisko;
    private String pesel;
    private LocalDate dataUrodzenia;
    private Lokal lokal;

    public Osoba(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.dataUrodzenia = LocalDate.of((int) (Integer.parseInt(pesel.substring(0, 2)) + addToYear), Integer.parseInt(pesel.substring(2, 4)), Integer.parseInt(pesel.substring(4, 6)));
    }

    public void przypiszLocal(Lokal lokal){
        this.lokal = lokal;

    }


    private LocalDate extractBirthDate(String pesel) {
        if (pesel == null || pesel.length() != 11) {
            throw new IllegalArgumentException("Nieprawidłowy numer PESEL");
        }

        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        if (month >= 1 && month <= 12) {
            year += 1900;
        } else if (month >= 21 && month <= 32) {
            year += 2000;
            month -= 20;
        } else if (month >= 41 && month <= 52) {
            year += 2100;
            month -= 40;
        } else if (month >= 61 && month <= 72) {
            year += 2200;
            month -= 60;
        } else if (month >= 81 && month <= 92) {
            year += 2000;
            month -= 80;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy numer PESEL");
        }

        return LocalDate.of(year, month, day);
    }

    public int obliczWiek() {
        if (this.dataUrodzenia == null) {
            throw new IllegalStateException("Data urodzenia jest null");
        }
        return Period.between(this.dataUrodzenia, LocalDate.now()).getYears();
    }
}



