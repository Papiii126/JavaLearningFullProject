package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        /*
         *  1) Wczytaj za pomocą scannera 2 liczby i wczytaj rodzaj dzialania 'dodawanie', 'odejmowanie', 'mnożenie', 'dzielenie'
         *  Wyświetl wynik na konsoli. sprobuj uzyc switch case
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę: ");
        int liczba_pierwsza = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int liczba_druga = scanner.nextInt();
        System.out.print("Podaj rodzaj działania: +, -, /, *: ");
        char znak = scanner.next().charAt(0);
        int suma = liczba_pierwsza + liczba_druga;
        int różnica = liczba_pierwsza - liczba_druga;
        int iloczyn = liczba_pierwsza * liczba_druga;
        int iloraz = liczba_pierwsza / liczba_druga;
        switch (znak) {
            case '+':
                System.out.println("Wynik sumy liczb wynosi: " + suma);
                break;
            case '-':
                System.out.println("Wynik różnicy liczb wynosi: " + różnica);
                break;
            case '*':
                System.out.println("Wynik iloczynu liczb wynosi: " + iloczyn);
                break;
            case '/':
                System.out.println("Wynik ilorazu liczb wynosi: " + iloraz);
                break;
            default:
                System.out.println("Podaj poprawny rodzaj działania: +, -, /, *: ");

        }
    }
}
