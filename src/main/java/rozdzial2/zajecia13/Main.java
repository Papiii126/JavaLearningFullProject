package rozdzial2.zajecia13;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Zadanie 1
        Optional<String> op1 = Optional.ofNullable(null);
        if (op1.isEmpty()) {
            System.out.println("Optional op1: " + op1);
        }
        Optional<String> op2 = Optional.ofNullable("null");
        if (op2.isPresent()) {
            System.out.println("Optional op2: " + op2);
        }
//
//        Optional<String> optionalNoValue = Optional.ofNullable(null);
//        if (optionalNoValue.isPresent()) {
//            System.out.println(optionalNoValue.get());
//        } else {
//            System.out.println("Brak wartości");
//        }


        //1. Sprawdzenie obecności wartości: Sprawdź, czy Optional zawiera wartość. (metoda i sprawdzenie tej metody)
        Optional<String> optional = Optional.of("Siemaneczko");
        boolean result = usageIsPresent(optional);
        System.out.println("Czy optional zaweira wartość?: " + result);

        //2. Użycie orElse: Zwróć wartość z Optional lub domyślną wartość, jeśli Optional jest pusty
        List<String> names = new ArrayList<>();
        Optional<String> optionalNames = names.stream().findAny();
        System.out.println(usageOrElse(optionalNames));

        // 3. Użycie orElseGet: Zwróć wartość z Optional lub wartość dostarczoną przez funkcję, jeśli Optional jest pusty.
        Optional<String> optionalNames1 = names.stream().findAny();
        System.out.println(usageOfOrElseGet(optionalNames1));

        // 4. Użycie orElseThrow: Zwróć wartość z Optional lub rzuć wyjątek, jeśli Optional jest pusty.
        List<String> surnames = List.of("Podkowa", "Szama", "Kebab");
        Optional<String> optionalNames2 = surnames.stream().findAny();
        try {
            System.out.println(usageOfOrElseThrow(optionalNames2));
        } catch (RuntimeException e) {
            System.out.println("Optional jest pusty");
        }

        // 5. IfPresent: Wykonaj akcję, jeśli Optional zawiera wartość.
        List<Book> books = Arrays.asList(new Book("Kubuś Puchatek", "fabularna"),
                new Book("Władca Pierścieni", "fantasy"),
                new Book("Opowieści z Narni", null),
                new Book("Hobbit", "fantasy"),
                new Book("Tomek i przyajeciele", "fabularna"),
                new Book("Mad Max", null));

        System.out.println("Gatunki książek: ");
        books.stream()
                .map(Book::getType)
                .forEach(type -> {
                    Optional.ofNullable(type)
                            .ifPresent(System.out::println);
                });
    }

    //Optional
    //1. Sprawdzenie obecności wartości: Sprawdź, czy Optional zawiera wartość. (metoda i sprawdzenie tej metody)
    static boolean usageIsPresent(Optional<String> optional) {
        return optional.isPresent();
    }

    //2. Użycie orElse: Zwróć wartość z Optional lub domyślną wartość, jeśli Optional jest pusty
    static String usageOrElse(Optional<String> optional) {
        return optional.map(s -> "Optional: " + s)
                .orElse("Brak optionala");
    }

    // 3. Użycie orElseGet: Zwróć wartość z Optional lub wartość dostarczoną przez funkcję, jeśli Optional jest pusty
    static String usageOfOrElseGet(Optional<String> optional) {
        return optional.map(s -> "Optional: " + s)
                .orElseGet(() -> UUID.randomUUID().toString());
    }

    // 4. Użycie orElseThrow: Zwróć wartość z Optional lub rzuć wyjątek, jeśli Optional jest pusty
    static String usageOfOrElseThrow(Optional<String> optional) {
        if (optional.isPresent()) {
            return "Optional: " + optional.get();
        } else {
            throw new RuntimeException("Optional jest pusty");
        }
    }
}









