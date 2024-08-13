package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie4_14;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Produkt p1 = Produkt.builder()
                .nazwa("telefon")
                .cena(100)
                .build();

        Produkt p2 = Produkt.builder()
                .nazwa("aparat")
                .cena(75)
                .build();

        Produkt p3 = Produkt.builder()
                .nazwa("telewizor")
                .cena(200)
                .build();

        Produkt p4 = Produkt.builder()
                .nazwa("chipsy")
                .cena(49)
                .build();

        List<Produkt> koszyk = List.of(p1, p2, p3, p4);

//        Ćwiczenie 4
//        Opis: Zsumuj ceny wszystkich przedmiotów w koszyku.
        System.out.println("Zadanie 4: ");
        System.out.println("Suma: " + toSum(koszyk));

//        Ćwiczenie 14
//        Opis: Sprawdź, czy jakikolwiek produkt w koszyku kosztuje mniej niż 5 dolarów.
        System.out.println("Zadanie 14: ");
        System.out.println(anyMatch(koszyk));

    }

    public static int toSum(List<Produkt> koszyk) {
        Integer suma = koszyk.stream()
                .map(Produkt::getCena)
                .reduce(Integer::sum)
                .get();

        return suma;
    }

    public static boolean anyMatch(List<Produkt> koszyk) {
        boolean b = koszyk.stream()
                .anyMatch(produkt -> produkt.getCena() <= 5);

        return b;

    }
}
