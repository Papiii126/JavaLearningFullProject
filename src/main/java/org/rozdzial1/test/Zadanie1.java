package org.rozdzial1.test;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
            /*
        Za pomoca scannera zapytaj uzytkownika o 10 imion
    Następnie
    - znajdz najdluzsze oraz najkrotsze imie
    - wypisz ilosc imion zenskich (to takie które się kończą na literke "a")
    - jaki % calości stanowią imiona żeńskie
         */
        Scanner scanner = new Scanner(System.in);
        int licznik;
        System.out.println("Podaj 10 imion: ");
        String[] imiona = new String[10];
        for (int i = 0; i < imiona.length; i++) {
            imiona[i] = scanner.nextLine();
        }
        String najdłuższe = imiona[0];
        String najkrótsze = imiona[0];
        licznik = 0;
        for (int i = 0; i < imiona.length; i++) {
            if (imiona[i].length() > najdłuższe.length()) {
                najdłuższe = imiona[i];
            }
            if (imiona[i].length() < najkrótsze.length()) {
                najkrótsze = imiona[i];
            }
            if (imiona[i].endsWith("a")) {
                licznik++;
                System.out.println("Imie żeńskie: " + imiona[i]);
            }
        }
        double iloczyn = ((double)licznik / imiona.length) * 100;
        System.out.println("Najdłuższe imie to: " + najdłuższe);
        System.out.println("Najkrótsze imie to: " + najkrótsze);
        System.out.println("% imion żeńskich: " + iloczyn);
    }
}











