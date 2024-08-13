package rozdzial2.zajecia2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {

        //mapy przechowuja elementy jako klucz-wartosc

        //HashMap
        //pozwala na przechowywanie jednego klucza o wartosci null, nie gwarantuje zachowania kolejnosci

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "jeden");
        hashMap.put(3, "trzy");
        hashMap.put(2, "dwa");
        hashMap.put(4, "cztery");
        hashMap.put(1, "cztery");


        System.out.println(hashMap);

        //metoda get() ktora zwraca nam wartosc dla podanego klucza
        System.out.println(hashMap.get(4));


        //values() - zwraca set zlozony z wartosci z mapy
        System.out.println(hashMap.values());

        //keySet() - zwraca set zlozony z kluczy z mapy
        System.out.println("----");
        System.out.println(hashMap.keySet());

        //containsKey() ktora zwraca true jesli podany klucz jest w mapie
        System.out.println(hashMap.containsKey(5));

        //rozmiar mapy
        System.out.println(hashMap.size());

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //zachowuje kolejnsoc zgodna z kolejnoscia dodawania
        linkedHashMap.put(1, "jeden");
        linkedHashMap.put(3, "trzy");
        linkedHashMap.put(2, "dwa");
        linkedHashMap.put(4, "cztery");

        System.out.println(linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();

        //sortuje elementy wzgledem klucza, nie pozwala na nulla jako klucz
        treeMap.put(1, "jeden");
        treeMap.put(3, "trzy");
        treeMap.put(2, "dwa");
        treeMap.put(4, "cztery");

        System.out.println(treeMap);


    }
}
