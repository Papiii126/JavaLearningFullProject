package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie9;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> liczby = List.of(1, 5, 10, 15, 20, 100);

//        Ćwiczenie 9
//        Opis: Przekonwertuj listę liczb na ich kwadraty.
        System.out.println(liczby);
        System.out.println("Kwadraty liczb: " + thePowerOfNumber(liczby));

    }

    private static List<Integer> thePowerOfNumber(List<Integer> liczby) {
        return liczby.stream()
                .map(liczba -> liczba * liczba)
                .toList();

    }
}
