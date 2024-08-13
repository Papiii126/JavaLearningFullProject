package org.rozdzial1.zajecia3;

public class Lekcja7 {
    public static void main(String[] args) {
         int i = 5; // wyswietli poniewaz 5>0 a nastepne beda pomniejszane
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println(i);

        int j = -5; // tutaj warunek nie spełnia więc wyświetli int j i dekrementowaną -6 !
        do {
            System.out.println(j);
            j--; }
         while (j > 0);
        System.out.println(j);

        for(int k = 5; k > 0; k--) {
            System.out.println(k);
        }
        int l = 5; //zamiennik dla pętli for powyżej, zeby wyswietlilo 0
        for(; l > 0; l--) {
        System.out.println(l);}

        System.out.println(l);



    }
}
