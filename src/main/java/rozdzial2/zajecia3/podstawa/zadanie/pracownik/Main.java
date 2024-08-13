package rozdzial2.zajecia3.podstawa.zadanie.pracownik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Zadanie stworz klase pracownik(imie, nazwisko, premia, stawka godzinowa)
    // -> w klasie stworzyc dwie metody -> miesiecznaPensja(iloscgodzin) , miesiecznaPensja(ilosc godzin, dodatek)
    // stworz liste pracownikow , dodaj do niej wczesniej utworzonych pracownikow, wyswiwtl w konsoli premie dla kazdego pracownika
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Andrzej", "Kowal", 0, 20);
        Pracownik pracownik2 = new Pracownik("Tomasz", "Nowak", 0, 20);
        Pracownik pracownik3 = new Pracownik("Halina", "Fronc", 0, 20);
        Pracownik pracownik4 = new Pracownik("Olek", "Kuc", 0, 20);

        ArrayList<Pracownik> listaPracowników = new ArrayList<>(List.of(pracownik1, pracownik2, pracownik3, pracownik4));

        pracownik1.setPremia(1500);
        int premia = pracownik1.getPremia();
        System.out.println(premia);
        pracownik2.setPremia(2000);
        int premia2 = pracownik2.getPremia();
        System.out.println(premia2);
        pracownik3.setPremia(4000);
        int premia3 = pracownik3.getPremia();
        System.out.println(premia3);
        pracownik4.setPremia(500);
        int premia4 = pracownik4.getPremia();
        System.out.println(premia4);
        double pensja = pracownik1.miesiecznaPensja(200);
        System.out.println("Miesięczna pensja " + pensja);
        double pensjaPlusDodatek = pracownik1.pensjaPlusDodatek(160, 220);
        System.out.println("Miesięczna pensja plus dodatek " + pensjaPlusDodatek);
        System.out.println(pracownik1.toString());
        System.out.println(pracownik2.toString());
        System.out.println(pracownik3.toString());
        System.out.println(pracownik4.toString());
//
    }
}

