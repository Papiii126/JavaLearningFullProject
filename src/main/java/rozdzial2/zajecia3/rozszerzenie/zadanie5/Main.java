package rozdzial2.zajecia3.rozszerzenie.zadanie5;

import rozdzial2.zajecia3.rozszerzenie.zadanie5.czwarte.Dyrektor;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie.Kon;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie.Kot;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.drugie.Pies;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.piate.Komputer;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.piate.Laptop;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.piate.Tablet;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.piate.Telefon;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.pierwsze.Kobieta;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.pierwsze.Mezczyzna;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad.Kierowca;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.przyklad.Osoba;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie.Figura;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie.Kolo;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie.Prostokat;
import rozdzial2.zajecia3.rozszerzenie.zadanie5.trzecie.Trojkat;

public class Main {
    public static void main(String[] args) {


        //  Kierowca(imie, nazwisko, adres, email, kategoriaPrawaJazdy)
        //	 -> Kierownik( imie,  nazwisko,  adres,  email,  adresBiura)
        //   -> Marketingowiec( imie,  nazwisko,  adres,  email,  numerTel)

        // dziedziczenie Stworzyc klase Osoba, pokazac w niej metody dalej stworzyc klase kierowca Kierowca(imie, nazwisko, adres, email, kategoriaPrawaJazdy)

        Kierowca k1 = new Kierowca("Adam", "Nowak", "Wwa", "aa@wp.pl", "B");
        System.out.println(k1);

        System.out.println(k1.getImie());

        System.out.println(k1.obliczPensje());

        System.out.println(Osoba.getListaOsob());

        // stworzyc klase kierownik, marketingowiec ktore dziezdzicza po klasie osoba
        //	 -> Kierownik( imie,  nazwisko,  adres,  email,  adresBiura)
        //   -> Marketingowiec( imie,  nazwisko,  adres,  email,  numerTel)

//        Czasami w zadanich nie jest bezpośrednio napisane, żeby stworzyć nadklasę, np Osoba. Trzeba się
//        samemu tego domyślić.

//        1) Stwórz klasy mężczyzna i kobieta. Mężczyzna posiada imię, nazwisko, wiek, adres zamieszkania
//        oraz rok odbycia służby wojskowej. Kobieta ma imię, nazwisko, wiek, adres zamieszkania oraz
//        nazwisko panieńskie. Wykorzystaj dziedziczenie.
        Kobieta kobieta1 = new Kobieta("Alicja", "Burda", "Kochanowskiego", 26, "Tomala");
        Mezczyzna mezczyzna1 = new Mezczyzna("Tomasz", "Niecik", "Lipiskiego", 28, 2018);
        System.out.println(kobieta1.toString());
        System.out.println(mezczyzna1.toString());
//        2) Stwórz klasy kilku zwierząt. Wymyśl pewne atrybuty, które się powtarzają oraz kilka unikalnych. W
//        nad klasie stwórz metodę wydajOdgłos, która w podklasach ma wyświetlać głos danego zwierzęcia
//                (każde zwierze ma inny głos).
        Pies pies1 = new Pies("Azor", "biały", 15, 75, "krótka");
        Kot kot1 = new Kot("Burek", "szary", 5, 50, "dacowiec");
        Kon kon1 = new Kon("Galopek", "brazowy", 105, 245, "złota");

        System.out.println(pies1.toString());
        pies1.dajGlos();
        System.out.println(kot1.toString());
        kot1.dajGlos();
        System.out.println(kon1.toString());
        kon1.dajGlos();

//        3) Stwórz klasę Figura, po tej klasie dziedziczy koło prostokąt, trójkąt i kwadrat. Stwórz metody do
//            wyliczenia obwodów i pól figur.
        Figura kolo = new Kolo(5);
        Figura prostokat = new Prostokat(10, 5);
        Figura trojkat = new Trojkat(5, 10, 15);
        Figura kwadrat = new Kolo.Kwadrat(15);

        System.out.println("Obwód koła: " + kolo.obwod());
        System.out.println("Pole koła: " + kolo.pole());

        System.out.println("Obwód prostokąta: " + prostokat.obwod());
        System.out.println("Pole prostokąta: " + prostokat.pole());

        System.out.println("Obwód trójkąta: " + trojkat.obwod());
        System.out.println("Pole trójkąta: " + trojkat.pole());

        System.out.println("Obwód kwadratu: " + kwadrat.obwod());
        System.out.println("Pole kwadratu: " + kwadrat.pole());

//        4) Stwórz system zarządzania uczniami i nauczycielami w szkole. Stwórz klasy szkoła, uczeń,
//          nauczyciel, dyrektor. wymysl atrybuty i metody dla każdej z klas. Wyświetl w klasie main obiekty tych
//          klas. Wykorzystaj dziedziczenie.
        Dyrektor.tDyrektor dyrektor1 = new Dyrektor.tDyrektor("Adam", "Puchar", 40, "20 lat");
//        Szkola.Szkola szkola1 = new Szkola.Szkola("SP 50 w Lublinie", dyrektor1, "Jan Paweł II");
//        OsobaSzkola.Nauczyciel nauczyciel1 = new OsobaSzkola.Nauczyciel("Iwona", "Wasik", 48, "historia");
//        OsobaSzkola.Nauczyciel nauczyciel2 = new OsobaSzkola.Nauczyciel("Mirosław", "Suwała", 55, "wf");
//        Nauczyciel.Uczen uczen1 = new Nauczyciel.Uczen("Adrian", "Galant", 16, "8B");
//        Nauczyciel.Uczen uczen2 = new Nauczyciel.Uczen("Tomasz", "Pawlik", 17, "9C");
//
//        szkola1.dodajNauczyciela(nauczyciel1);
//        szkola1.dodajNauczyciela(nauczyciel2);
//        szkola1.dodajUcznia(uczen1);
//        szkola1.dodajUcznia(uczen2);
//
//        szkola1.wyswietlNauczycieli();
//        szkola1.wyswietlUczniow();

//        5) Stwórz klasy telefon, komputer i tablet. Każda z tych klas ma atrybuty cena, nazwa, firma. Wymyśl
//        unikalne dla tych klas. Stwórz dodatkową klasę laptop, która dziedziczy po komputerze, ale ma swoje
//        unikalne atrybuty jak pojemność baterii oraz przekątna ekranu
        Telefon telefon1 = new Telefon("Iphone", "Apple", 4499, "czarny");
        Komputer komputer1 = new Komputer("Vostro", "Dell", 3999, 64);
        Tablet tablet1 = new Tablet("Ipad", "Apple", 5999, 2024);
        Laptop laptop1 = new Laptop("Macbook", "Apple", 8999, 64, 94500, 28);
        telefon1.wyswietlDane();
        komputer1.wyswietlDane();
        tablet1.wyswietlDane();
        laptop1.wyswietlDane();
        telefon1.setCena(2899);
        System.out.println("Nowa cena: " + telefon1.getCena());
    }
}