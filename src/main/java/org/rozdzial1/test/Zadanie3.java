package org.rozdzial1.test;

public class Zadanie3 {
    public static void main(String[] args) {
           /*
        Stwórz dwie tablice liczb calkowitych (ile elementów chcesz i jak chcesz)
        a następnie wypisz wszystkie liczby które występują w obu tablicach.
        np: {1,2,3,4} , {1,4,5,6} powinno wypisać {1,4}
         */

        int[] tablica1 = {1, 2, 3, 4};
        int[] tablica2 = {1, 4, 5, 6};
        for (int i = 0; i < tablica1.length; i++) {
            for (int j = 0; j < tablica2.length; j++) {
                if (tablica1[i] == tablica2[j]){
                    System.out.println(tablica1[i] + " ");
                }
            }
        }


    }
}



