package org.rozdzial1.test;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {





        /*
        Zapytaj uzytkownika o liczby rozdzielone znakiem spacji np:
        podaj liczby:
        ->10 20 30 40
        na tej podstawie znajdujemy:
        - min, max, sume, srednie arytmetyczna, ilosc liczb pierwszych
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość liczb: ");
        int n = scanner.nextInt();
        System.out.println("Podaj " + n + " liczb oddzielonych znakiem spacji: ");
        int[] liczby = new int[n];
        int suma = 0;
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = scanner.nextInt();
            suma += liczby[i];
        }
        int max = liczby[0];
        int min = liczby[0];
        int liczPierwsza = 0;
        for (int i = 1; i < n; i++) {
            if (liczby[i] < min) {
                min = liczby[i];
            }
            if (liczby[i] > max) {
                max = liczby[i];
                if (czyPierwsza(liczby[i])) {
                    liczPierwsza++;
                }
            }
        }


        double srednia = (double) suma / n;
        System.out.println("Minimalna wartość wynosi: " + min);
        System.out.println("Maksymalna wartość wynosi: " + max);
        System.out.println("Średnia podanych liczb wynosi: " + srednia);
        System.out.println("Ilość liczb pierwszych wynosi: " + liczPierwsza);
    }

    public static boolean czyPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(liczba); j++) {
            if (liczba % j == 0) {
                return false;
            }
        }
        return true;
    }
}




















