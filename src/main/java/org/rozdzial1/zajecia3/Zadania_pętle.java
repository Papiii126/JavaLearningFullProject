package org.rozdzial1.zajecia3;


public class Zadania_pętle {
    public static void main(String[] args) {
//        // Zadanie 1
//        int i = 0;
//        while (i < 10) {
//            i++;
//            System.out.println("Siema");
//        }
//        for (int s = 10; s < 20; s++) {
//            System.out.println("Elo");
//        }
//        System.out.println("Elo");
//
//        // Zadanie 2
//        int j = 5;
//        for (; j < 10; j++) {
//            System.out.println(j);
//        }
//        System.out.println(j);
//
//        // Zadanie 3
//        int k = 15;
//        System.out.println(k);
//        while (k > 5) {
//            k--;
//            System.out.println(k);
//        }
//
//        // Zadanie 4
//
//        for (int z = 1 ; z < 10 ; z++) {
//            if (z > 5) {
//                System.out.println(z + "Duża wartość");
//
//            } else {
//                System.out.println(z);
//            }
//
//        }
//
//        // Zadanie 5
//        for (int x = -40; x < 20; x++) {
//            if (x % 2 != 0) {
//                System.out.println(x);
//
//            }
//        }


//         Zadanie 6
        int i, j;
        boolean pierwsza;

        for (i = 2; i <= 1000; i++) {
            pierwsza = true;

            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) pierwsza = false;
            if (pierwsza)
                System.out.println(i + " jest liczbą pierwszą.");
        }
        // zadanie 7
        int f = 5;
        int e = 10;
        int suma = 0;
        for (int k = f; f <= e; f++) {
            suma += f;
        }
        System.out.println(suma);


    }
}
