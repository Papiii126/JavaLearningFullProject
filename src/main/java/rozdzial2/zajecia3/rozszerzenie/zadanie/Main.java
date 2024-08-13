package rozdzial2.zajecia3.rozszerzenie.zadanie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // stworzyc klase Adres (ulica, miasto)
        // stworzyc klase Firma ktora posiada Adres , nazwe, specjalizacje
        Firma firma1 = new Firma("Januszex", "Romaszewskiego", "spedycja");
        Firma firma2 = new Firma("Tomex", "Tytusa", "budowlanka");
        // stworzyc klase Pracownik (imie , nazwisko , wiek,  stawkaGodzinowa) pracownik ma tez id ktore automatycznie sie przyisuje podczas tworzenia obiektu
        // stworzyc klase zespol (nazwa)
        Pracownik pracownik1 = new Pracownik("Marta", "Tybura", 28, 25);
        Pracownik pracownik2 = new Pracownik("Tomasz", "Stachyra", 30, 30);
        Pracownik pracownik3 = new Pracownik("Marta", "Tybura", 32, 29);
        // stworzyc polaczenie firma ma wielu pracownikow a pracownik ma jedna firme
        // stworzyc metody ktore dodaja pracownika do firmy
        firma1.dodajPracownika(pracownik1);
        firma1.dodajPracownika(pracownik2);
        firma1.dodajPracownika(pracownik3);
        firma1.displayWorkers();
        // stworzyc metoda ktora obliczy pense pracownika
        System.out.println("Pensja pracownika wynosi: "  + pracownik1.pensja(180));
        // stworzyc metode ktora znajdzie najstarsza osobe w firmie
        firma1.displayOldest();
        // stworzyc metode ktora znajdzie z podanej jako argument listy osob osobe z najwieksza stawka godzinowa
        firma1.findTheBiggestStake(firma1.getListaPracowników());
        // stworzyc metode ktora wyswietli tylko id wszystkich pracownikow
        firma1.displayID(firma1.getListaPracowników());
        // kompozycja
        // stworzyc metode w klasie zespol ktora tworzy zespol a za argument pobiera (nazwe oraz firme)
        Zespol zespol1 = new Zespol("Gladiatorzy");
        zespol1.createTeam("Mistrzowie", firma1);
        List<Pracownik> nowaListaPracownikow = List.of(pracownik1, pracownik2, pracownik3);
        zespol1.singEmploeeToTeam(nowaListaPracownikow);

        }
    }

