package rozdzial2.zajecia1;

import java.util.*;

public class zadania_zajecia1 {
    public static void main(String[] args) {
        //1) Zadeklaruj ArrayListe intów, dodaj do niej 5 róznych licz metoda add, wyswietl cala liste petla for each.
        List<Integer> lista_liczb = new ArrayList<>();
//        lista_liczb.add(10);
//        lista_liczb.add(20);
//        lista_liczb.add(30);
//        lista_liczb.add(40);
//        lista_liczb.add(50);
//        System.out.println("Lista liczb: ");
        lista_liczb.addAll(Arrays.asList(2, 10, 20, 30, 40, 50));
        for (Integer liczby : lista_liczb) {
            System.out.println(liczby);

            List<String> nameList = new ArrayList<>();
            nameList.addAll(Arrays.asList("Tomek", "Matylda,", "Robert", "Kasia"));

            System.out.println(displayLongestName(nameList));

        }

// 2) Stwórz metode która zwróci sume liczb z ArrayListy z 1 zadania
//        System.out.println("Suma liczb: " + sumaLiczb(lista_liczb));
        System.out.println(returnSum(lista_liczb));


//    }
// 3) Stwórz metode która wyswietli z listy z 1 zadania liczby wieksze od 3
//        System.out.println("Liczby większe od 3: ");
//        int wynik = displayBiggerThan3(lista_liczb);
//        for (int liczba : lista_liczb) {
//            System.out.println(liczba);
//        }
//    }
        returnBiggerThan3(lista_liczb);
// 4) Zadeklaruj Liste Stringów, dodaj do niej kolekcje 4 imion metoda addAll
//        List<String> listaImion = new ArrayList<>();
//        listaImion.addAll(Arrays.asList("Wojciech", "Stanisław", "Adrian", "Olek"));
//        System.out.println(listaImion.toString());
// 5) Napisz metode do zadania 4, która zwroci najdluzsze imie
        // System.out.println("Najdłuższe imię to: " + displayLongestName(listaImion));
// 6) Napisz metode do zadani 4 która zwraca true jesli podane imie (jako parametr) znajduje sie w kolekcji
        //System.out.println("Czy podane imię znajduje się w kolekcji: " + ifContains(listaImion, "Olek"));

        //// 7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej
        List<Double> listaDouble = new ArrayList<>();
        listaDouble.addAll(Arrays.asList(3.5, 2.2, 1.7, 8.7, 7.7));
        Collections.sort(listaDouble);
        System.out.println(listaDouble);
    }

    public static int sumaLiczb(List<Integer> lista_liczb) {
        int suma = 0;
        for (int liczba : lista_liczb) {
            suma += liczba;
        }
        return suma;
    }


    public static List<Integer> displayBiggerThan3(List<Integer> lista_liczb) { // 0 ,5 , 10
        List<Integer> wynik = new ArrayList<>();
        for (int liczba : lista_liczb) {
            if (liczba > 3) {
                wynik.add(liczba);
            }
        }
        return wynik;

    }

//    public static String displayLongestName(List<String> listaImion) {
//        String longestName = "";
//        for (String imie : listaImion) {
//            if (imie.length() > longestName.length())
//                longestName = imie;
//        }
//        return longestName;
//    }

    public static boolean ifContains(List<String> listaImion, String imie) {
        if (listaImion.contains(imie)) {
            return true;
        }
        return false;
    }

    public static int returnSum(List<Integer> lista_Liczb) {
        int suma = 0;
        for (int liczba : lista_Liczb) {
            suma += liczba;
        }
        return suma;
    }

    //  3) Stwórz metode która wyswietli z listy z 1 zadania liczby wieksze od 3
    public static void returnBiggerThan3(List<Integer> integerList) {
        for (int liczba : integerList) {
            if (liczba > 3) {
                System.out.println("Displayed bigger than 3 " + liczba);
            }
        }
    }

    // 4) Zadeklaruj Liste Stringów, dodaj do niej kolekcje 4 imion metoda addAll
    //5) Napisz metode do zadania 4, która zwroci najdluzsze imie
    public static String displayLongestName(List<String> stringList) {
        String longestName = "";
        for (String imie : stringList) {
            if (longestName.length() > imie.length()) {
                longestName = imie;
            }
        }
        return longestName;
    }
}



































































