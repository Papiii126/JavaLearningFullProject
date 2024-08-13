package rozdzial2.zajecia1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Moje {
    public static void main(String[] args) {

        List<String> nameList = List.of("Tomek", "Matylda,", "Oskarek", "Robert", "Kasia");
        System.out.println(displayLongestName(nameList));

        System.out.println(returnTrueIfContains(nameList, "Oskar"));

        List<Double> listaDouble = new ArrayList<>();
        listaDouble.addAll(Arrays.asList(2.5, 22.1, 4.2, 35.8, 5.5, 40.5));
        Collections.sort(listaDouble);
        System.out.println(listaDouble);

        //List<Double> doubleList = List.of(2.5, 22.1, 35.8, 40.5)); -> altenratywny zapis

    }


    //5) Napisz metode do zadania 4, która zwroci najdluzsze imie
    public static String displayLongestName(List<String> stringList) {
        String longestName = "";
        for (String imie : stringList) {
            if (imie.length() > longestName.length()) {
                longestName = imie;
            }
        }
        return "Najdłuższe imie to: " + longestName;
    }

    //Napisz metode do zadani 4 która zwraca true jesli podane imie (jako parametr) znajduje sie w kolekcji
    public static boolean returnTrueIfContains(List<String> stringList, String imie) {
        if (stringList.contains(imie)) {
            return true;
        }
        return false;
    }

    //// 7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej
}



