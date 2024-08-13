package rozdzial2.zajecia1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Kolekcje

        //kolekcje to dynamiczne tablice - nigdy nie podajemy ich rozmiaru
        //dodajac kazdy kolejny element do kolekcji powieksza sie jego rozmiar automatycznie

        //kolekcje niegeneryczne - nie wymagaja aby elementy w niej przechowywane byly tego samego typu
        //nie podajemy typu takiej kolekcji, nie jest to dobra praktyka
        //takie podejscie wymaga pilnowania zapisu i odczytu danych ronzych typow
        List kolekekcjaNiegeneryczna = new ArrayList();
        kolekekcjaNiegeneryczna.add(1);
        kolekekcjaNiegeneryczna.add("Kot");
        System.out.println(kolekekcjaNiegeneryczna);


        /* ArrayList
         * 1) przechowuje wewnetrznie elementy w dynamicznej tablicy - nie podajemy jej rozmiaru
         * 2) dane zapisywane w pamieci znajduja sie obok siebie
         * 3) wolniejsza niz LinkedLista do manipulacji danych
         */

        //kolekcje generyczne, kolekcje typowane - oznacza ze kolekcja moze przechowywac dane tego samego typu
        List<String> listaImion = new ArrayList<>();

        //1 opcja dodania elementow do listy - metoda add()
        listaImion.add("Tomek");
        listaImion.add("Marcin");
        listaImion.add("Ania");
        listaImion.add("Klaudia");

        System.out.println(listaImion);
        System.out.println();

        //2 opcja dodania elementow do listy - metoda addAll()
        // listaImion.addAll(Arrays.asList("Robert", "Lukasz", "Grzegorz"));
        System.out.println(listaImion);

        //3 opcja dodania elementow przy tworzeniu listy
        // List<String> listaImion2 = Arrays.asList("Robert", "Ania", "Zuzia");

        //wypisanie konkretnego indeksu z kolekcji
        //kolekcje tez indeksujemy od 0
        System.out.println("Pierwszy element: " + listaImion.get(0));

        //1 opcja wypisanie kolekcji po prostu syso(kolekcja)
        System.out.println(listaImion);

        //2 opcja - uzycie petli for each
        for (String imie : listaImion) {
            System.out.print(imie + " ");
        }
        System.out.println();

        //3 opcja - uzycie iterator, ktory umozliwia iterowanie po kolekcjach
        //metoda next() - returnuje nastepny element iteratora
        //metoda hasNext() - zwraca true dopoki cos sie znadjuje w kolekcji
        Iterator<String> iterator = listaImion.iterator();
        //while (Iterator.hasNext()) {
            System.out.print(iterator.next() + " ");

            //rozmiar kolekcji
            System.out.println("Rozmiar kolekcji to: " + listaImion.size());
            listaImion.add("Piotrek");
            System.out.println("Rozmiar kolekcji to: " + listaImion.size());

            //usuniecie z kolekcji - metoda remove()
            //jesli podamy jako parametr liczbe (indeks) to usunie nam sie element o danym indeksie
            System.out.println("Przed usunieciem: " + listaImion);
            listaImion.remove(0);
            System.out.println("Po usunięciu: " + listaImion);

            //jesli metoda remove za parametr przyjmie obiekt to go tez usunie
            listaImion.remove("Ania");
            System.out.println(listaImion);

            // listaImion.removeAll(Arrays.asList("Marcin", "Klaudia"));
            System.out.println(listaImion);

            //metoda conatains() zwraca true jesli obiekt poday jako parametr znajduje sie na liscie
            System.out.println("Grzegorz znajduje sie na liscie: " + listaImion.contains("Grzegorz"));
            System.out.println("Przemek nie znajduje sie na liscie: " + listaImion.contains("Przemek"));

            //isEmpty() - zwraca true jesil kolekcja jest pusta
            System.out.println("Czy kolekcja jest pusta? " + listaImion.isEmpty());
            //metoda clear() usuwa wszystkie elementy z kolekcji
            //listaImion.clear();
            //System.out.println(listaImion.size());

            listaImion.add("Grzegorz");
            System.out.println(listaImion);

            //metoda indexOf()
            //zwraca indeks pierwszego wystapienia obiektu podanego jako parametr
            //jesli obiektu nie ma na liscie to metoda zwraca -1

            System.out.println("Pierwszy indeks Grzegorza: " + listaImion.indexOf("Grzegorz"));
            //metoda lastIndexOf()
            //zwraca indeks ostatniego wystapienia obiektu podanego jako parametr
            //jesli obiektu nie ma na liscie to metoda zwraca -1
            System.out.println("Ostatni indeks Grzegorza: " + listaImion.lastIndexOf("Grzegorz"));
            System.out.println();

            //metoda set(index, String) jako parametr przyjmuje indeks i wartosc i zastepuje nasz podany indeks podana wartoscia
            System.out.println(listaImion);
            listaImion.set(0, "Ania");
            System.out.println(listaImion);

            //metoda toString()  - tworzy mi stringa z calej listy
            String kolekcja = listaImion.toString();
            System.out.println(kolekcja);

            //getClass() reprezentacja klasowa kolekcji
            System.out.println(kolekcja.getClass());

            //getSimpleName() wyswietla mi typ kolekcji bez dodatkow
            System.out.println(kolekcja.getClass().getSimpleName());


            //metoda subList() zwraca liste od indeksu podanego jako pierwszy parametr (uwzgledniajac go)
            //do indeksu podanego jako drugi parametr (bez uwzgledniania go)
            System.out.println(listaImion.subList(1, 3));

            System.out.println("Tablica");
            Object[] tablica = listaImion.toArray();
            System.out.println(tablica[0]);

            System.out.println("Przed sortowaniem: " + listaImion);
            //Collections.sort(listaImion);
            System.out.println("Po sortowaniu: " + listaImion);

            //LinkedList
            /* 1) Przechowuje wewnetrznie elementy opakowane w obiekty wskazauje na element poprzedni i nastepny
             * 2) Dane w pamieci zapisywane sa rozstrzelone
             * 3) Szybsza do manipulacji danych
             */

            List<String> listaNazwisk = new LinkedList<>();
            listaNazwisk.add("Kowalski");
            listaNazwisk.add("Nowak");
            listaNazwisk.add("Mosakowski");


            List<String> listaNazwisk2 = new ArrayList<>();
            listaNazwisk2.add("Kowalski");
            listaNazwisk2.add("Nowak");
            listaNazwisk2.add("Mosakowski");

            //sprawdza czy dwie kolekcje sa takie same
            System.out.println(listaNazwisk2.equals(listaNazwisk));
            System.out.println(listaNazwisk2.equals(listaNazwisk));


//		1) Zadeklaruj ArrayListe intów, dodaj do niej 5 róznych licz metoda add, wyswietl cala liste petla for each.
//        2) Stwórz metode która zwróci sume liczb z ArrayListy z 1 zadania
//        3) Stwórz metode która wyswietli z listy z 1 zadania liczby wieksze od 3
//        4) 4) Zadeklaruj Liste Stringów, dodaj do niej kolekcje 4 imion metoda addAll
//        5) //	5) Napisz metode do zadania 4, która zwroci najdluzsze imie
//        6) Napisz metode do zadani 4 która zwraca true jesli podane imie (jako parametr) znajduje sie w kolekcji
//        7) 	7) Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej
        }
    }


