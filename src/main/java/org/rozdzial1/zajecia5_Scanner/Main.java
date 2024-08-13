package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //SCANER

        //Słowo kluczowe Scanner nazwaSkanera = new Scanner();
        //System.in pozwala na wczytywanei z konsoli
        //Scanner wczytanie = new Scanner(System.in);

//		System.out.println("Podaj imię");
//		String imie = wczytanie.nextLine();
//
//		System.out.println(imie);
//		System.out.println(imie.length());
//
//		System.out.println("Podaj wiek");
//		int wiek = wczytanie.nextInt();
//
//		System.out.println(wiek);

//		System.out.println("Podaj liczbe");
//		double liczba = wczytanie.nextDouble();
//		wczytanie.nextLine();
//		System.out.println(liczba);

//		System.out.println("Podaj napis");
//		String tekst = wczytanie.nextLine();
//		System.out.println(tekst);
//
//		System.out.println("Podaj liczbe");
//		double liczba2 = wczytanie.nextDouble();
//		System.out.println(liczba2);

        //Stworz skaner, wprowadz dane imie, nazwisko, wiek i wyswietl je na konsoli

        Scanner wpisywanie = new Scanner(System.in);

//		System.out.println("Podaj imie");
////		String imie = wpisywanie.nextLine();
////		System.out.println("Podaj nazwisko");
////		String nazwisko = wpisywanie.nextLine();
////		System.out.println("Podaj wiek");
////		int wiek = wpisywanie.nextInt();
////		System.out.println("Imie: " + imie + " ,Nazwisko: " + nazwisko + " ,Wiek: "+ wiek);
////
////		char znak =  wpisywanie.next().charAt(0);
////		System.out.println(znak);

        // Wczytaj za pomocą scannera 2 liczby typu double i przeprowadż na nich symulacje kalkulatora z operatorami +,-,*,/.
        //Wyswietl wyniki na konsoli.

        System.out.println("Podaj pierwsza liczbe: ");
        double pierwszaLiczba = wpisywanie.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        double drugaLiczba = wpisywanie.nextDouble();
        System.out.println("Podaj rodzaj działania: + , - , * , / ");
        char znak = wpisywanie.next().charAt(0);

        double suma = pierwszaLiczba + drugaLiczba;
        double roznica = pierwszaLiczba - drugaLiczba;
        double iloraz = pierwszaLiczba / drugaLiczba;
        double iloczyn = pierwszaLiczba * drugaLiczba;

        if (znak == '+') {
            System.out.println("Suma liczb to: " + suma);
        } else if (znak == '-') {
            System.out.println("Różnica liczb to: " + roznica);
        } else if (znak == '*') {
            System.out.println("Iloczyn liczb to: " + iloczyn);
        } else if (znak == '/') {
            System.out.println("Iloraz liczb to: " + iloraz);
        } else {
            System.out.println("Źle podany znak");
        }

//		System.out.println("Wynik dodawania podanych liczb wynosi " + pierwszaLiczba + " + " + drugaLiczba + " = " + suma);
//		System.out.println("Wynik odejmowania podanych liczb wynosi " + pierwszaLiczba + " - " + drugaLiczba + " = " + roznica);
//		System.out.println("Wynik dzielenia podanych liczb wynosi " + pierwszaLiczba + " / " + drugaLiczba + " = " + iloraz);
//		System.out.println("Wynik mnozenia podanych liczb wynosi " + pierwszaLiczba + " * " + drugaLiczba + " = " + iloczyn);

        //rozszrzyc powyzsze pl.kurs.java.zadanie, o to ze uzytkownik podaje jeden ze znaków +,-,*,/


        // przyklad uczycia petli while

        Scanner wczytanie = new Scanner(System.in);
        System.out.print("podaj pierwsza liczbe: ");
        int a = wczytanie.nextInt();
        System.out.print("podaj druga liczbe: ");
        int b = wczytanie.nextInt();

        System.out.print("podaj dzialanie: (+,-,+,=) ");
        while (wczytanie.hasNext()) {
            char dzialanie = wczytanie.next().charAt(0);
            if (dzialanie == '*') {
                System.out.println("iloczyn wynosi " + (a * b));
                break;
            } else if (dzialanie == '+') {
                System.out.println("suma liczb wynosi" + (a + b));
                break;
            } else if (dzialanie == '-') {
                System.out.println("roznica liczb wynosi" + (a - b));
                break;
            } else if (dzialanie == '/') {
                System.out.println("iloraz liczb wynosi" + (a / b));
                break;
            } else {
                System.out.print("Błednie podane dzialanie! podaj dzialanie: (+,-,+,=)  jeszcze raz : ");
            }
        }
        wczytanie.close();

    }
}
