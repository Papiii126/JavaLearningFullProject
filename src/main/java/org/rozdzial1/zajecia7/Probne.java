package org.rozdzial1.zajecia7;

public class Probne {
    public static void main(String[] args) {
        System.out.println(isParzysta(4));
        displayName("Tomasz");
        addDzienDobry("Olo");
        System.out.println(returnSum(5, 10));
        displayStringLength("rower");
        System.out.println(returnLongerString("rower", "piłka"));
        returnBigger(6, 6);
        System.out.println(count(2,2,3));
        System.out.println(stringEqualsString("elo", "elo"));
        countA("Warszawa", 'a');
        System.out.println(returnPow(3,2));
    }

    private static void displayName(String x) {
        System.out.println(x);
    }

    //stworzmy metoda która jako parametr przyjmuje inta i zwraca true jeżeli liczba jest parzysta
    public static boolean isParzysta(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Napisz metodę, która dodaje do Stringa podanego jako parametr napis "dzien dobry"
    public static void addDzienDobry(String x) {
        System.out.println(x + " " + "dzien dobry");
    }

    //Stwórz metode ktora tylko wyswietla sumę dwóch liczb które są podane jako parametr
    public static int returnSum(int x, int y) {
        return x + y;
    }

    //Stwórz metode która tylko wyświetli długość Stringa podanego jako parametr

    public static void displayStringLength(String slowo) {
        System.out.println(slowo.length());
    }

    // Stworz metodę która zwraca dłuższy z dwóch podanych jako parametr Stringów
    public static String returnLongerString(String slowo1, String slowo2) {
        if (slowo1.length() > slowo2.length()) {
            return slowo1;
        } else if (slowo1.length() == slowo2.length()) {
            return "Podano słowa tej samej długości";
        } else {
            return slowo2;
        }
    }

    // Stwórdz metodę ktora zwraca większą z dwóch podanych liczb typu double jako parametr
    public static void returnBigger(double x, double y) {
        if (x > y) {
            System.out.println(x);;
        } else if (y > x) {
            System.out.println(y);;
        } else {
            System.out.println("Podano te same liczby");
        }
    }
    // Napisz metode która jako argument (parametr) przyjmuje 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia
    public static int count(int x, int y, int z){
        return (x + y) * z;
    }

    // Napisz metode ktora sprawdza czy podane dwa Stringi sa takie same.

    public static boolean stringEqualsString(String x, String y){
        if (x.length() == y.length()){
            return true;
        }
        return false;
    }

    //Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu. np dla danych 'a', "Warszawa" wynik to 3
    public static void countA(String słowo, char litera){
        int licz = 0;
        for (int i = 0; i < słowo.length(); i++) {
            if (słowo.charAt(i) == litera) {
                licz++;
            }
        }
        System.out.println("Litera: " + litera + " występuje w słowie " + słowo + " " + licz + " razy");
        }
    //Napisz metode ktora jako argument przyjmuje dwie liczby i liczy ich potegi dla argumentow 3^4 ma obliczyc 3*3*3*3 = 81
    public static double returnPow(int x, int y){
        return Math.pow(x, y);
    }




    }





