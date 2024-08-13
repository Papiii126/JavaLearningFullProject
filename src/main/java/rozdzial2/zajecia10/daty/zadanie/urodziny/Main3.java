package rozdzial2.zajecia10.daty.zadanie.urodziny;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main3 {
    //Poproś program aby zapytal Cię o datę Twojego urodzenia
    //- jeśli podałeś datę późniejszą niż dziś to niech program rzuci   błędem: InvalidBirthDateException BEZ TEGO, na nastepnych zajeciach zrobimy
    //- program wypisuje ile dni żyjesz już
    //- program wypisuje ile już miesiecy żyjesz
    //- program wypisuje już ile lat żyjesz
    //- program wypisuje w który dzień tygodnia się urodziłeś

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podaj datę urodzenia w formacie ddMMYYYY: ");
        String data = scanner.nextLine();
            if (data.length() != 8) {
                System.out.println("Podano za krótki ciąg liczb.");
                System.out.println("Spróbuj ponownie");
            } else {
                int dzien = Integer.parseInt(data.substring(0, 2));
                int miesiac = Integer.parseInt(data.substring(2, 4));
                int rok = Integer.parseInt(data.substring(4));

                LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
                LocalDate dzisiaj = LocalDate.now();

                Period wiek = Period.between(dataUrodzenia, dzisiaj);

                long dni = ChronoUnit.DAYS.between(dataUrodzenia, dzisiaj);

                long miesiace = ChronoUnit.MONTHS.between(dataUrodzenia, dzisiaj);

                DayOfWeek dzienTygodnia = dataUrodzenia.getDayOfWeek();

                System.out.println("Żyjesz już " + dni + " dni, " + miesiace + " miesięcy i " + wiek.getYears() + " lat." + " Urodziłeś się w " + dzienTygodnia);

            }
        }
    }


