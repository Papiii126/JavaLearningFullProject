package rozdzial2.zajecia8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /* REGEXYYY */
        //kompilujemy wyrazenie regularne Tomek uzyskujac instancje klasy Pattern
        Pattern pattern = Pattern.compile("Tomek");

        //metoda matcher wywolana na instancji klasy pattern tworzy obiekt klasy Matcher, parametr ktory przekazujemy jako atrybut metody
        //to lancuch znakow na ktorym uzywamy regexa
        Matcher matcher = pattern.matcher("Tomek ma");

        //find() - zwraca true jesli w lancucha znakow znajduje sie cos co pasuje do regexa
        System.out.println(matcher.find());

        //matches() - zwraca true jesli lancuch znakow pasuje w calosci do regexa
        System.out.println(matcher.matches());
        System.out.println();

        //znak ? oznacza ze element znajdujacy sie przed znakiem jest opcjonalny, moze wystapic raz albo nie wystepowac wcale
        Pattern pattern1 = Pattern.compile("Tom?ek");
        System.out.println(pattern1.matcher("Tomek").matches());
        System.out.println(pattern1.matcher("Toek").matches());
        System.out.println(pattern1.matcher("Tommek").matches());
        System.out.println();

        //znak * oznacza ze element poprzedzajacy moze byc powtorzony 0 lub wiecej razy
        Pattern pattern2 = Pattern.compile("Mat*eusz");
        System.out.println(pattern2.matcher("Maeusz").matches());
        System.out.println(pattern2.matcher("Matteusz").matches());
        System.out.println(pattern2.matcher("Mateeusz").matches());
        System.out.println();

        // znak + oznacza ze element poprzedzjay moze byc powtorzony 1 lub wiecej razy
        Pattern pattern3 = Pattern.compile("Mat+eusz");
        System.out.println(pattern3.matcher("Matteusz").matches());
        System.out.println(pattern3.matcher("Maeusz").matches());
        System.out.println();

        // znak . oznacza dowolny symbol (poza znakiem nowej linii)
        Pattern pattern4 = Pattern.compile("K.t");
        System.out.println(pattern4.matcher("Kot").matches());
        System.out.println(pattern4.matcher("K\nt").matches());
        System.out.println(pattern4.matcher("K\tt").matches());
        System.out.println();

        // zeby okreslic dopusczalna liczbe powtorzen konkretna trzeba uzyc { }

        //{x} - oznacza ze element poprzedzajacy musi wystapic dokladnie x raazy
        Pattern pattern5 = Pattern.compile("Go{3}l");
        System.out.println(pattern5.matcher("Goool").matches());
        System.out.println(pattern5.matcher("Gool").matches());
        System.out.println();

        //{x,} - oznacza ze element poprzedzajacy musi wystapic co najmniej x razy
        Pattern pattern6 = Pattern.compile("Go{3,}l");
        System.out.println(pattern6.matcher("Goooooool").matches());
        System.out.println(pattern6.matcher("Gol").matches());
        System.out.println();

        //{x,y} - oznacza ze element poprzedzajacy musi wystapic od x do y razy
        Pattern pattern7 = Pattern.compile("Go{1,5}l");
        System.out.println(pattern7.matcher("Gol").matches());
        System.out.println(pattern7.matcher("Gooooooool").matches());
        System.out.println(pattern7.matcher("Goooool").matches());
        System.out.println();

        /*klasy predefiniowane
         * \d - jakakolwiek cyfra [0-9]
         * \D - cokolwiek co nie jest cyfra [^0-9]
         * \w - znak ktory uzywany jest w slowach [a-zA-Z0-9_]
         * \W - zaprzeczenie grupy \w
         * \s - whitespacy czyli znaki ktorych nie widac na wydruku np \n, \t, spacja
         * \S - zaprzeczenie grupy \s
         */

        //klasy w regezach oznaczaja pewne grupy symboli i zapisujemy je za pomcoa [ ]

        Pattern pattern9 = Pattern.compile("[a-d]uma");
        System.out.println(pattern9.matcher("duma").matches());
        System.out.println(pattern9.matcher("auma").matches());
        System.out.println(pattern9.matcher("cuma").matches());
        System.out.println(pattern9.matcher("Suma").matches());
        System.out.println();

        Pattern pattern10 = Pattern.compile("[0-5]abc");
        System.out.println(pattern10.matcher("5abc").matches());
        System.out.println(pattern10.matcher("3abc").matches());
        System.out.println(pattern10.matcher("7abc").matches());
        System.out.println("11 ******************8");

        Pattern pattern11 = Pattern.compile("[a-cB-D0-3]zxy");
        System.out.println(pattern11.matcher("azxy").matches());
        System.out.println(pattern11.matcher("Bzxy").matches());
        System.out.println(pattern11.matcher("3zxy").matches());
        System.out.println();

        //^ zaprzeczenie
        Pattern pattern12 = Pattern.compile("[^xyz]abc");
        System.out.println(pattern12.matcher("#abc").matches());
        System.out.println(pattern12.matcher("Kabc").matches());
        System.out.println(pattern12.matcher("zabc").matches());
        System.out.println();

        //stworz regexa na imie
        Pattern pattern13 = Pattern.compile("[A-Z][a-z]{2,}");
        System.out.println(pattern13.matcher("Mateusz").matches());
        System.out.println(pattern13.matcher("mateusz").matches());
        System.out.println(pattern13.matcher("Ma").matches());
        System.out.println();

        System.out.println("********************* 14 ************************");


        /*PRACA DOMOWA */
        //stworzc regexa na imie i nazwisko (imie i nazwisko conajmniej 2 litery)
        //stworz pattern na date 02.04.2008
        //pattern na adres mailowy (@ ma wystpiac 1x)
        //pattern na pesel(11 liczb)
        //patern na nmer telefonu +48 123456789 (+48 jest zawsze i 9 liczb)

        Pattern pattern14 = Pattern.compile("^[A-Za-z]+ [A-Za-z]+$");
        System.out.println(pattern14.matcher("Patryk Podolak").matches());
        Pattern pattern15 = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[0-2])\\.\\d{4}$");
        System.out.println(pattern15.matcher("02.04.2008").matches());
        Pattern pattern16 = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        System.out.println(pattern16.matcher("p.podolak@interia.pl").matches());
        Pattern pattern17 = Pattern.compile( "\\b\\d{11}\\b");
        System.out.println(pattern17.matcher("96062811237").matches());
        Pattern pattern18 = Pattern.compile("^\\+48 \\d{9}$");
        System.out.println(pattern18.matcher("+48 512369712").matches());


    }


    /*
     * https://www.samouczekprogramisty.pl/advent-of-code-2016-dzien-4/
     * https://www.samouczekprogramisty.pl/advent-of-code-2016-dzien-8/
     * https://www.samouczekprogramisty.pl/advent-of-code-2016-dzien-10/
     * https://www.samouczekprogramisty.pl/advent-of-code-2016-dzien-12/
     * https://www.samouczekprogramisty.pl/advent-of-code-2016-dzien-21/
     */

}
