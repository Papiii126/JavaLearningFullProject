package rozdzial2.test.zadanie3;

import rozdzial2.test.zadanie1.Figura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // Zadanie 3: (2ptk)
//Wczytaj liste figur z pliku, wypisz ponownie wszystkie figury powinno byc:

        String sciezka = "C:\\Users\\biuro\\Desktop\\Git-Repozytorium\\JavaLearning\\src\\main\\java\\rozdzial2\\test\\zadanie2\\figury.txt";
        FileReader fr = new FileReader("C:\\Users\\biuro\\Desktop\\Git-Repozytorium\\JavaLearning\\src\\main\\java\\rozdzial2\\test\\zadanie2\\figury.txt");
        BufferedReader br = new BufferedReader(fr);
        String linia;
        while ((linia = br.readLine()) != null) {
            System.out.println(linia);
        }
        List<Figura> figury = wczytajZPliku(sciezka);
        for (Figura f : figury) {
            System.out.println(f);
// }
//System.out powinien wypisac:
//Figura nr 1: Kwadrat o boku 10.
//Figura nr 2: Koło o promienu 10.
//Figura nr 3: Prostokat o bokach 10x20.
//Figura nr 4: Kwadrat o boku 15.
        }
    }

    public static List<Figura> wczytajZPliku(String sciezka) {
        List<Figura> figury = new ArrayList<>();
        return figury;
    }

}
