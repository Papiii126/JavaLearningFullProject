package rozdzial2.zajecia10.liczby;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Main {

    private static final DateTimeFormatter ab = DateTimeFormatter.ofPattern("MM.yyyy");
    public static void main(String[] args) {


        Month m = Month.APRIL;

        System.out.println(m.getValue());
        YearMonth ld = YearMonth.parse("05.2002", ab);
        YearMonth ld2 = YearMonth.parse("05.2002", ab);

        System.out.println(ld.equals(ld2));

        // przed java 8
        // W skrócie wyglądało to tak, że istniała klasa o nazwie Date, która wyznaczała
        // datę i czas oraz klasa Calendar,
        // której rolą było dostarczenie metod do manipulacji datą i czasem.

        Date data = new Date();
        // dzien
        System.out.println(data.getDate());

        // dzien
        System.out.println(data.getDay());

        SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(sd.format(data));

        Calendar calendar = Calendar.getInstance();
        Date dateBeforeJava8 = calendar.getTime(); // pobranie daty z obiektu kalendarza
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(dateBeforeJava8));

        calendar.set(Calendar.MONTH, 6); // ustawienie miesiąca *
        calendar.set(Calendar.DAY_OF_MONTH, 10); // ustawienie dnia w miesiącu
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 3); // dodanie lat do daty ustawionej daty w kalendarzu
        calendar.add(Calendar.DAY_OF_MONTH, 10); // dodanie dni do daty ustawionej daty w kalendarzu
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        /*
         * slabe api
         * data jest mutable, mozna ja modyfikowac co przy datach moze byc niebezpieczne
         * problemy w wielowatkowych systemach
         * date nie pozwala na podani strefy czasowej
         */

		/*
		 * java 1.8

			LocalDate - data w lokalnej (systemowej) albo zdefiniowanej przez nas strefie czasowej (bez przechowywania jej w obiekcie)
			LocalTime - czas w lokalnej (systemowej) albo zdefiniowanej przez nas strefie czasowej (bez przechowywania jej w obiekcie)
			LocalDateTime - data i czas w lokalnej (systemowej) albo zdefiniowanej przez nas strefie czasowej (bez przechowywania jej w obiekcie)
			ZonedDateTime - data i czas w lokalnej (systemowej) albo zdefiniowanej przez nas strefie czasowej (przechowywana w obiekcie)
			Duration - określenie czasu trwania w zakresie od nanosekund do liczby dni
			Period - określenie czasu trwania w zakresie od dni do lat
			TemporalAdjusters - dostosowanie daty do potrzeb za pomocą predefiniowanych metod
			Nowe formatery dat - nowe sposoby formatowania daty i czasu

			Klasa Instant reprezentuje konkretny punkt na linii czasu, a jej precyzja sięga nanosekund. Instant jest immutable,
			więc podczas próby modyfikacji obiektu tego typu uzyskujemy referencję do nowego obiektu, a obiekt modyfikowany pozostaje bez zmian.
			 To duży plus, ponieważ nie musimy się martwić, że spotkamy się z problemami takimi jak w przypadku użycia klasy Date.
			 Podobnie będzie z LocalTime, LocalDate, LocalDateTime i ZonedDateTime. One też są immutable.
		 */

        // Instant, czyli punkt w czasie
        Date date = new Date();
        Instant instant = Instant.now();

        System.out.println("Przed zmiana: " + date);
        date.setTime(0L);
        System.out.println("Po zmianie: " + date);

        //uzycie instanta powoduje ze podajemy czas w strefie czasowej UTC. to Z na koncu o tym mowi
        System.out.println("Przed zmiana: " + instant);
        instant.plusSeconds(60);
        System.out.println("Po zmianie: " + instant);
        System.out.println("---");


        // Jeszcze raz - bieżąca data
        System.out.println("Now: " + Instant.now());

        // Minimalna data (ekstremalnie daleko w przeszłości, liczona w miliaradach lat)
        System.out.println("Min: " + Instant.MIN);

        // Konwersja z Date do Instant
        Instant from = Instant.ofEpochMilli(new Date().getTime());
        System.out.println("From: " + from);

        //stworzenie instanta ze stringa, T format
        Instant inst = Instant.parse("2020-03-12T15:22:17Z");
        System.out.println("Ze Stringa: " + inst);
        System.out.println("----");


        //LocalDate sluzy do obslugi dat bez czasu z prostym definiowanym stref czasowych

        // Bieżąca data na podstawie zegara systemowego (domyślna strefa czasowa naszego systemu):
        LocalDate now = LocalDate.now();
        System.out.println("Now: " + now);

        System.out.println("Dzień słownie: " + now.getDayOfWeek());
        System.out.println("Dzień liczbowo " + now.getDayOfMonth());
        System.out.println();

        System.out.println("Miesiąc słownie: " + now.getMonth());
        System.out.println("Miesiąc liczbowo: " + now.getMonthValue());
        System.out.println();

        System.out.println("Dzień roku: " + now.getDayOfYear());
        System.out.println("Rok: " + now.getYear());
        System.out.println();

        // Porównanie dwóch dat - czy data java8FirstRelease jest przed bieżącą datą:
        LocalDate date1 = LocalDate.of(2005, 12, 13);
        LocalDate date2 = LocalDate.of(2003, 11, 17);


        //isBefore zwraca true jesli data1 jest wczesniej niz date2
        System.out.println("Czy jest wczesniej? " + date1.isBefore(date2));

        //isAfter zwraca true jesli data1 jest pozniej niz date2
        System.out.println("Czy jest pozniej? " + date1.isAfter(date2));

        //jutrzejsza data
        System.out.println("Jutrzejsza data: " + now.plusDays(1));

        //data 2 tygodnie pozniej
        System.out.println("2 tygodnie póniej: " + now.plusWeeks(2));

        //data 2 miesiace pozniej
        System.out.println("2 miesiace pozniej: " + now.plusMonths(2));

        //data 5 lat pozniej
        System.out.println("5 lat pozniej: " + now.plusYears(5));

        //wczorajsza data
        System.out.println("Wczorajsza data: " + now.minusDays(1));

        //data 2 tygodnie wczesniej
        System.out.println("2 tygodnie wczesniej: " + now.minusWeeks(2));

        //data 2 miesiace wczesniej
        System.out.println("2 miesiace wczesniej: " + now.minusMonths(2));

        //data 5 lat wczesniej
        System.out.println("5 lat wczesniej: " + now.minusYears(5));

        System.out.println("Data 5 lat wczesniej: " + now.minus(5, ChronoUnit.YEARS));

        System.out.println("Data za 50 dni " + now.plus(50, ChronoUnit.DAYS));

        // Bieżąca data w strefie azjatyckiej - Tokio:
        //https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
        LocalDate tokioDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokio:  " + tokioDate);

        // Data ze stringa:
        LocalDate fromString = LocalDate.parse("2014-03-18");
        System.out.println("Ze Stringa: " + fromString);


        //LocalTime - klasa reprezentujaca czas

        // Bieżący czas na podstawie zegara systemowego (domyślna strefa czasowa naszego systemu):
        LocalTime local = LocalTime.now();
        System.out.println(local);

        LocalTime all = LocalTime.of(20, 15, 30, 4455);
        System.out.println(all);

        LocalTime time = LocalTime.of(20, 15, 30);
        System.out.println(time);

        //czy localtme jest przed czasem biezacym
        System.out.println(time.isBefore(local));

        System.out.println("Hour: " + local.getHour());
        System.out.println("Minute: " + local.getMinute());
        System.out.println("Second: " + local.getSecond());
        System.out.println("Nano: " + local.getNano());


        //30 minut przed teraz
        System.out.println("30 minut temu " + local.minusMinutes(30));

        //Ostatnim typem "lokalnym" jest LocalDateTime, czyli połączenie dwóch poprzednich - LocalDate oraz LocalTime.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Wszystko naraz " + localDateTime);

        LocalDateTime startDateTime = LocalDateTime.of(2020, Month.APRIL, 21, 20, 15, 30);
        System.out.println(startDateTime);

        LocalDateTime startDateTimeParsed = LocalDateTime.parse("2020-04-21T20:15");
        System.out.println(startDateTimeParsed);

        System.out.println("Is startDateTimeParsed before localDateTime:");
        System.out.println(startDateTimeParsed.isBefore(localDateTime));

        // Pobranie godziny, minuty, sekundy oraz nanosekundy
        System.out.println("Hour: " + startDateTime.getHour());
        System.out.println("Minute: " + startDateTime.getMinute());
        System.out.println("Second: " + startDateTime.getSecond());
        System.out.println("Nano: " + startDateTime.getNano());

        /*
         * Zanim przejdziemy do klasy ZonedDateTime, wyjaśnimy jeszcze, skąd bierzemy informacje o strefach czasowych w Javie.
         *  Wszystkie strefy pochodzą z bazy informacyjnej IANA, znajdującej się pod adresem
         *  https://www.iana.org/time-zones.
         *   W kodzie Javy listę stref wyciągamy za pomocą metody getAvailableZoneIds z klasy ZoneId.
         *    Możemy też stworzyć obiekt tej klasy, który będzie reprezentował konkretną strefę. Taka umiejętność przyda się już w kolejnym paragrafie.
         */


        Set<String> allZones = ZoneId.getAvailableZoneIds();
        for (String s : allZones) {
            System.out.println(s);
        }

        ZoneId europeWarsawZone = ZoneId.of("Europe/Warsaw");
        System.out.println("Zone name: " + europeWarsawZone.toString());
        System.out.println();

        //ZonedDateTime - biezaca data i czas na podstawie strefy czasowej
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Tokyo")));

        System.out.println("Hour: " + zonedDateTime.getHour());
        System.out.println("Minute: " + zonedDateTime.getMinute());
        System.out.println("Second: " + zonedDateTime.getSecond());
        System.out.println("Nano: " + zonedDateTime.getNano());

        // klasa Period reprezentujac aokres miedzy dwiema datami

        Period period = Period.of(1, 10, 5);
        System.out.println("Okres roku, 10 miesiecy i 5 dni " + period);

        LocalDate date3 = LocalDate.of(2005, 12, 13);
        LocalDate date4 = LocalDate.of(2003, 5, 17);

        System.out.println("Okres pomiędzy dwoma datami: " + Period.between(date3, date4));
        System.out.println("Okres pomiędzy dwoma datami: " + Period.between(date4, date3));

        Period period2 = Period.between(date4, date3);

        LocalDate dateBefore = LocalDate.of(2005, 11, 12);
        LocalDate dateAfter = LocalDate.of(2011, 10, 12);
        long daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

        //tu powinna nam wyjsc data 3
        System.out.println(date4.plus(period2).equals(date3));

        /*
         * Klasa Duration odpowiada za wyliczanie różnicy czasu, jaka minęła od jednego
         * punktu w czasie do drugiego, a więc od jednego znacznika typu Temporal do
         * drugiego znacznika tego typu. Mogą to być na przykład dwa obiekty typu
         * Instant albo dwa obiekty typu LocalDateTime (jak również inne implementacje
         * interfejsu Temporal).
         */


        Instant startTime = Instant.now();
        for (int i = 0; i < 100; i++) {
            manipulateNumbers();
        }
        Instant endTime = Instant.now();

        System.out.println("Instant - Duration in millis:");
        System.out.println(Duration.between(startTime, endTime).toMillis());

        LocalTime startTime1 = LocalTime.now();
        for (int i = 0; i < 1; i++) {
            manipulateNumbers();
        }
        LocalTime endTime1 = LocalTime.now();

        System.out.println("LocalTime - Duration in millis:");
        System.out.println(Duration.between(startTime1, endTime1).toMillis());


        LocalDateTime startTime2 = LocalDateTime.now();
        for (int i = 0; i < 100; i++) {
            manipulateNumbers();
        }
        LocalDateTime endTime2 = LocalDateTime.now();

        System.out.println("LocalDateTime - Duration in millis:");
        System.out.println(Duration.between(startTime2, endTime2).toMillis());

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("localDateTimeShift - before: " + now1);
        LocalDateTime nowMoved = now1
                .plus(Duration.ofDays(5))
                .plus(Duration.ofHours(1))
                .minus(Duration.ofMinutes(30))
                .plus(Duration.ofSeconds(10));
        System.out.println("localDateTimeShift - after: " + nowMoved);


        Duration oneHour = Duration.ofHours(1);
        System.out.println(oneHour.getSeconds() + " seconds"); // zwraca liczbę sekund dla 1 godziny


        //formatery W Javie 8 dostajemy wbudowane formatery, jak również możemy tworzyć własne.
        LocalDateTime now3 = LocalDateTime.of(2020, Month.APRIL, 21, 5, 9, 33, 9991031);
        System.out.println("ISO_DATE: " + DateTimeFormatter.ISO_DATE.format(now3));
        System.out.println("ISO_DATE_TIME: " + DateTimeFormatter.ISO_DATE_TIME.format(now3));
        System.out.println("ISO_TIME: " + DateTimeFormatter.ISO_TIME.format(now3));

        LocalDateTime now4 = LocalDateTime.now();
        String formatWithNano = "yyyy-MM-dd HH:mm:ss.nnnnnnnnn";
        DateTimeFormatter dateTimeFormatterNano = DateTimeFormatter.ofPattern(formatWithNano);
        System.out.println("Nano: " + dateTimeFormatterNano.format(now4));

        String formatWithMilli = "yyyy-MM-dd HH:mm:ss.SSS";
        DateTimeFormatter dateTimeFormatterWithMilli = DateTimeFormatter.ofPattern(formatWithMilli);
        System.out.println("Milli: " + dateTimeFormatterWithMilli.format(now4));

        /**
         * Legenda:
         *
         * HH - godzina (0-23), na przykład 00
         * mm - minuta (0-59), na przykład 29
         * ss - sekunda (0-59), na przykład 32
         * SSS  - część tysięczna sekundy, tzw. milisekunda (0-999), na przykład 526
         * nnnnnnnnn - część milionowa milisekundy (0 - 999999999), na przykład 408374916
         *             część miliardowa sekundy
         */
    }

    private static void manipulateNumbers() {
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i * 10;
            sum -= i / 20;
        }

    }
}




