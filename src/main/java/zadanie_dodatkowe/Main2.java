package zadanie_dodatkowe;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(12);
        integerList.add(5);
        integerList.add(82);
        integerList.add(65);
        integerList.add(55);
        integerList.add(5555);

        Iterator<Integer> integerListIterator = integerList.iterator();
        while (integerListIterator.hasNext()) {
            System.out.println(integerListIterator.next());
        }

        System.out.println(integerList.get(5));

        Set<String> StringHashSet = new HashSet<>();
        StringHashSet.add("Kowal");
        StringHashSet.add("Dunaj");
        StringHashSet.add("Kowal");
        StringHashSet.add("Kowal");
        StringHashSet.add("Kowal");

//        Iterator<String> StringHashSetNazwsika = StringHashSet.iterator();
//        while (StringHashSetNazwsika.hasNext()) {
//            System.out.println(StringHashSetNazwsika.next());

        for (String nazwisko : StringHashSet){
            System.out.println(nazwisko);
        }

    }
}

