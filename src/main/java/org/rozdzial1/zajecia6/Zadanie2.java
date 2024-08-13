package org.rozdzial1.zajecia6;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

//Zapisz do pliku 5 liczb, odczytaj je z pliku i podaj ich sumę.
public class Zadanie2 {
    public static void main(String[] args) throws IOException {

        FileWriter zapis = new FileWriter("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie2.java + zadanie drugie");
        Random rnd = new Random();
        System.out.println("Proponuje 5 poniższych liczb: ");
        int liczba = rnd.nextInt(10000);
        System.out.println(liczba);
        int liczba1 = rnd.nextInt(10000);
        System.out.println(liczba1);
        int liczba2 = rnd.nextInt(10000);
        System.out.println(liczba2);
        int liczba3 = rnd.nextInt(10000);
        System.out.println(liczba3);
        int liczba4 = rnd.nextInt(10000);
        int suma = liczba + liczba1 + liczba2 + liczba3 + liczba4;
        System.out.println(liczba4);
        zapis.write(liczba + "\n");
        zapis.write(liczba1 + "\n");
        zapis.write(liczba2 + "\n");
        zapis.write(liczba3 + "\n");
        zapis.write(liczba4 + "\n");
        zapis.write("Suma zaproponowanych liczb: " + suma + "\n");
        zapis.close();

        FileReader fr = new FileReader("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie2.java + zadanie drugie");
        BufferedReader br = new BufferedReader(fr);
        String linia;
        while ((linia = br.readLine()) != null) {
            System.out.println(linia);
        }


    }
}
