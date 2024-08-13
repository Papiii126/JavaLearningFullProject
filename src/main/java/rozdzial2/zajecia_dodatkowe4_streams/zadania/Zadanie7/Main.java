package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Klient k1 = Klient.builder()
                .imie("Janusz")
                .nazwisko("Stopa")
                .build();

        Klient k2 = Klient.builder()
                .imie("Kamil")
                .nazwisko("Oko")
                .build();

        Klient k3 = Klient.builder()
                .imie("Władysław")
                .nazwisko("Telewizor")
                .build();

        Klient k4 = Klient.builder()
                .imie("Andrzej")
                .nazwisko("Brzęczystopa")
                .build();

        List<Klient> klienttList = List.of(k1, k2, k3, k4);

//        Ćwiczenie 7
//        Opis: Utwórz listę nazwisk klientów posortowaną alfabetycznie.

        System.out.println(toSortBySurname(klienttList));

    }

    private static List<Klient> toSortBySurname(List<Klient> klienttList) {
        return klienttList.stream()
                .sorted(Comparator.comparing(Klient::getNazwisko))
                .collect(Collectors.toList());
    }
    }
