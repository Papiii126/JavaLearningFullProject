package rozdzial3.zajecia1;

import rozdzial3.zajecia1.exception.InvalidPeselException;
import rozdzial3.zajecia1.service.PeselService;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InvalidPeselException {


        // * 1. Wykorzystując optional:
        // - zapytaj użytkownika o jego imie, jeśli imie będzie podane to wypisz długość
        // imienia, jeśli nie to wypisz 0.

        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj imie: ");
        String odp = sc.nextLine();

        Optional<String> imie = Optional.ofNullable(odp.isEmpty() ? null : odp);

        if (imie.isPresent() && odp.matches("[a-zA-Z]+")) {
            System.out.println("Podane imie ma długość: " + imie.get().length());
        } else {
            System.out.println("0");
        }

        // 2. Wykorzystując optionale i streamy:
        // - napisz metode ktora jako argument pobiera liste integerow a jako wynik
        // zwraca 5 najwkeiszych elementow na liscie,
        // lub pustą listę jeśli z jakiegokolwiek powodu nie da rady znaleźć 5
        // najwiekszych elementow.

        List<Integer> liczby = List.of(100, 1256, 14458, 1455854, 45585445, 456);
        System.out.println("Największe elementy z listy: "  + return5BiggestElements(liczby));

        // 3. zapytaj użytkownika o pesel, jeśli będzie podany poprawny pesel (11 zankow
        // powiedzmy wiekszej walidacji nie ma co robic, no i nie null i nie pusty) to
        // bierzemy date urodzenia z tego numeru, w przeciwnym przypadku rzucamy
        // wyjatkiem InvlaidPeselException

        PeselService peselService = new PeselService();
        System.out.println("Podaj numer pesel składający się z 11 cyfr: ");
        String pesel = sc.nextLine();

        System.out.println("Czy podany pesel jest prawidłowy?: " + peselService.validPesel(pesel));
        System.out.println("Urodziłeś się: " + peselService.getDateOfBirth(pesel));


    }

    public static List<Integer> return5BiggestElements(List<Integer> integerList) {
        return Optional.ofNullable(integerList)
                .filter(list -> list.size() >= 5)
                .map(list -> list.stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(5)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());
    }
}


//    public static void validPesel(String pesel) {
//        if (pesel != null && pesel.length() == 11 && pesel.matches(("\\d+"))) {
//            System.out.println("Podany pesel jest prawidłowy");
//        } else {
//            System.out.println("Podano niepoprawny pesel!");
//        }
//    }


