package org.rozdzial1.example.zajecia1;

// Zadanie 1
public class zadania_instrukcje_warunkowe {
    public static void main(String[] args) {
        int liczba = -5;
        if (liczba > 1) {
            System.out.println("Dodatnia");
        } else if (liczba == 0) {
            System.out.println("Równa 0");
        } else if (liczba < 0) {
            System.out.println("Ujemna");
        }
        // Zadanie 2
        int ocena = 4;
        switch (ocena) {
            case 1:
                System.out.println("ocena niedostateczna");
                break;
            case 2:
                System.out.println("ocena dopuszczająca");
                break;
            case 3:
                System.out.println("ocena dostateczna");
                break;
            case 4:
                System.out.println("ocena dobra");
                break;
            case 5:
                System.out.println("ocena bardzo dobra");
                break;
            case 6:
                System.out.println("celująca");
                break;
            default:
                System.out.println("Nie ma takiej oceny w skali");
        }
        // Zadanie 3
        String miesiac = "maj";
        switch (miesiac) {
            case "styczeń":
                System.out.println("zimno");
                break;
            case "luty":
                System.out.println("walentynki");
                break;
            case "marzec":
                System.out.println("o tak o");
                break;
            case "kwiecień":
                System.out.println("klasa");
                break;
            case "maj":
                System.out.println("majówka");
                break;
            default:
                System.out.println("Proszę spojrzeć jakie są do wyboru");

        }
        // Zadanie 4
        int a = 10;
        int b = 20;
        boolean logiczna = (a == b);
        System.out.println(logiczna);

        // Zadanie 5
        double aa = 228.5;
        double bb = 144.5;
        double roznica = (aa - bb);
        double roznica2 = (bb - aa);
        System.out.println(roznica);
        System.out.println(roznica2);

        if (aa < bb) {
            System.out.println(aa + " mniejsza od " + bb + " o " + roznica);
        } else if (aa > bb) {
            System.out.println(aa + " większa od " + bb + " o " + roznica);
        }

        // Zadanie 6
        int xx = 11;
        int yy = 3;
        float reszta = (xx % yy);
        System.out.println(reszta);
        if (reszta == 0) {
            System.out.println("podzielna");
        } else if (reszta != 0) {
            System.out.println("nie podzielna");
        }
        // Zadanie 7
        int ola = 3;
        int mati = 4;
        int patryk = 6;
        if (ola < mati && ola < patryk) {
            System.out.println("Ola najmniejsza");
        } else if (mati < ola && mati < patryk) {
            System.out.println("Mati najmniejszy");
        } else {
            System.out.println("Patryk najmniejszy");
        }


        // Zadanie 8
        double pp = 5.0;
        double ll = 7.0;
        char zmChar = '+';
        switch (zmChar) {
            case '<':
                System.out.println(pp + " mniejsze od " + ll);
                break;
            case '+':
                System.out.println(pp + " dodać " + ll);
                break;
            case '-':
                System.out.println(pp + " odjąć " + ll);
                break;
            case '>':
                System.out.println(ll + " większe od " + pp);
                break;
        }

        // Zadanie 9
        double l = 1.5;
        double k = 4.5;
        double srednia = (l + k) / 2;
        System.out.println(srednia);
        boolean wartosc = (srednia > 4);
        System.out.println(wartosc);

        // Zadanie 10
        int p = 2;
        int t = 8;
        int h = 23;
        double suma = (p + t + h);
        System.out.println(suma);
        if ((suma % 3) == 0) {
            System.out.println("podzielna");
        } else {
            System.out.println("nie podzielna");
        }

        // Zdanie 11
        String słowo = "siemaneczko mordo";
        int liczbaZnaków = słowo.length();
        System.out.println("liczba znaków to: " + liczbaZnaków);
        if (liczbaZnaków > 5) {
            System.out.println("wieksza od 5");
        } else {
            System.out.println("mniejsza od 5");
        }


    }
}