package rozdzial2.zajecia11.ZadanieProgramisci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /*
     * Stwórz krotki system do zarzadzania programistami i ich partnerkami
     *
     * Programista ma imie, nazwisko, pensje oraz lsite jezykow jakie zna
     *
     * Kobieta ma imie, nazwsiko, rozmiar biustu oraz IQ
     *
     * Napisz metode ktora znajduje top n programistow (jesli chodzi o zarobki)
     * ktorzy kodza w javie. Jesli nie jestes w stanie tego zrobic rzuc wyjatkiem
     * NoJavaPorgrammerHereException
     *
     * Programista moze chodzic na Randke(nazwa, miejsce, kobieta). Napisz metode
     * ktora wylicza % szanse na zaliczenie na randce. Algorytm zalezy odm iejsca np
     * restuaracja +10%, kino +20% itd oraz od kobiety, rozmiar A + 10%, B+ 20% itd
     * oraz od IQ wzor IQ/100. Jesli szansa na zaliczenie wynosi over 100%
     * programista jest zapewny siebie i jego szanse spdaja, zatem obslugujemy
     * wyajtek i ustawiamy szanse na zaliczenie do 30%
     *

     * Dodaj kobiecie atrybut ulubione miejsce, ktore jest losowane z listy miejsc.
     * Jesli wylosowane ulubione miejsce kobiety jest inne niz to w ktorym zabral je
     * programista powstaje konflikt, BadPlaceForDateException z zastrzezeniem ze
     * moze przyjac on wiadomosc dla programisty od kobiety albo zostac pusty
     */

    public static void main(String[] args) {

        Kobieta k1 = Kobieta.builder()
                .imie("Katarina")
                .nazwiwsko("Szon")
                .rozmiarBiustu("C")
                .IQ(500)
                .build();

        Randka r1 = new Randka("romantczna", "restauracja",k1);

        Programista p1 = Programista.builder()
                .imie("Tomasz")
                .nazwisko("Asti")
                .pensja(12000)
                .znaneJezyki(List.of("Java", "Python", "C++"))
                .build();

        Programista p2 = Programista.builder()
                .imie("Andrzej")
                .nazwisko("Topek")
                .pensja(10000)
                .znaneJezyki(List.of("C++"))
                .build();

        Programista p3 = Programista.builder()
                .imie("Antoni")
                .nazwisko("Pasik")
                .pensja(8000)
                .znaneJezyki(List.of("Python"))
                .randka(r1)
                .build();

        Programista p4 = Programista.builder()
                .imie("Anita")
                .nazwisko("Werner")
                .pensja(15000)
                .znaneJezyki(List.of("Java", "Python", "C++"))
                .build();

        List<Programista> programistaList = new ArrayList<>();
        programistaList.addAll(Arrays.asList(p1, p2, p3, p4));

        List<String> dostepneMiejsca = List.of("restauracja", "kino", "kawiarnia");

//
//        Napisz metode ktora znajduje top n programistow (jesli chodzi o zarobki)
//        ktorzy kodza w javie. Jesli nie jestes w stanie tego zrobic rzuc wyjatkiem NoJavaPorgrammerHereException.

        try {
            List<Programista> topProgramisci = Programista.findTopNProgrammers(programistaList, 1);
            System.out.println("Top programiści w Javie:");
            for (Programista programista : topProgramisci) {
                System.out.println(programista);
            }
        } catch (NoJavaPorgrammerHereException e) {
            System.out.println(e.getMessage());
        }

//        Programista moze chodzic na Randke(nazwa, miejsce, kobieta). Napisz metode
//        ktora wylicza % szanse na zaliczenie na randce. Algorytm zalezy odm iejsca np
//        restuaracja +10%, kino +20% itd oraz od kobiety, rozmiar A + 10%, B+ 20% itd
//        oraz od IQ wzor IQ/100. Jesli szansa na zaliczenie wynosi over 100%
//        programista jest zapewny siebie i jego szanse spdaja, zatem obslugujemy
//        wyajtek i ustawiamy szanse na zaliczenie do 30%

        try {
            double szanse = p3.countChanceFor();
            System.out.println("Szanse na zaliczenie: " + szanse + "%");
        } catch (ProgramistaIsTooConfident e) {
            System.out.println(e.getMessage());
            double szanse = 30;
            System.out.println("Nowe szanse na zaliczenie: " + szanse + "%");
        }

//        * Dodaj kobiecie atrybut ulubione miejsce, ktore jest losowane z listy miejsc.
//          Jesli wylosowane ulubione miejsce kobiety jest inne niz to w ktorym zabral je
//     *    programista powstaje konflikt, BadPlaceForDateException z zastrzezeniem ze
//          moze przyjac on wiadomosc dla programisty od kobiety albo zostac pusty
        k1.losujUlubioneMiejsce(dostepneMiejsca);
        System.out.println("Ulubione miejsce kobiety: " + k1.getUlubioneMiejsce());
    }
}



