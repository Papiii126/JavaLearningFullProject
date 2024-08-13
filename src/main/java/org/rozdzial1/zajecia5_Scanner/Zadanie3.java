package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        	/*
		 zadanie 3) Wczytaj scannerem n liczb, przypisz je do tablicy, policz sume element�w tablicy
		 Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce wprowadzic. Nastepnie wprowadza
	 	  	tyle liczb ile podac. Chcemy policzyc ich sume, element najmniejsz, najwiekszy oraz srednia arytmetyczna.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę cyfr: ");
        int n = scanner.nextInt();
        int[] tablica = new int[n];
        System.out.print("Podaj: " + n + " liczb: ");
        for (int i = 0; i < n; i++) {
            tablica[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int t = 0; t < n; t++) {
            suma = tablica[t] + suma;
        }
        int min = tablica[0];
        int max = tablica[0];

        for (int j = 1; j < n; j++) {
            if (tablica[j] < min) {
                min = tablica[j];
            }
            if (tablica[j] > max) {
                max = tablica[j];
            }
        }
        int srednia = (suma / n);
        System.out.println("Suma podanych liczb wynosi: " + suma);
        System.out.println("Wartość max wynosi: " + max);
        System.out.println("Wartosć min wynosi: " + min);
        System.out.println("Średnia wynosi: " + srednia);


    }
}

















