package rozdzial2.zajecia11.ZadanieSklep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        // Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
        // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet
        // na liscie
        // - kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga
        // miec tylko kobiety, w przypadku pr�by dodania
        // powiazania mezyczyzna - sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()
        // - osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy
        // par homo, dodaj osobie plec
        // przy probie umowienia sie na randke pary homo rzuc wyjatkiem
        // NoHomoHereException()
        // - nasz system przechowuje tylko osoby pe�noletnie, zatem wiek > 18, pryz
        // pr�bie tworzenia osoby kt�ra ma mniej niz 18 lat
        // progarm powinien to naprawic, ustawiajac danej osobie 18 lat (uzyc wyjatki
        // IllegalArgumentException())

        //1. Kobiety chodza do sklepow, mezczyzni nie, zatem powiazania ze sklepem moga
        // miec tylko kobiety, w przypadku pr�by dodania
        // powiazania mezyczyzna - sklep rzuc wyjatkiem ShopsAreOnlyForWomenException()

        List<Kobieta> kobietaList = new ArrayList<>();
        Kobieta k1 = new Kobieta("Iwona", "Paczka", 50, "Warszawa", "kobieta");
        Kobieta k2 = new Kobieta("Katarzyna", "Olech", 50, "Warszawa", "kobieta");
        Kobieta k3 = new Kobieta("Natasza", "Szon", 25, "Lublin", "kobieta");

        kobietaList.addAll(Arrays.asList(k1, k2, k3));

        Sklep s1 = new Sklep("Zara", "Warszawa", k1);

        Mezczyzna m1 = new Mezczyzna("Tomasz", "Galant", 30, "Warszawa", "mężczyzna");
        System.out.println("Zadanie 1");

        try {
            s1.addOsobaToShop(k3);
            System.out.println("Dodano kobiete do sklepu.");
        } catch (ShopsAreOnlyForWomenException e) {
            System.out.println(e.getMessage());
        }

        try {
            s1.addOsobaToShop(m1);
            System.out.println("Nie można dodać mężczyzny do sklepu.");
        } catch (ShopsAreOnlyForWomenException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------");

        // 2. Stworz klase Osoba (imie, nazwisko, miasto, wiek) oraz Sklep (nazwa, miasto)
        // - metoda co zwraca najstarsza kobiete lub NoWomenException jesli brak kobiet
        // na liscie
        System.out.println("Zadanie 2");

        try {
            displayOldestWoman(kobietaList);
        } catch (IndexOutOfBoundsException e) {
            throw new Exception("nie ma kobiet");
            //TODO dodać exception !
        }
        System.out.println("------------");
        //3. Osoby moga sie umawiac na randki, ale jestesmy homofobami, nie akceptujemy
        // par homo, dodaj osobie plec
        // przy probie umowienia sie na randke pary homo rzuc wyjatkiem NoHomoHereException()
        System.out.println("Zadanie 3");

//        Osoba o1 = new Osoba("Tomasz", "Barek", 30, "Warszawa", "mężczyzna");
//        Osoba o2 = new Osoba("Alan", "Topa", 28, "Warszawa", "mężczyzna");
//        Osoba o3 = new Osoba("Anita", "Lopa", 28, "Warszawa", "kobieta");
//        //TODO PLEC MA BYC ENUMEM
//        Randka r1 = new Randka(o1, o2);
//
//
//            r1.addOsobatoRandka(o1, o2);
//
//        try {
//            r1.addOsobatoRandka(o2, o3);
//            System.out.println("Na randkę idzie: " + o2.getImie() + " i " + o3.getImie());
//        } catch (NoHomoHereException e) {
//            System.out.println(e.getMessage());
//        }
        System.out.println("------------");
        System.out.println("Zadanie 4");
        //4. Nasz system przechowuje tylko osoby pe�noletnie, zatem wiek > 18, pryz
        //// pr�bie tworzenia osoby kt�ra ma mniej niz 18 lat progarm powinien to naprawic, ustawiajac danej osobie
        // 18 lat (uzyc wyjatkiIllegalArgumentException())
        System.out.println(Osoba.createOsoba("asdas", "asdas", 16, "ada", "asd"));
        }



    public static void displayOldestWoman(List<Kobieta> kobietaList) {
        Kobieta oldest = kobietaList.get(0);
        for (Kobieta kobieta : kobietaList) {
            if (kobieta.getWiek() > oldest.getWiek()) {
                oldest = kobieta;
            }
        }
        System.out.println("Najstarsza kobieta to: " + oldest.getNazwisko() + " " + "która ma " + oldest.getWiek() + " lat.");
    }

    public static void introduceYourself(Osoba osoba) {
        System.out.println("Hej! Jestem: " + osoba.getImie() + " " + osoba.getNazwisko() + " " + " i mam " + osoba.getWiek() + " lat.");
    }
}





