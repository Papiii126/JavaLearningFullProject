package org.rozdzial1.zajecia3;

import java.util.Random;
import java.util.Scanner;

public class Lekcja8 {
    public static void main(String[] args) {
        int i = 0;
        int los;
        int odp;

        Random rnd = new Random();
        los = rnd.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgadnij liczbę od 1 do 10!");
        do {
            i++;
           System.out.print("Podaj liczbę: ");
           odp = scanner.nextInt() ;
           if (odp < los) {
                System.out.println("Moja liczba jest większa");
            }
           else if (odp > los) {
               System.out.println("Moja liczba jest mniejsza");
           }
        } while(odp != los);
        System.out.println("Brawo! Zgadłeś za: " + i + " razem ");



    }
}
