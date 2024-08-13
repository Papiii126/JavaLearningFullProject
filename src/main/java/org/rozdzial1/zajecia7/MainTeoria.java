package org.rozdzial1.zajecia7;

public class MainTeoria {
    public static void main(String[] args) {

        wypisanie();
        System.out.println(imie());

        String imie2 = imie();
        System.out.println(imie2);

        int x = 5;
        boolean isParzysta = isParzysta(x);
//        System.out.println(isParzysta);

        isParzystaVoid(x);
    }

    //stworzmy metoda która jako parametr przyjmuje inta i zwraca true jeżeli liczba jest parzysta
    public static boolean isParzysta(int x){
        if (x % 2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void isParzystaVoid(int x){
        if (x % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    // metoda void nic nie zwraca
    public static void wypisanie() {
        for (int i = 0; i < 3; i++) {
            System.out.println("dzień dobry!");
        }
    }

    // metoda zwracajaca String
    public static String imie() {
        String imie = "Mateusz";
        return imie;
    }

    // public static <typ zwracany> <nazwa metody> (liste argumentow
//     { <cialo metody>
    // }

    public static boolean czyPodzielnaPrzezDwa(int liczba) {
        return liczba % 2 == 0;
    }
}
