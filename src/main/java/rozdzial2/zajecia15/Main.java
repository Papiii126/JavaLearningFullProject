package rozdzial2.zajecia15;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Firma f1 = Firma.builder()
                .nazwa("Januszex")
                .adres("Kochanowskiego 28")
                .dataZalozenia(LocalDate.of(1996, 6, 15))
                .build();

        Firma f2 = Firma.builder()
                .nazwa("Hubtex")
                .adres("Tomaszewskiego 287")
                .dataZalozenia(LocalDate.of(1996, 6, 15))
                .build();

        Firma f3 = Firma.builder()
                .nazwa("Tadeuszex")
                .adres("Giertycha 15")
                .dataZalozenia(LocalDate.of(1996, 12, 11))
                .build();

        Adres adres1 = Adres.builder()
                .kodPocztowy("20-707")
                .miasto("Warszawa")
                .nazwaUlicy("Kościuszki 28")
                .numerMieszkania(15)
                .build();

        Adres adres2 = Adres.builder()
                .kodPocztowy("01-152")
                .miasto("Lublin")
                .nazwaUlicy("Jana Olbrachta")
                .numerMieszkania(2)
                .build();

        Pracownik p1 = Pracownik.builder()
                .imie("Patryk")
                .nazwisko("Galant")
                .telefon("550986456")
                .mail("m.galant@interia.pl")
                .pensja(3000)
                .specjalizacja("handlowiec")
                .firma(f1)
                .adres(adres1)
                .build();

        p1.displayInfo();

        // f2.addPracownikToFirm(p1); //-> rzuci błąd, że pracownik p1 jest przypisany do innej firmy.

        Pracownik p2 = Pracownik.builder()
                .imie("Andrzej")
                .nazwisko("Mucha")
                .telefon("550985656")
                .mail("andrzej.mucha@interia.pl")
                .pensja(3000)
                .specjalizacja("ksiegowy")
                .firma(f2)
                .adres(adres2)
                .build();

        p2.displayInfo();


        Klient k1 = Klient.builder()
                .id(1)
                .imie("Tomasz")
                .nazwisko("Cedzik")
                .mail("tomasina@gmail.com")
                .telefon("512308956")
                .iloscZamowien(0)
                .znizka(0)
                .adres(adres1)
                .build();

        // k1.displayInfo();
        //k1.validateMail();


        Projekt projekt1 = Projekt.builder()
                .nazwa("Kozak")
                .koszt(10000)
                .build();

        Projekt projekt2 = Projekt.builder()
                .nazwa("Pipy")
                .koszt(10000)
                .build();

        projekt1.addPracownikToProjekt(p2);
        // projekt2.addPracownikToProjekt(p2); -> rzuci błąd, że pracownik już jest przypisany do innego projektu

        PracownikProjekt pp1 = PracownikProjekt.builder()
                .pracownik(p2)
                .projekt(projekt1)
                .ocena(Ocena.DOBRA)
                .data(LocalDate.of(2024, 7, 31))
                .build();

        System.out.println(pp1);
    }

    //public static Adres createAdres(){


    }



