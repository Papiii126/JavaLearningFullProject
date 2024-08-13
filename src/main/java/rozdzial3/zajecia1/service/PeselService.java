package rozdzial3.zajecia1.service;

import rozdzial3.zajecia1.exception.InvalidPeselException;

import java.time.LocalDate;

public class PeselService {

    public boolean validPesel(String pesel) {
        if (pesel != null && pesel.length() == 11 && pesel.matches(("\\d+"))) {
            return true;
        } else {
            return false;
        }
    }


    public LocalDate getDateOfBirth(String pesel) throws InvalidPeselException {
        if (!validPesel(pesel)) {
            throw new InvalidPeselException("Podano błędny numer Pesel!");
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
        }
        return LocalDate.of(year, month, day);
}
}


