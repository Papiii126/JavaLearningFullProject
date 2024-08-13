package org.rozdzial1.zajecia3;

public class Lekcja9 {

    public static void main(String[] args) {
      String[] tablica = new String[20]; // deklarowanie tablicy
      tablica[0] = "Ania";
      tablica[1] = "Tomek";
      tablica[2] = "Rysio";
      System.out.println(tablica.length); // wyliczy długość czyli 20, bo taka była deklaracja
      for(int x = 0; x < tablica.length; x++) { // tutaj wyliczamy poszczególne wartości tablicy aby się wystwielily
          System.out.println(tablica[x]); // zmienna 'x' pozwoli wyświetlić nasze dane, puste będą "null"
      }
        int[] tab = {2, 5, 18, 22, 24}; // metoda alternatywna dla powyżej
      System.out.println(tab.length);
      System.out.println(tab[0]);
      for(int y = 0; y < 5; y++) {
          System.out.println(tab[y]);
      }
    }
}


