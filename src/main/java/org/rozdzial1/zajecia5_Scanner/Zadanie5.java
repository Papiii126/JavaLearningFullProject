package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        //U�ytkownik wprowadza has�o tak d�ugo a� nie poda poprawnego.
        //Jesli has�o jest z�e wypisujemy komunikat i prosimy o ponowne podanie has�a
        //gdy has�o jets dobre wypisujemy komunikat i ko�czymy dzia�anie programu
        // TIP -> użyć pętli while

        Scanner scanner = new Scanner(System.in);
        System.out.print("Witaj! Podaj hasło: ");
        String haslo = "matut";
        String odp = scanner.next();
        while (!odp.equals(haslo)) {
            System.out.println("Podano błędne hasło! ");
            System.out.println("Podaj poprawne hasło: ");
            odp = scanner.next();
        }
        System.out.println("Podano prawidłowe hasło!");

    }
}






