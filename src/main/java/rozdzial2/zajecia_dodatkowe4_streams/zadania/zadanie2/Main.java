package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie2;

import org.jetbrains.annotations.Nls;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> animals = List.of("albatros", "baran", "pies", "kot", "ptak");

//        Ćwiczenie 2
//        Opis: Przekonwertuj listę stringów na wielkie litery.

        System.out.println(convertIntoCapitalLetters(animals));

    }

    private static List<String> convertIntoCapitalLetters(List<String> animals) {
        List<String> wielkieLitery = animals.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        return wielkieLitery;

//                .map(s -> s.toUpperCase())
//                .toList()
//                .forEach(System.out::println);
    }

}
