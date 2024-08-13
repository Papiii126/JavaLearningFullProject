package org.rozdzial1.zajecia8;

import java.util.Arrays;
import java.util.Random;

public class PracaDomowa {
    public static void main(String[] args) {

        int[] liczby = {2, 8, 10, 14, 17, 18, 20};
        returnNumbers(liczby);
        returnSumFromArray(liczby);

        double[] tab1 = {4, 100, 500, 600, 8000, 15000};
        returnBiggerThan5(tab1);

        returnCountableBy2AndBiggerThan7(liczby);

        String[] słowa = new String[5];
        słowa[0] = "Ala";
        słowa[1] = "Ola";
        słowa[2] = "Tolek";
        słowa[3] = "Arkadiusz";
        słowa[4] = "Sebastian";

        returnSumFromString(słowa);
        displayTheLongestString(słowa);
        returnArray(liczby);
        System.out.println(Arrays.toString(returnIntArray(liczby)));
        returnA(słowa);

        double[] tab2 = {4, 100, 500, 600, 8000, 15000};
        returnAverageofArray(tab2);

        int[] tablica = new int[10];
        returnRandomArrayValue(Arrays.stream(tablica).toArray());


    }

    //1. metoda ktora przyjmuje jako parametr tablice i ja wypisuje petla for each :)
    public static void returnNumbers(int[] liczby) {
        for (int liczba : liczby) {
            System.out.println(liczba);
        }
    }

    // 2. Napisz metode która za swoj parametr przyjmuje tablice intów a 
    // nastepnie zwraca sume wszystkich liczb które sa umieszczone w tej tablicy.
    public static void returnSumFromArray(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        System.out.println(suma);
    }

    // 3.  Napisz metode ktora za swoj parametr przyjmuje tablice doubli,
    // a nastepnie wypisuje wszystkie liczby wieksze od 5/
    public static void returnBiggerThan5(double[] tab1) {
        for (double liczba : tab1) {
            if (liczba > 5) {
                System.out.println(liczba);
            }
        }
    }
    // 4. Napisz metode ktora za swoj parametr przyjmuje tablice intow,
    // a nastepnie wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7

    public static void returnCountableBy2AndBiggerThan7(int[] liczby) {
        for (int liczba : liczby) {
            if (liczba % 2 == 0 && liczba > 7) {
                System.out.println(liczba);
            }
        }
    }

    // 5. Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie zwraca sume dlugosci tych stringów
    public static void returnSumFromString(String[] słowa) {
        int suma = 0;
        for (String słowo : słowa) {
            suma += słowo.length();
        }
        System.out.println(suma);
    }

    //6. Napisz metode która za swoj parametr przyjmuje tablice stringow, a nastepnie
    // wypisuje najdluzszy ze stringów
    public static void displayTheLongestString(String[] słowa) {
        String longest = słowa[0];
        for (String najdluzszy : słowa) {
            if (najdluzszy.length() > longest.length()) {
                longest = najdluzszy;
            }
        }
        System.out.println(longest);
    }

    //     7) Napisz metode która jako parametr przyjmuje tablice intów, a nastepnie zwraca
//     * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
//     * 3 dla liczb parzystych odejmuje od nich 1
//     * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrócic tablice
//     * {1,6,3,8}
    public static void returnArray(int[] liczby) {
        for (int liczba : liczby) {
            if (liczba % 2 != 0) {
                System.out.println(liczba + 3);
            } else {
                System.out.println(liczba - 1);
            }
        }
    }


//     //8.  Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
//         * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
//         * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
//         * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
//

    public static int[] returnIntArray(int[] liczby) {
        int[] modifiedArray = new int[liczby.length];
        for (int i = 0; i < liczby.length; i++) {
            if (liczby[i] % 3 == 0) {
                modifiedArray[i] = -1;
            } else {
                modifiedArray[i] = (int) Math.pow(liczby[i], 2);
            }
        }
        return modifiedArray;
    }


    // 9. napisz metode ktora przyjmuje jako parametr tablice Stringów i wypisuje te
    // ktore maja przynajmniej 2 literki a.

    public static void returnA(String[] słowa) {

        for (int i = 0; i < słowa.length; i++) {
            int licznik = 0;
            for (int j = 0; j < słowa[i].length(); j++) {
                if (słowa[i].charAt(j) == ('A') || słowa[i].charAt(j) == ('a')) {
                    licznik++;
                }
            }
            if (licznik >= 2) {
                System.out.println(słowa[i]);
            }

        }
    }


    // 10. Napisz metode ktora przyjmuje jako parametr tablicę doubli i liczy srednia jej elementów.
    public static void returnAverageofArray(double[] tab2) {
        double suma = 0;
        for (int i = 0; i < tab2.length; i++) {
            suma += tab2[i];
        }
        System.out.println(suma / tab2.length);
    }


// 11. Napisz metode ktora wypełnia tablice dlugosci 5 losowymi wartosciami z przedziału 1-9 i    //wypisuje jej elementy w kolejnosci rosnacej
    public static void returnRandomArrayValue(int[] tablica){
        Random rnd = new Random();
        for (int liczba : tablica){
            tablica[liczba] = rnd.nextInt(9) + 1;
            System.out.println(tablica[liczba]);
        }
    }


}

