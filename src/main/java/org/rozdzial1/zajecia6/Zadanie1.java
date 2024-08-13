package org.rozdzial1.zajecia6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez uzytkownika. Nastepnie odczytajmy te imiona i
//wyświetlmy najdłuższe z nich
public class Zadanie1 {
    public static void main(String[] args) throws IOException {

        FileWriter zapis = new FileWriter("src\\main\\java\\org\\zajecia6\\Zadanie1.java + zadanie pierwsze");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsze imię: ");
        String odp = scanner.nextLine();
        System.out.println("Podaj drugie imię: ");
        String odp2 = scanner.nextLine();
        System.out.println("Podaj trzecie imie: ");
        String odp3 = scanner.nextLine();
        zapis.write(odp + "\n");
        zapis.write(odp2 + "\n");
        zapis.write(odp3);
        zapis.close();

        FileReader fr = new FileReader("src\\main\\java\\org\\zajecia6\\Zadanie1.java + zadanie pierwsze");
        BufferedReader br = new BufferedReader(fr);
        String tekst = br.readLine();
        System.out.println(tekst);
        String linia;
        while ((linia = br.readLine()) != null) {
            System.out.println(linia);
        }
        if (odp.length() > odp2.length() && odp.length() > odp3.length()) {
            System.out.println("Najdłuższe imie to: " + odp);
        } else if (odp2.length() > odp.length() && odp2.length() > odp3.length()) {
            System.out.println("Najdłuższe imie to: " + odp2);
        } else if (odp3.length() > odp.length() && odp3.length() > odp2.length()) {
            System.out.println("Najdłuższe imie to: " + odp3);
        } else if (odp.length() == odp2.length() && odp.length() == odp3.length()) {
            System.out.println("Podano wszystkie takie samej długości imiona! ");
        }else {
            System.out.println("nie ma najdluzszego imienia");
        }
    }
}


