package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        /*
         * zadanie 4) Wczytaj scannerem kilka String�w,
         *  przypisz je do wczesniej utworzonej zmiennej typu String,
         *  wyswietl j� na konsoli
         */
        Scanner scanner = new Scanner(System.in);
        String słowo = "kwiatek";
        String[] słowa = new String[5];
        System.out.println("Wprowadź słowa:");
        for (int i = 0; i < słowa.length; i++) {
            słowa[i] = scanner.nextLine();
        }
        for (int i = 0; i < słowa.length; i++) {
            System.out.println(słowa[i] + " + " + słowo);
        }

    }
}

