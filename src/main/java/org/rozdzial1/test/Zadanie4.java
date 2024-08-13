package org.rozdzial1.test;

public class Zadanie4 {
    public static void main(String[] args) {
        /*
        napisz metode ktora narysuje klepsydre.
        public void narysujKlepsydre(int wys) gdzie wys to bedzie wysokosc klepsydry
        np: wys = 11. *uwaga: dla parzystej wysokosci nie da sie narysowac klepdyry
         */

//            *****
//             ***
//              *
//             ***
//            *****
        int wys = 5;
        int polowa = wys / 2;


        for (int i = 0; i < polowa + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < wys - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = polowa - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < wys - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
















    

