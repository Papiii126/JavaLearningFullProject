package org.rozdzial1.zajecia6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Zadanie3 {
    public static void main(String[] args) throws IOException {
// Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
        // kurde, kurcze i kurka.
        // Program ma za zadanie kazdy wyraz brzydki(kurde,kurcze i kurka) zastapic **** i zapisac
        // całosc do nowego pliku ktory sie nazywa
        // slownikPoprawiony
        // wypisanie calego pliku tekstowego

        FileWriter zapis = new FileWriter("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie3.java + słownik");
        zapis.write("alfabet \n");
        zapis.write("balet\n");
        zapis.write("cerata\n");
        zapis.write("kurde\n");
        zapis.write("drabina\n");
        zapis.write("europa\n");
        zapis.write("kurcze\n");
        zapis.write("flet\n");
        zapis.write("zabawka\n");
        zapis.write("klocki\n");
        zapis.write("kurka\n");
        zapis.write("piramida\n");
        zapis.write("lina");
        zapis.close();
        FileReader fr = new FileReader("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie3.java + słownik");
        BufferedReader br = new BufferedReader(fr);
//        String linie;
////        while((linie = br.readLine()) != null) {
////            System.out.println(linie);
////        }


        FileWriter poprawiony = new FileWriter("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie3.java + słownik poprawiony");
        String linia;
        while ((linia = br.readLine()) != null) {
            String poprawiona_linia = linia.replaceAll("kurka|kurde|kurcze|/g", "****");
            poprawiony.write(poprawiona_linia + "\n");
        }
        poprawiony.close();

        FileReader frPop = new FileReader("C:\\Users\\biuro\\Desktop\\zadania\\Zadania_instrukcje_warunkowe\\src\\main\\java\\org\\zajecia6\\Zadanie3.java + słownik poprawiony");
        BufferedReader brPop = new BufferedReader(frPop);
        String linia2;
        while((linia2 = brPop.readLine()) != null) {
            System.out.println(linia2);

        }

    }}






