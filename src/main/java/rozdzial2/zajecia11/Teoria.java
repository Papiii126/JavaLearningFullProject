package rozdzial2.zajecia11;

import javax.imageio.IIOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teoria {
    public static void main(String[] args) {
        /*
         * po Throwable dziedzicza dwie klasy:
         * 1) Exception - klasy dziedziczace po Exception oznaczaja jakis blad, z ktorym aplikacja powinna sobie poradzic
         * 2) Error  - klasy dziedziczcace po klasie Error oznaczaja jakis blad, gdzie aplikacja moze dzialac niepoprawnie
         *             sa one rzucane przez JVM
         *
         * throwable<-exception<-runtime exception <- illegalargumentexception
         *
         *  Roznica pomiedzy exception a runtime exception jest taka ze exceptiona musimy obsluzyc, tzn ze jesli metoda moze rzucic wyjatkiem
         *  typu exception to musi zadeklrowac throws ....
         *
         *  NullPointerException - rzucany kiedy próbujesz wywolac metode na zmiennej ktorej wartosc to null
         *  IllegalArgumentException - rzucany kiedy przekazywany argument jest z jakiegos powodu nieprawidłowy
         *  NumberFormatException - np gdy próbujemy zamienic liczbe na stringa albo odwrotnie i sie neid a bo np string nie jest liczba
         *  IndexOutOfBoundException - np odwolanei sie do nieistniejacego elementu tablicy lub listy
         *  IOException - wyjatki zwiazane z problemami wejscia/wyjscia np przy zapisie i odczycie z pliku
         *
         */

        Pracownik p1 = new Pracownik("Jan");


        double pensja;
        try {
            pensja = p1.obliczPensje(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            pensja = p1.obliczPensje(10);
        }

        System.out.println(pensja);

        //obsluga wyjatkow w kilku catchach
        try {
            throw new IllegalArgumentException();
        } catch (ArithmeticException e) {
            System.out.println("dupa");
        } catch (RuntimeException e) {
            System.out.println("jasio");
        } catch (Exception e) {
            System.out.println("dupa");
        }

        //obsluga kilku rodzajow wyjatkow w jednym bloku catch
        double wynik = 0;

        try {
            System.out.println(5 / 0);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("pamietaj cholero nie dziel przez 0");
        }
        //taka lista metod wywołujaca siebie nawzajem nazywamy stosem wywołan, z ang StackTrace

        //main
        //metoda1
        //metoda2
        //metoda 3

        //1 linijka mowi jaki wyjatek zostal rzucony
        //kazda kolejna to naazwa klasy wraz z pakietem i nazwa metody
        // wazne ze kolejnosc jest odwrocona

//		Main m = new Main();
//		m.metoda1();


        //finally

        Scanner odczyt = new Scanner(System.in);

        double liczba = 0;

        System.out.println("Podaj liczbę: ");

        while (true) {
            try {
                liczba = odczyt.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadz poprawinie liczbe!");
                odczyt.next();
            } finally {
                System.out.println("finaaalllyyyy");
            }
        }


        while (true) {
            try {
                System.out.println("Pierwiastek z podanej liczby to: " + pierwiastek(liczba));
                break;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Liczba musi byc wieksza od 0!");
            }
        }


        //wyjatki checked oraz unchcecked
        //wyjatki typu checked musza byc obsluzone, jesli wyjatek w swojej hierarchi ma exception i nie ma runtimeexception to jest checked


        try {
            podajCyfre(5);
        } catch (IIOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        podajLitere('a');

    }

    public void metoda1() {
        metoda2();
    }

    public void metoda2() {
        metoda3();
    }

    public void metoda3() {
        throw new RuntimeException("ruuuuuuuun forest run");
    }

    public static double pierwiastek(double liczba) {
        if (liczba < 0) {
            throw new IllegalArgumentException("Liczba musi byc wieksza od 0!");
        }
        return Math.sqrt(liczba);
    }

    public static void podajLitere(char a) {
        throw new IllegalArgumentException("blablabal");
    }

    public static void podajCyfre(int a) throws IIOException {
        throw new IIOException("3a3a");
    }

}
