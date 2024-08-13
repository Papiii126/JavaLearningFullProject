package org.rozdzial1.zajecia5_Scanner;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        /*
         * 2) Napisz program, kt�ra za pomoc� Scannera wczyta 3 Stringi i sprawdzi, kt�ry jest
         * najd�u�szy
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwsze słowo: ");
        String pierwsze_slowo = scanner.next();
        System.out.print("Podaj drugie słowo: ");
        String drugie_slowo = scanner.next();
        System.out.print("Podaj trzecie słowo: ");
        String trzecie_slowo = scanner.next();

        if (pierwsze_slowo.length() > drugie_slowo.length() && pierwsze_slowo.length() > trzecie_slowo.length()) {
            System.out.println("Najdłuższe słowo to: " + pierwsze_slowo);
        } else if (drugie_slowo.length() > pierwsze_slowo.length() && drugie_slowo.length() > trzecie_slowo.length()) {
            System.out.println("Najdłuższe słowo to: " + drugie_slowo);
        } else {
            System.out.println("Najdłuższe słowo to: " + trzecie_slowo);
        }


    }
}
