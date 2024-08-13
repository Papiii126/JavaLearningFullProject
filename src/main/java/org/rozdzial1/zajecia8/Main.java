package org.rozdzial1.zajecia8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        int[] tab1 = {1, 5, 6, 10, 12, 28, 46, 87};
        double[] tab2 = {1, 3, 15, 22, 28, 45, 85};
        int[] tab3 = {11, 14, 79, 104, 125, 180};
        int[] tab6 = {3, 9, 11, 12, 45, 69, 78, 445};

        String[] tab4 = new String[5];
        tab4[0] = "sieremaranoro";
        tab4[1] = "hej";
        tab4[2] = "elo";
        tab4[3] = "yo";
        tab4[4] = "siemaneczko";
        displayArray(tab1);
        sumFromArray(tab1);
        displayArrayFromTabDouble(tab2);
        displayArray2(tab3);
        displayArray3(tab4);
        displayArray4(tab4);
        displayArray5(tab6);
        double[] tab7 = {25, 28, 36, 42, 56, 88, 12};
        //displayArray6(tab7);
        int[] tab8 = new int[5];
        // displayArray7(tab8);
        displayArray8(tab1);
    }

    /*
    ********* PRACA DOMOWA ***********
    1) // metoda ktora przyjmuje jako parametr tablice i ja wypisuje petla for each :)
    */
    public static void displayArray(int[] tab1) {
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }

    }


    /*
    2) // Napisz metode która za swoj parametr przyjmuje tablice intów a nastepnie
    // zwraca sume wszystkich liczb które sa umieszczone w tej tablicy.
     */
    private static void sumFromArray(int[] tab1) {
        int suma = 0;
        for (int i = 0; i < tab1.length; i++) {
            suma += tab1[i];
        }
        System.out.println(suma);
    }

    /*
    3) // Napisz metode ktora za swoj parametr przyjmuje tablice doubli, a nastepnie wypisuje wszystkie liczby wieksze od 5.
    */
    public static void displayArrayFromTabDouble(double[] tab2) {
        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] > 5) {
                System.out.println(tab2[i]);
            }
        }
    }

    /*
    4)  // Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
    // wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7
    */
    public static void displayArray2(int[] tab3) {
        for (int i = 0; i < tab3.length; i++) {
            if (((tab3[i] % 2) == 0) && (tab3[i] > 7)) {
                System.out.println(tab3[i]);
            }
        }
    }

    /*
   5) // Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie zwraca sume dlugosci tych stringów
   zwraca sume dlugosci tych stringów
   */
    public static void displayArray3(String[] tab4) {
        int suma = 0;
        for (int i = 0; i < tab4.length; i++) {
            suma += tab4[i].length();
        }
        System.out.println(suma);
    }

    /*
  6) // Napisz metode która za swoj parametr przyjmuje tablice stringow, a nastepnie
  // wypisuje najdluzszy ze stringów
  */
    public static void displayArray4(String[] tab4) {
        for (int i = 0; i < tab4.length; i++) {
            String longest = tab4[0];
            if (tab4[i].length() > longest.length()) {
                longest = tab4[i];
            }
            System.out.println(longest);
        }
    }

    /*
//     7) Napisz metode która jako parametr przyjmuje tablice intów, a nastepnie zwraca
//     * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
//     * 3 dla liczb parzystych odejmuje od nich 1
//     *
//     * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrócic tablice
//     * {1,6,3,8}

*/
    public static void displayArray5(int[] tab6) {
        for (int i = 0; i < tab6.length; i++) {
            if (tab6[i] % 2 != 0) {
                System.out.println(tab6[i] += 3);
            } else {
                System.out.println(tab6[i] -= 1);
            }
        }
    }

    /*
         8)
         * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
         * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
         * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
         * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
         */
    public static void displayArray8(int[] tab1) { // fix to return array[]
        for (int i = 0; i < tab1.length; i++) {
            if (tab1[i] % 3 == 0) {
                System.out.println(-1);
            } else if (tab1[i] % 3 != 0) {
                System.out.println(Math.pow(tab1[i], 2));
            }
        }
    }


    /*
    9)   // napisz metode ktora przyjmuje jako parametr tablice Stringów i wypisuje te
   // ktore maja przynajmniej 2 literki a.
*/
    public static void displayArray6(String[] tab4) { // Patryk, Wawa, Lukasz
        int licznik;
        for (int i = 0; i < tab4.length; i++) {
            licznik = 0;
            for (int j = 0; j < tab4[i].length(); j++) {
                if (tab4[i].charAt(j) == 'a') {
                    licznik++;
                }
            }
        }
    }

    /*
        10)  // Napisz metode ktora przyjmuje jako parametr tablicę doubli i liczy srednia jej elementów.
        */
    public static void displayArray6(double[] tab7) {
        double suma = 0;
        for (int i = 0; i < tab7.length; i++) {
            suma += tab7[i];
        }
        System.out.println("Średnia wartości tablicy wynosi: " + suma / tab7.length);
    }


    /*

       11)  //Napisz metode ktora wypełnia tablice dlugosci 5 losowymi wartosciami z przedziału 1-9 i    //wypisuje jej elementy w kolejnosci rosnacej
       */
    public static void displayArray7(int[] tab8) {
        Random rnd = new Random();
        for (int i = 0; i < tab8.length; i++) {
            tab8[i] = rnd.nextInt(9) + 1;
            System.out.println(tab8[i]);
        }
    }
}



