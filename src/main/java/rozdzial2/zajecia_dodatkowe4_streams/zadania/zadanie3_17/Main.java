package rozdzial2.zajecia_dodatkowe4_streams.zadania.zadanie3_17;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Product p1 = Product.builder()
                .nazwa("telefon")
                .cena(100)
                .build();

        Product p2 = Product.builder()
                .nazwa("aparat")
                .cena(75)
                .build();

        Product p3 = Product.builder()
                .nazwa("telewizor")
                .cena(200)
                .build();

        Product p4 = Product.builder()
                .nazwa("chipsy")
                .cena(49)
                .build();

        List<Product> productList = List.of(p1, p2, p3, p4);

//        Ćwiczenie 3
//        Opis: Znajdź pierwszy produkt, który kosztuje więcej niż 50 dolarów.
        System.out.println("Zadanie 3:");
        Product first = findFirst(productList);
        System.out.println(first);

//        Ćwiczenie 17
//        Opis: Utwórz listę produktów posortowaną według ceny malejąco. //TODO poprawic
        System.out.println("Zadanie 17:");
        System.out.println(sortedByLowerPrice(productList));


    }

    private static Product findFirst(List<Product> productList) {
        return productList.stream()
                .filter(product -> product.getCena() >= 50)
                .findFirst().get();
    }
    private static List<Product> sortedByLowerPrice (List<Product> productList){
        List<Product> sortedProducts = productList.stream()
                .sorted(Comparator.comparing(Product::getCena).reversed())
                .collect(Collectors.toList());
        return sortedProducts;

    }
}
