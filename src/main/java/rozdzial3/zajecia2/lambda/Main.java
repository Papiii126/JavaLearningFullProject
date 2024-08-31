package rozdzial3.zajecia2.lambda;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(noNeg(Arrays.asList(1, 2, 3, -40)));

        List<Integer> lista5 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(doubling(lista5));

        System.out.println(lista5);

        List<String> lista = new ArrayList<>(Arrays.asList("Ania", "Tomek", "Kasia", "Hania", "Grzes"));
        System.out.println(noZ(lista));

        List<Integer> lista1 = new ArrayList<>(Arrays.asList(5, 1, 4, 10, -5));
        System.out.println(sortLiczby(lista1));

        List<String> lista2 = new ArrayList<>(Arrays.asList("Ania", "Magdalena", "Jan", "Haneczka", "Grzes"));
        System.out.println(sortRev(lista2));

        List<Double> lista3 = new ArrayList<>(Arrays.asList(9.0, 4.0, 25.0));
        System.out.println(pierwiastki(lista3));

        List<Integer> lista4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        wyswietl(lista4);
        System.out.println();

        Map<String, Integer> a = new LinkedHashMap<>();
        a.put("jeden", 1);
        a.put("dwa", 2);
        a.put("trzy", 3);
        a.put("cztery", 4);

        zmienMape(a, "dwa");
        System.out.println(a);

        zmienMape2(a, "piec");
        System.out.println(a);

        String imie = "a,b,c";
        List<String> listaStringow = stworzListe(imie);
        System.out.println(listaStringow);

    }

    // napisz metode która kaazda liczbbe z listy zastpeuje liczba 2* wieksza
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    // napisz metode która kazda liczbe mnozy przez sama siebie
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    // napisz metode która do kazdego stringa z listy dodaje * na koncu
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    // napisz metode która wyfiltruje nam z listy intów wszystkie te które sa
    // mniejsze od 0
    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    // napisz metode która wyfiltruje nam z listy intów wszystkie te które koncza
    // sie na liczbe podana jako parametr metody
    public List<Integer> no9(List<Integer> nums, int a) {
        nums.removeIf(n -> n % 10 == a);
        return nums;
    }

    // napisz metode ktora kazdego danego stringa z listy zastapi go potrojonym
    // stringiem, np
    // hello -> hellohellohello
    public List<String> copies3(List<String> strings, int x) {
        strings.replaceAll(n -> n.repeat(x));
        return strings;
    }

    // napisz metode która dla kazdego stringa dodaje y na poczatku i na koncu
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

    // napisz metode ktora wszystkie elementy z listy zastepuje malymi literami
    public List<String> lower(List<String> strings) {
        strings.replaceAll(String::toLowerCase);
        return strings;
    }

    // napisz metode ktora dla kazdego stringa usuwa z niego wszystkie literki a
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replace("x", ""));
        return strings;
    }

    // napisz metode która wyrzuci z listy intow elementy ktore sa z przedzialu od a
    // do b (a i b to parametry metody)

    public List<Integer> noTeen(List<Integer> nums, int a, int b) {
        nums.removeIf(n -> n >= a && n <= b);
        return nums;
    }

    // napisz metode ktora z listy stringów wyswietli tylko te które posiadaja a
    public static List<String> noZ(List<String> strings) {
        strings.removeIf(n -> !n.contains("a"));
        return strings;
    }

    // napisz metode która sortuje liczby rosnaco z uzyciem metody list.sort()
    public static List<Integer> sortLiczby(List<Integer> nums) {
        nums.sort(Comparator.comparingInt(a -> a));
        return nums;
    }

    // napisz metode która sortuje liste odwrotnie po dlugosci z uzyciem metody
    // list.sort()
    public static List<String> sortRev(List<String> strings) {
        strings.sort((a, b) -> b.length() - a.length());
        return strings;
    }

    // napisz metode która dla podanej listy doubli zwraca liste zawierajaca
    // pierwiastki liczby z pierwotnej listy
    public static List<Double> pierwiastki(List<Double> nums) {
        nums.replaceAll(Math::sqrt);
        return nums;
    }

    // napisz metode ktora wyswietli cała liste bez uzywania petli oraz bez [,]
    public static void wyswietl(List<Integer> nums) {
        nums.forEach(text -> System.out.print(text + " "));
    }

    // napisz metode która dla podanego klucza zwieksza jego wartosc o 100 jesli
    // klucz istnieje
    public static void zmienMape(Map<String, Integer> mapa, String key) {
        mapa.computeIfPresent(key, (k, v) -> v + 10);
    }

    // napisz metode ktora dla podanego klucza ustawia wartosc 5000 jesli klucz nie
    // istnieje
    public static void zmienMape2(Map<String, Integer> mapa, String key) {
        mapa.computeIfAbsent(key, v -> 5000);
    }

    // napisz metode ktora podwaja stringa, uzyj metody transform z klasy String
    public static String podwoj(String imie) {
        return imie.transform(n -> n + n);
    }

    // napisz metode która ze stringa w ktorym wyrazy sa rozdzielone przecinkiem
    // tworzy liste tych wyrazow
    public static List<String> stworzListe(String string) {
        return string.transform(n -> Arrays.asList(n.split(",")));
    }

}



