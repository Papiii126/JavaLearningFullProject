package rozdzial2.zajecia_dodatkowe4_streams.zadania.Zadanie8_19;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {

        Produktt p1 = Produktt.builder()
                .nazwa("telefon")
                .cena(100)
                .kategoria("elektronika")
                .build();

        Produktt p2 = Produktt.builder()
                .nazwa("aparat")
                .cena(75)
                .kategoria("elektronika")
                .build();

        Produktt p3 = Produktt.builder()
                .nazwa("telewizor")
                .cena(200)
                .kategoria("elektronika")
                .build();

        Produktt p4 = Produktt.builder()
                .nazwa("chipsy")
                .cena(49)
                .kategoria("spożywcze")
                .build();

        List<Produktt> produkttList = List.of(p1, p2, p3, p4);

//        Ćwiczenie 8
//        Opis: Grupuj produkty według kategorii.
        System.out.println("Zadanie 8:");
        groupByCategories(produkttList);

//        Ćwiczenie 19
//        Opis: Znajdź średnią cenę produktów w koszyku.
        System.out.println("Zadanie 19:");
        System.out.println("Średnia cena: " + displayAveragePrice(produkttList));

    }

    private static Map groupByCategories(List<Produktt> produkttList) {
        Map<String, List<Produktt>> produktyWedlugKategorii = produkttList.stream()
                .collect(Collectors.groupingBy(Produktt::getKategoria));

        produktyWedlugKategorii.forEach((kategoria, produkty) -> {
            System.out.println("Kategoria: " + kategoria);
            produkty.forEach(produkt -> System.out.println(" - " + produkt.getNazwa() + ": " + produkt.getCena() + " zł"));
        });
        return produktyWedlugKategorii;
    }

    public static double displayAveragePrice(List<Produktt> produkttList) {
        double averagePrice = produkttList.stream()
                .mapToDouble(Produktt::getCena)
                .average()
                .orElse(0);
        return averagePrice;

    }
}


