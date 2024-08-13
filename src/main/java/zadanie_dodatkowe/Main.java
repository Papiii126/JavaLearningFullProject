package zadanie_dodatkowe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // stworzyc klase Adres (ulica, miasto)
        Adres adres1 = new Adres("Kochanowskiego", "Lublin");

        // stworzyc klase Firma ktora posiada Adres , nazwe, specjalizacje
        Firma firma1 = new Firma(adres1, "Januszex", "spedycja");
        Firma firma2 = new Firma(adres1, "Nibyland", "drukarnia");


        // stworzyc klase Pracownik (imie , nazwisko , wiek,  stawkaGodzinowa) pracownik ma tez id ktore automatycznie sie przyisuje podczas tworzenia obiektu
        Pracownik pracownik1 = new Pracownik("Katarzyna", "Lopa", 26, 25);
        Pracownik pracownik2 = new Pracownik("Anna", "Topek", 28, 35);
        Pracownik pracownik3 = new Pracownik("Tomasz", "Oskroba", 32, 55);

        // stworzyc klase zespol (nazwa)
        Zespol zespol1 = new Zespol("marketingowcy");
        Zespol zespol2 = new Zespol("analitycy");

        // stworzyc polaczenie firma ma wielu pracownikow a pracownik ma jedna firme
        // stworzyc metody ktore dodaja pracownika do firmy
        firma1.dodajPracownikaDoFirmy(pracownik1);
        firma1.dodajPracownikaDoFirmy(pracownik2);
        firma1.displayWorkers();
        // stworzyc metoda ktora obliczy pense pracownika
        System.out.println(pracownik1.displaySalary(200));
        // stworzyc metode ktora znajdzie najstarsza osobe w firmie
        firma1.findOldestEmploee();
        // stworzyc metode ktora znajdzie z podanej jako argument listy osob osobe z najwieksza stawka godzinowa
        firma1.findTheBiggestStake(firma1.getListaPracownikoww());
        // stworzyc metode ktora wyswietli tylko id wszystkich pracownikow
        firma1.displayID(firma1.getListaPracownikoww());
        // kompozycja
        // stworzyc metode w klasie zespol ktora tworzy zespol a za argument pobiera (nazwe oraz firme)
        zespol1.getListOfEmploeeInTeam().add(pracownik1);
        List<Pracownik> newList = List.of(pracownik1, pracownik2);
        zespol1.addEmploeeToTeam(newList);


    }
}


