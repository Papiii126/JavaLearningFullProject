package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie10_18;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Klient k1 = Klient.builder()
                .imie("Patryk")
                .nazwisko("Tobiasz")
                .id(100)
                .build();

        Klient k2 = Klient.builder()
                .imie("Tomasz")
                .nazwisko("Obrazek")
                .id(500)
                .build();

        Klient k3 = Klient.builder()
                .imie("Robert")
                .nazwisko("Paletka")
                .id(120)
                .build();

        Klient k4 = Klient.builder()
                .imie("Wojciech")
                .nazwisko("Robak")
                .id(222)
                .build();

        List<Klient> klientList = List.of(k1, k2, k3, k4);
//        Ćwiczenie 10
//        Opis: Utwórz mapę klientów z ich identyfikatorami jako kluczami.
        System.out.println("Zadanie 10: ");
        System.out.println(idAsAKey(klientList));

//        Ćwiczenie 18
//        Opis: Połącz wszystkie imiona klientów w jeden string, oddzielając je przecinkami.
        System.out.println("Zadanie 18:");
        System.out.println(connectIntoOneWord(klientList));


    }

    public static Map<Integer, Klient> idAsAKey(List<Klient> klientList) {

        Map<Integer, Klient> mapaKlientow = klientList.stream()
                .collect(Collectors.toMap(Klient::getId, klient -> klient));

        mapaKlientow.forEach((id, klient) ->
                System.out.println("ID: " + id + ", Klient: " + klient.getImie() + " " + klient.getNazwisko()));

        return mapaKlientow;
    }

    private static String connectIntoOneWord(List<Klient> klientList) {
        return klientList.stream()
                .map(Klient::getImie)
                .reduce((name, name2) -> name + " , " + name2)
                .get();
    }
}
