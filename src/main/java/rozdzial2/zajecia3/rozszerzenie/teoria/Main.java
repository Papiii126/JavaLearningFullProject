package rozdzial2.zajecia3.rozszerzenie.teoria;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Stworz klase uczen (id, imie,nazwisko) w nej metody
        // -> wyswietl wszystkch utworzonych uczniow
        List<Uczen> listaUczniow = new ArrayList<>();
        Uczen uczen1 = new Uczen("Bartek", "Topa");
        Uczen uczen2 = new Uczen("Tomek", "Lopa");
        Uczen uczen3 = new Uczen("Ania", "Tom");
        listaUczniow.add(uczen1);
        listaUczniow.add(uczen2);
        listaUczniow.add(uczen3);







        // Stworz klase klasa (nazwa)
        Klasa klasa1 = new Klasa("1B");
        Klasa klasa2 = new Klasa("1C");
        // Pokazac polaczenie miedzy klasa a uczniem, uczen chodzi do jednej klasy, w klasie jest wiele uczniow
        // stowrzyc metody takie jak
        // klasia -> dodaj ucznia do klasy, wyswietl wszystkuch uczniow klasy
        klasa1.dodajUczeniaDoKlasy(uczen1);
        klasa1.dodajUczeniaDoKlasy(uczen2);
        klasa1.displayStudents();


//        Stworz klase szkola (nazwa, adres) i dodaj do niej zaleznosci
        // uczen chodzi do szkoly, szkola ma wielu uczniow
        Szkola szkola1 = new Szkola("Piątka", "Kochanowkiego");
        Szkola szkola2 = new Szkola("Siódemka", "Brzechwy");
        Szkola szkola3 = new Szkola("Dwójka", "Leopolda");
        szkola1.dodajUczeniaDoSzkoly(uczen1);
        szkola1.dodajUczeniaDoSzkoly(uczen2);



        // Stworz klase sala ktora ma nazwe numer oraz szkole
        // zrob relacje szkola - sala, metode utworzSale(nazwa, numer, szkola)
        //metoda wyswietl wszystkie sale
        Sala sala1 = new Sala("i", 15, szkola1);
        Sala sala2 = new Sala("f", 16, szkola1);
        Sala sala3 = new Sala("g", 17, szkola1);
        szkola1.dodajSaleDoSzkoly(sala1);
        szkola1.dodajSaleDoSzkoly(sala2);
        szkola1.displaySale();
    }
}








