package rozdzial2.zajecia10.daty.zadanie.turniej;

import lombok.Builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    /*
     * Stworz klasę turniej (nazwa, wpisowe, data,punkty, liczba miejsc
     * punktowanych) Stwórz klasę gracz (imię, nazwisko, nick)
     *
     * Kazdy turniej ma pule punktów do rozdpsynowania pomiedzy graczy ktorzy zajeli
     * odpowiednie miejsca (liczba miejsc punktowanych). Wymysl jak rozdysponowac
     * punkty pomiedzy miejsca punktowane.
     *
     *
     * Napisz metode która znajduje najlepszego gracza z danego miesiąca.
     * Napisz metode ktora znajduje najlepszego gracza z danego okresu czasu.
     * Napisz metode ktora znajduje graczy z danego okresu czasu.
     * Napisz metoda która zwraca liste graczy którzy zajeli 1 miejsce przynajmniej w dwoch roznych miesiącach
     *
     */

    public static void main(String[] args) {
        Turniej t1 = Turniej.builder()
                .nazwa("Kwietniowy")
                .wpisowe(1000)
                .data(LocalDate.of(2024, 02, 24))
                .punkty(5000)
                .liczbaMiejscPunktowanych(3)
                .build();

        t1.rozdzielPunkty();
        Gracz g1 = Gracz.builder()
                .imie("Tomasz")
                .nazwisko("Jatus")
                .nick("Jatusek")
                .build();

        Gracz g2 = Gracz.builder()
                .imie("Antoni")
                .nazwisko("Lato")
                .nick("Lotos")
                .build();

        Gracz g3 = Gracz.builder()
                .imie("Konrad")
                .nazwisko("Pluto")
                .nick("Pies")
                .build();

        List<Gracz> graczList = new ArrayList<>();
        graczList.add(g1);
        graczList.add(g2);
        graczList.add(g3);

        try {
            Gracz najlepszyGracz = Turniej.najlepszyGraczZMiesiaca(graczList, 2, 2024);
            System.out.println("Najlepszy gracz z lutego 2024: " + najlepszyGracz.getImie() + " " + najlepszyGracz.getNazwisko());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}




