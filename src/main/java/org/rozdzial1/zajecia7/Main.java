package org.rozdzial1.zajecia7;

import javax.management.loading.MLet;

public class Main {
    public static void main(String[] args) {
        String słowo = "witam";
        displayAndAddString(słowo);
        System.out.println(displayAndAdd(słowo));
        suma(5, 6);
        System.out.println(suma_liczb(5, 6));
        String nazwa = "butelka";
        dlugosc(nazwa);
        String słowo_1 = "orangutan";
        String słowo_2 = "wieloryb";
        dluzsze_slowo(słowo_1, słowo_2);
        System.out.println(wordLength(słowo_1, słowo_2));
        double p = 1768.5;
        double g = 1569.8;
        biggerFigure(p, g);
        System.out.println(bigger_figure(p, g));
        SumaLiczb(5, 6, 2);
        System.out.println(SumaLiczb2(5, 6, 2));
        czyPatrzysta(55);
        System.out.println(czyParzysta2(55));
        String pierwszy = "ręka";
        String drugi = "ręka";
        compare(pierwszy, drugi);
        System.out.println(compare2(pierwszy, drugi));
        String miasto = "Lublin";
        char znak = 'u';
        int razy = 0;
        liczbaZnaków(miasto, znak, razy);
        System.out.println("Znak" + " " + znak + " " + "występuje w słowie" + " " + miasto + " " + liczbaZnaków2(miasto, znak, razy) + " razy");
        // dzielniki(16);
        ktoraWieksza(20);
        liczPotegi(3, 2);
        System.out.println(licz_potegi(3, 2));
        //dzielniki(16);
        suma_cyfr_liczby(256);
        System.out.println(sumaCyfrLiczby(256));
        czyJestKwadratem(16);
//        noLenghtString("pisak");
    }


    // Napisz metodę, która dodaje do Stringa podanego jako parametr napis "dzien dobry"

    public static void displayAndAddString(String słowo) {
        System.out.println(słowo + "dzień dobry");
    }

    public static String displayAndAdd(String x) {
        return x + "dzień dobry";

    }


    // Stwórz metode ktora tylko wyswietla sumę dwóch liczb które są podane jako
    // parametr
    public static void suma(int x, int y) {
        System.out.println(x + y);
    }

    public static int suma_liczb(int x, int y) {
        return x + y;
    }

    // Stwórz metode która tylko wyświetli długość Stringa podanego jako parametr
    public static void dlugosc(String nazwa) {
        System.out.println(nazwa.length());
    }

    public static int dlugosc_slowa(String y) {
        return y.length();
    }

    // Stworz metodę która zwraca dłuższy z dwóch podanych jako parametr Stringów
    public static void dluzsze_slowo(String słowo_1, String słowo_2) {
        if (słowo_1.length() > słowo_2.length()) {
            System.out.println(słowo_1);
        } else if (słowo_2.length() > słowo_1.length()) {
            System.out.println(słowo_2);
        } else {
            System.out.println("Podano wyrazy o tej samej długości.");
        }
    }

    public static String wordLength(String słowo_1, String słowo_2) {
        if (słowo_1.length() > słowo_2.length()) {
            return słowo_1;
        } else if (słowo_2.length() > słowo_1.length()) {
            return słowo_2;
        } else {
            return "Podano wyrazy o tej samej dłogości.";
        }
    }


// Stwórdz metodę ktora zwraca większą z dwóch podanych liczb typu double jako
// parametr

    public static void biggerFigure(double p, double g) {
        if (p > g) {
            System.out.println(p);
        } else if (g > p) {
            System.out.println(g);
        } else {
            System.out.println("Podano te same liczby");
        }
    }

    public static Double bigger_figure(double p, double g) {
        if (p > g) {
            return p;
        } else if (g > p) {
            return g;
        } else {
            return p;
        }
    }


    // Napisz metode która jako argument (parametr) przyjmuje
// 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia

    public static void SumaLiczb(int x, int y, int t) {
        System.out.println((x + y) * t);
    }

