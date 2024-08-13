package org.rozdzial1.zajecia6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // ZAPIS I ODCZYT  Z PLIKU
        //   zmienna char
        char znak = 'k';
        System.out.println(znak); // wypisze "k"
        System.out.println(znak + 0); // wypisze 107 czyli numer znaku wedlug ASCII TABLE https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

        //      FileWriter zapis = new FileWriter("plik-nowy");
//        zapisujac jak wyzej plik nie zapisze nam sie w katalogu ktory utworzylismy

		FileWriter zapis = new FileWriter("src/main/java/org/zajecia6" + "plik-nowy");

        zapis.write("czesc Łukasz to ja Konrad?\n");
        zapis.write("Czesc dobrze");
        zapis.close();

//       //FileReader pozwala nam na dostep znak po znaku
        FileReader fr = new FileReader("src/main/java/org/zajecia6/zajecia6plik-nowy");

        //BufferedReader pozwala nam na dostep linijka po linijce
        BufferedReader br = new BufferedReader(fr);

        String tekst = br.readLine();
        System.out.println(tekst);

        String linia;

        while ((linia = br.readLine()) != null) {
            System.out.println("odczytana linia : " + linia);
        }


        //Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez uzytkownika. Nastepnie odczytajmy te imiona i
        //wyświetlmy najdłuższe z nich


//      Zapisz do pliku 5 liczb, odczytaj je z pliku i podaj ich sumę.


        // Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
        // kurde, kurcze i kurka.
        // Program ma za zadanie kazdy wyraz brzydki(kurde,kurcze i kurka) zastapic **** i zapisac
        // całosc do nowego pliku ktory sie nazywa
        // slownikPoprawiony

        // wypisanie calego pliku tekstowego
    }
}
