package org.rozdzial1.zajecia4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      /*  //typZmiennej[] nazwaTablicy = słowo kluczowe new typZmiennej [rozmiar];
        int[] tablicaLiczb = new int[5];

        //TABLICE INDEKSUJEMY OD 0
        tablicaLiczb[0] = 5;
        tablicaLiczb[1] = 4;
        tablicaLiczb[2] = 1;
        tablicaLiczb[3] = 8;
        tablicaLiczb[4] = 3;
        //tablicaLiczb[5] = 0; blad bo tablica nie ma 5 indeksu (ma rozmiar 5)

        tablicaLiczb[0] = 7;

        for (int x = 0; x < tablicaLiczb.length; x++) {
            System.out.print(tablicaLiczb[x] + " ");
        }
        System.out.println();

        int[] tablica = {5, 4, 2, 8, 0, 1, 7, 3};
        System.out.println(tablica.length);

        //Zadeklarował tablice Stringów na 2 sposoby, przypisał do nich jakies wartosci, wyswietlil 0 indeks a
        // potem wyswietlil cala tablice
        String[] miesiace = new String[5];
        miesiace[0] = "styczen";
        miesiace[1] = "luty";
        miesiace[2] = "marzec";
        miesiace[3] = "kwiecien";
        miesiace[4] = "maj";

        System.out.println(miesiace[0]);

        for (int x = 0; x < miesiace.length; x++) {
            if (x >= 3) {
                System.out.println(miesiace[x] + " idzie lato");
            } else {
                System.out.println(miesiace[x] + " ");
            }
        }

        */
        /*
        ************PRACA DOMOWA *******************************
        Zad 1Zadeklaruj tablice intów dlugosci 20, przypisz do niej liczby od 1 do 20. Wypisz tablice.
        ZAd 2 Zadeklaruj tablice intów dlugosci 100, wypelnij ja w petli liczbami od 0 do 99.
        //Wyswietl z niej tylko liczby wieksze niz 56.
        Zad 3 Zadeklaruj tablice stringów dlugosci 4, dodaj do niej 4 wyrazy.
         petli przypisz kazdy wyraz do wczesniej utworzonej zmiennej
        typu String. Wyswietl ta zmienna
        Zad 4
        * Zad 4
		Zadeklaruj dwie tablice intów róznej dlugosci.
		Przypisz obu na indeksie 0 jakas liczbe.
		Wyswietl ta tablice która jest dluzsza (oczywiscie zmiana dlugosci danej tablicy
		powinna wplywac na wypisanie tablic)
		Zad 5
		 Zadeklaruj tablice stringów dlugosci 4, dodaj do niej 4 wyrazy. W petli
        przypisz każdy wyraz
        do wcześniej utworzonej zmiennej typu string. Wyświetl tą zmienną
        Zad 6  policz sume tablicy
        Zad 7 policz sume elementow tablicy od pierwszego do indeksu wskazanego przez uzytkownika
        Zad 8 napisz prgrm ktory wypelnia tablice o wielkosci 100  liczbami parzystymi od 0 i liczy sume elementow tablicy
*/
//        // Zadanie 1
//        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        for (int x = 0; x < tab.length; x++) {
//            System.out.println(tab[x]);
//        }
//
//
//        // Zadanie 2
//
//        int[] tabl = new int[100];
//        for (int y = 0; y < tabl.length; y++) {
//            tabl[y] = y + 1;
//            if (y > 55) {
//                System.out.println(tabl[y]);
//            }
//        }


        // Zadanie 3
        String słowo = "chleb";
        String[] artykuł = new String[4];
        artykuł[0] = "mleko";
        artykuł[1] = "banan";
        artykuł[2] = "piwo";
        artykuł[3] = "kebab";
        for (int t = 0; t < artykuł.length; t++) {
            if (t >= 2) {
                System.out.println(artykuł[t] + " i " + słowo);
            } else {
                System.out.println(artykuł[t] + " ");
            }
        }

        // Zadanie 4

        int[] tab1 = {0, 0, 0, 0};
        int[] tab2 = {0, 0, 0};
        tab1[0] = 1;
        tab2[0] = 2;
        for (int x = 0; x < tab1.length; x++) {
            System.out.println(tab1[x]);
        }
        for (int y = 0; y < tab2.length; y++) {
            System.out.println(tab2[y]);
        }
        if (tab1.length > tab2.length) {
            System.out.println(Arrays.toString(tab1));
        } else {
            System.out.println(Arrays.toString(tab2));
        }


        // Zadanie 5

        String produkt = "orzeszki";
        String[] sklep = new String[4];
        sklep[0] = "baton";
        sklep[1] = "piwo";
        sklep[2] = "ananas";
        sklep[3] = "granat";
        for (int i = 0; i < sklep.length; i++) {
            System.out.println(sklep[i] + " i " + produkt);
        }

//        // Zadanie 6
//
//        int[] tab = {20, 30, 80, 100, 500};
//        int suma = 0;
//        for (int i = 0; i < tab.length; i++) {
//            suma = suma + tab[i];
//            System.out.println(suma);
//        }

        // Zadanie 7
        int suma2 = 0;
        int zadeklarowanePrzezUzytkownika = 3;
        int[] liczby = {10, 15, 22, 17, 25, 27, 29};
        for (int e = 1; e <= zadeklarowanePrzezUzytkownika; e++) {
            System.out.println(liczby[e]);
            suma2 += liczby[e];
        }
        System.out.println("Suma liczb: " + suma2);


        // Zadanie 8
        int[] tablica = new int[100];
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i + 2;
            suma += tablica[i];
            if (i % 2 == 0) {
                System.out.println(tablica[i]);
            }
        }
        System.out.println("suma liczb: " + suma);

    }};