    public static int SumaLiczb2(int x, int y, int t) {
        return ((x + y) * t);
    }


// Napisz metode która przyjmuje jako argument liczbe i sprawdza czy jest to
// liczba parzysta

    public static void czyPatrzysta(int t) {
        if (t % 2 == 0) {
            System.out.println(t + " " + "parzysta");
        } else {
            System.out.println(t + " " + "nieparzysta");
        }
    }

    public static String czyParzysta2(int t) {
        if (t % 2 == 0) {
            return t + " " + "parzysta";
        } else {
            return t + " " + "nieparzysta";
        }
    }


    // Napisz metode ktora sprawdza czy podane dwa Stringi sa takie same.
    public static void compare(String pierwszy, String drugi) {
        if (pierwszy.equals(drugi)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean compare2(String pierwszy, String drugi) {
        if (pierwszy.equals(drugi)) {
            return true;
        } else {
            return false;
        }
    }

    // Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu. np dla danych 'a', "Warszawa" wynik to 3
    public static void liczbaZnaków(String miasto, char znak, int razy) {
        for (int i = 0; i < miasto.length(); i++) {
            if (miasto.charAt(i) == znak) {
                razy++;
            }
        }
        System.out.println("Znak " + znak + " występuje w słowie " + miasto + " " + razy + " razy ");
    }


    public static int liczbaZnaków2(String miasto, char znak, int razy) {
        int razy2 = 0;
        for (int k = 0; k < miasto.length(); k++) {
            if (miasto.charAt(k) == znak) {
                razy2++;
            }
        }
        return razy2;
    }


    // napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre jednosci od cyfry dziesiatek
    public static void ktoraWieksza(double x) {
        if (x < 10 || x > 99) {
            System.out.println("Podana liczba nie jest dwucyfrowa");
        }
        double cyfraDziesiatek = x / 10;
        double cyfraJedności = x % 10;
        if (cyfraDziesiatek > cyfraJedności) {
            System.out.println("Cyfra dziesiątek wieksza od cyfry jedności");
        } else {
            System.out.println("Cyfra jedności większa od cyfry dziesiątek");
        }
    }


    // Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej. Czyli np
    //dla 3428 wynik 17
    public static void suma_cyfr_liczby(int x) {
        var value = 2568;
        int suma = 0;
        while (value > 0) {
            suma += value % 10;
            Math.floor(value / 10);
        }
        System.out.println(suma);
    }


    public static int sumaCyfrLiczby(int x) {
        var value = 2568;
        int suma = 0;
        while (value > 0) {
            suma += value % 10;
            Math.floor(value / 10);
        }
        return suma;
    }


    // Napisz metode która liczy długosc Stringa, nie uzywac metody lenght()
//    public static void noLenghtString(String j) {
//        var dlugosc = 0;
//        while (j[dlugosc] != 0) {
//            dlugosc++;
//        }
//        System.out.println(dlugosc);
//    }


    //Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi,
    //dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81

    public static void liczPotegi(double ff, double pp) {
        System.out.println(Math.pow(ff, pp));

    }

    public static double licz_potegi(double ff, double pp) {
        return Math.pow(ff, pp);
    }


// Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita
// jest kwadratem
// pewnej liczby całkowitej. Liczby będące kwadratami liczb całkowitych to 1, 4,
// 9, 16 itd.
// Wartością funkcji ma być prawda, jeśli liczba spełnia warunek oraz fałsz w
// przeciwnym
// wypadku.
// Math.sqrt(x) - pierwiastek z x

    public static void czyJestKwadratem(int l) {
        for (int g = 1; l > g; g++) {
            if (Math.sqrt(g) * Math.sqrt(g) == l) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }

    }


    // Wypisz dzielniki liczby naturalnej podanej jako parametr
// czyli np dla 16 powinno byc 1,2,4,8,16

    public static void dzielniki(int t) { // 5   1  i 5
        for (int i = 1; i <= t; i++) {
            if (t % i == 0) {
                System.out.println(i);
            }

        }
    }
}



















