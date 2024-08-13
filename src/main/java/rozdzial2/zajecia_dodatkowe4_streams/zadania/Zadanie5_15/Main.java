package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie5_15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Klient k1 = Klient.builder()
                .imie("Patrycja")
                .nazwsiko("Kowal")
                .miasto("Warszawa")
                .adres("Kochanowskiego 25")
                .build();

        Klient k2 = Klient.builder()
                .imie("Patryk")
                .nazwsiko("Pingowup")
                .miasto("Warszawa")
                .adres("Lisieckiego 144")
                .build();

        Klient k3 = Klient.builder()
                .imie("Piotr")
                .nazwsiko("Kupitus")
                .miasto("Warszawa")
                .adres("Rembertów 123")
                .build();

        Klient k4 = Klient.builder()
                .imie("Antoni")
                .nazwsiko("Dupal")
                .miasto("Lublin")
                .adres("Kochanowskiego 25")
                .build();

        List<Klient> klientList = List.of(k1, k2, k3, k4);

//        Ćwiczenie 5
//        Opis: Uzyskaj listę unikalnych miast z adresów klientów.
        System.out.println("Zadanie 5:");
        System.out.println(listFromAdress(klientList));

//        Ćwiczenie 15
//        Opis: Zlicz liczbę klientów z danego miasta.
        System.out.println("Zadanie 15:");
        System.out.println(sumOfClientByCity(klientList));

    }

    private static Set<String> listFromAdress(List<Klient> klientList) {
        return klientList.stream()
                .map(Klient::getAdres)
                .collect(Collectors.toSet());

    }

    public static Map<String, Long> sumOfClientByCity(List<Klient> studenttList) {
        Map<String, Long> countClientByCity = studenttList.stream()
                .collect(Collectors.groupingBy(Klient::getMiasto, Collectors.counting()));

        countClientByCity.forEach((miasto, count) ->
                System.out.println("Miasto: " + miasto + " , " + "liczba klientów: " + count));
        return countClientByCity;
    }
}
