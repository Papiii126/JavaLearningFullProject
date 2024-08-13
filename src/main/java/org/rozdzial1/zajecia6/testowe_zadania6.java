package org.rozdzial1.zajecia6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testowe_zadania6 {
    public static void main(String[] args) throws IOException {

        FileWriter zapis = new FileWriter("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6 + nauka");
        zapis.write("Cześć! Jak się miewasz?\n");
        zapis.write("Bardzo dobrze mordeczko!\n");
        zapis.write("superancko!");
        zapis.close();

        FileReader fr = new FileReader("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6 + nauka");
        BufferedReader br = new BufferedReader(fr);
        String tekst = br.readLine();
        System.out.println(tekst);

        String linia ;
        while ((linia = br.readLine()) != null) {
            System.out.println(linia);
        }



    }
}
