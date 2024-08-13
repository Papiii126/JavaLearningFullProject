package rozdzial2.zajecia2;

import java.util.*;

public class Moje {
    public static void main(String[] args) {
        // Napisz program, który losuje liczby w dużym lotku bez powtórzeń.
        Random rnd = new Random();
        Set<Integer> liczby = new HashSet<>();
        while (liczby.size() < 6) {
            int liczba = rnd.nextInt(50) + 1;
            liczby.add(liczba);
        }
        System.out.println(liczby);

        //Stwórz program, który sprawdzi, czy dwa podane zbiory mają jakiekolwiek wspólne elementy.
        Set<Integer> h1 = new HashSet<>();
        h1.addAll(Set.of(2, 4, 8, 10, 12, 24, 66, 82));
        Set<Integer> h2 = new HashSet<>();
        h2.addAll(Set.of(2, 4, 18, 55, 45, 65));

        System.out.println(toCompare(h1, h2));

        //Dodaj do mapy 4 slowa jako wartosci, niech kluczem bedzie dlugosc kazdego ze słow

        Map<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(1, "żyrafa");
        hashMap1.put(2, "pająk");
        hashMap1.put(3, "pies");
        hashMap1.put(4, "kot");

        System.out.println(keyEqualsWordLength(hashMap1));

    }

    public static Set<Integer> toCompare(Set<Integer> h1, Set<Integer> h2) {
        Set<Integer> wspoleElementy = new HashSet<>();
        for (int liczba : h1) {
            if (h2.contains(liczba)) {
                wspoleElementy.add(liczba);
            }
        }
        return wspoleElementy;

    }

    public static Map<Integer, String> keyEqualsWordLength(Map<Integer, String> hashMap1){
        Map<Integer, String> mapa = new HashMap<>();
        for (int key : hashMap1.keySet()) {
            String word = hashMap1.get(key);
            int wordLength = word.length();
            mapa.put(wordLength, word);
        }
        return mapa;
    }

    }

