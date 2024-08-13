package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Produkt p1 = Produkt.builder()
                .nazwa("telefon")
                .cena(100)
                .kategoria("elektronika")
                .build();

        Produkt p2 = Produkt.builder()
                .nazwa("aparat")
                .cena(75)
                .kategoria("elektronika")
                .build();

        Produkt p3 = Produkt.builder()
                .nazwa("telewizor")
                .cena(200)
                .kategoria("elektronika")
                .build();

        Produkt p4 = Produkt.builder()
                .nazwa("chipsy")
                .cena(49)
                .kategoria("spożywcze")
                .build();

        List<Produkt> produkttList = List.of(p1, p2, p3, p4);

//        Ćwiczenie 11
//        Opis: Policz liczbę produktów w każdej kategorii.
        countAmountOfProducts(produkttList);
    }

    public static void countAmountOfProducts (List<Produkt> produktList) {
        Map<Object, Long> productCount = produktList.stream()
                .collect(Collectors.groupingBy(Produkt::getKategoria, Collectors.counting()));

        productCount.forEach((kategoria, count) ->
                System.out.println("Kategoria: " + kategoria + ", ilość produktów " + count));
    }
}
