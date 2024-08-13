package rozdzial2.zajecia2;

import java.util.*;
import java.util.stream.Collectors;

public class Zadania {
    public static void main(String[] args) {
        // Napisz program, który losuje liczby w dużym lotku bez powtórzeń.
        Random rnd = new Random();
        Set<Integer> hashMap = new HashSet<>();
        while (hashMap.size() < 6) {
            int liczba = rnd.nextInt(49) + 1;
            hashMap.add(liczba);
        }
        System.out.println(hashMap);
        //Napisz program, który przyjmuje tablicę liczb całkowitych i zwraca zbiór zawierający tylko unikalne elementy tej tablicy.
        int[] liczby = {1, 2, 3, 3, 4, 5, 6, 6, 7, 7, 8, 9, 10};
        Set<Integer> unikalneWartości = findUnique(liczby);
        System.out.println(unikalneWartości);
        //Stwórz program, który sprawdzi, czy dwa podane zbiory mają jakiekolwiek wspólne elementy.
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.addAll(Arrays.asList(1, 3, 5, 6, 7, 8, 9));
        set2.addAll(Arrays.asList(2, 4, 5, 6, 7, 11, 9));
        System.out.println("Czy podane zbiory zawierają wspólne elementy? " + toCompare(set1, set2));
        //Dodaj do mapy 4 slowa jako wartosci, niech kluczem bedzie dlugosc kazdego ze słow
        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "żyrafa");
        hashMap1.put(2, "pająk");
        hashMap1.put(3, "pies");
        hashMap1.put(4, "kot");
        System.out.println(keyEqualsWordLength(hashMap1));
        //Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejen liczby naturalne zaczynajac od 0
        Map<Integer, String> hashMap2 = keyEqualsNaturalNumbers();
        System.out.println(hashMap2);
        //Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma wyswietlic ile razy jaki element byl dodany
        //pies kot pies pies kot szczur pies - 3, szczur - 1, kot - 2
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "pies");
        mapa.put(2, "kot");
        mapa.put(3, "pies");
        mapa.put(4, "pies");
        mapa.put(5, "kot");
        mapa.put(6, "szczur");
        mapa.put(7, "pies");
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String value : mapa.values()) {
            wordCounts = addMap(wordCounts, value);
        }
        System.out.println(wordCounts);
        }
    



    // zadanie 2
    public static Set<Integer> findUnique(int[] liczby) {
        Set<Integer> set = Arrays.stream(liczby).boxed().collect(Collectors.toSet());
        return set;
    }

    // zadanie 3
    public static Set<Integer> toCompare(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> elementy = new HashSet<>();
        for (int liczba : set1) {
            if (set2.contains(liczba)) {
                elementy.add(liczba);
            }
        }
        return elementy;
    }

    // zadanie 4
    public static Map<Integer, String> keyEqualsWordLength(Map<Integer, String> hashMap1) {
        Map<Integer, String> newMap = new HashMap<>();
        for (int key : hashMap1.keySet()) {
            String word = hashMap1.get(key);
            int wordLength = word.length();
            newMap.put(wordLength, word);
        }
        return newMap;
    }

    // zadanie 5
    public static Map<Integer, String> keyEqualsNaturalNumbers() {
        Map<Integer, String> map = new HashMap<>();
        int count = 0;
        String[] words = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć"};
        for (String word : words) {
            map.put(count++, word);
        }
        return map;
    }
    // zadanie 6
    public static Map<String, Integer> addMap(Map<String, Integer> mapa, String wyraz) {
        Integer ilosc = mapa.getOrDefault(wyraz, 0);
        mapa.put(wyraz, ilosc + 1);
        return mapa;
    }
}















