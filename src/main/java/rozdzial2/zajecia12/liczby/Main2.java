package rozdzial2.zajecia12.liczby;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        //Stworz liste list Stringow np

        List<String> opel = new ArrayList<>(Arrays.asList("Astra", "Vectra", "Corsa"));
        List<String> audi = new ArrayList<>(Arrays.asList("A7", "A5", "A1"));
        List<String> mercedes = new ArrayList<>(Arrays.asList("C class", "A45", "SLS"));

        List<List<String>> listaList = new ArrayList<>(Arrays.asList(opel, audi, mercedes));

        System.out.println(listaList);

        //typ prosty
        int jj = 5;
        System.out.println(jj);

        //obiekt
        //Integer b = new Integer(5);

        //obiekt klasy BigDecimal
        BigDecimal bd = new BigDecimal("234");
        System.out.println(bd);

        //obiekt klasy BigInteger
        BigInteger a = new BigInteger("5");
        BigInteger b = new BigInteger("8");

        //sta�e reprezentujace 0,1,2,10
        System.out.println(BigInteger.ZERO);
        System.out.println(BigInteger.ONE);
        System.out.println(BigInteger.TWO);
        System.out.println(BigInteger.TEN);

        BigInteger wielkaLiczba = BigInteger.valueOf(234234234);

        //operacje matematyczne
        //dodawanie
        System.out.println("Suma " + a.add(b));

        System.out.println(a);
        System.out.println(b);

        //odejmowanie
        System.out.println("Roznica " + a.subtract(b));

        //mnozenie
        System.out.println("Iloczyn " + a.multiply(b));

        //dzielenie - BigInty sa tez zaokraglane jak zwykle inty
        System.out.println("Iloraz " + a.divide(b));

        //bitLength() - ilosc bitow potrzebnych do zapisu
        System.out.println(a.bitLength());

        //bitCount() - suma liczby bit�w
        System.out.println(a.bitCount());

        //metoda a.compareTo(b);
        // jesli a>b to zwraca 1
        // jesli a==b to zwraca 0
        // jesli a<b to zwraca -1

        System.out.println(a.compareTo(b));

        int y = 10;
        System.out.println(a.compareTo(new BigInteger(String.valueOf(y))));

        int calkowita = a.intValue();
        double rzeczywista = a.doubleValue();
        System.out.println(calkowita);
        System.out.println(rzeczywista);

        //equals() porownuje dwa obiekty
        System.out.println(a.equals(5));
        Integer n = 5;
        System.out.println(a.equals(n));

        BigInteger c = new BigInteger("5");

        System.out.println(a.equals(c));
        System.out.println();

        //max() zwraca wieksza z dwoch liczb
        System.out.println("wieksza " + a.max(b));

        //min() zwraca mniejsza z  dwoch liczb
        System.out.println("mniejsza " + a.min(b));

        BigInteger z = new BigInteger("5");
        BigInteger x = new BigInteger("17");

        //mod() reszta z dzielenia 17mod5 = 3calosci i 2 reszty
        System.out.println(x.mod(z));

        // 17 modInverse5 to jest 3
        System.out.println(x.modInverse(z));

        //isProbablePrime(x) sprawdza czy podana licab jest liczba pierwsza z pewnoa dokladnoscia x
        System.out.println(a.isProbablePrime(1));

        //wartosc bezwzgledna abs()
        System.out.println(a.abs());

        //potega pow()
        System.out.println(a.pow(4));

        //sqrt() pierwiastek
        System.out.println(a.sqrt());

        //negate() liczba przeciwna
        System.out.println(a.negate());

        //funkcja signum()
        //jesli arg > 0 to zwraca 1
        //jesli arg = 0 to zwraca 0
        //jesli arg < 0 to zwraca -1
        System.out.println(a.signum());

        BigInteger k = new BigInteger("16");    //    10000

        //przesuniecie bitowe
        System.out.println(k.shiftLeft(1)); // 100000
        System.out.println(k.shiftRight(1)); // 1000

        BigDecimal bb = new BigDecimal("32.567");

        //precision() laczna liczba cyfr liczby
        System.out.println(bb.precision());

        //scale() liczba cyfr po przecinku
        System.out.println(bb.scale());

        //Stworz liste BigItnow, stworz pare obiektow BigInt, dodaj je do listy, wyswietl w kolejnosci rosnacej

        List<BigInteger> lista = new ArrayList<BigInteger>();

        BigInteger aa = new BigInteger("1232320");
        BigInteger ab = new BigInteger("1");
        BigInteger ac = new BigInteger("297646332");
        BigInteger ad = new BigInteger("3");

        lista.add(aa);
        lista.add(ab);
        lista.add(ac);
        lista.add(ad);

        Collections.sort(lista);

        System.out.println(lista);

        List<BigInteger> lista2 = new ArrayList<BigInteger>();

        lista2.addAll(Arrays.asList(new BigInteger("7"), new BigInteger("5"), new BigInteger("14"), new BigInteger("2"), new BigInteger("10")));

        System.out.println("Liczby wieksze od: " + wiekszeOd(lista2));
        System.out.println(najwiekszaLiczba(lista2));

        List<BigInteger> lista3 = new ArrayList<BigInteger>();

        lista3.addAll(Arrays.asList(new BigInteger("17"), new BigInteger("23"), new BigInteger("32"), new BigInteger("11"), new BigInteger("10")));

        System.out.println(wynik(lista3, 5, 2));

        List<BigInteger> l1 = new ArrayList<>(Arrays.asList(new BigInteger("200"), new BigInteger("50"), new BigInteger("666")));
        List<BigInteger> l2 = new ArrayList<>(Arrays.asList(new BigInteger("599"), new BigInteger("100"), new BigInteger("-202")));
        List<BigInteger> l3 = new ArrayList<>(Arrays.asList(new BigInteger("122"), new BigInteger("3"), new BigInteger("1000")));

        List<List<BigInteger>> listaList2 = new ArrayList<>(Arrays.asList(l1, l2, l3));

        System.out.println(sumaLiczb(listaList2));
    }
    // Stworz metode ktora przyjmuje jako parametr Liste BigIntow i zwraca Liste
    // liczb wiekszych od 5

    public static List<BigInteger> wiekszeOd(List<BigInteger> lista) {
//		List<BigInteger> listaWieksza = new ArrayList<>();
//
//		for (BigInteger liczba : lista) {
//			if (liczba.compareTo(new BigInteger("5")) == 1) {
//				listaWieksza.add(liczba);
//			}
//		}
//
//		return listaWieksza;

        return lista.stream()
                .filter(bigInteger -> bigInteger.compareTo(new BigInteger("5")) > 0)
                .collect(Collectors.toList());
    }

    // Stw�rz metode kt�ra znajduje najwieksza liczbe typu BigInt na liscie
    public static BigInteger najwiekszaLiczba(List<BigInteger> lista) {
        BigInteger najwieksza = lista.get(0);

        for (BigInteger liczba : lista) {
            if (najwieksza.compareTo(liczba) < 0) {
                najwieksza = liczba;
            }
        }

//        return najwieksza;

        return lista.stream().max(BigInteger::compareTo).get();
    }

    // Stworz metode ktora przyjmuje jako parametr liste bigitnow oraz dwa inty a i
    // b i zwroci liste wszystkich elementow z listy ktorych wartosc modulo a = b.

    // element listy=17, a = 5, b=2 17mod5 =2

    public static List<BigInteger> wynik(List<BigInteger> lista, int a, int b) {
        List<BigInteger> koncowa = new ArrayList<BigInteger>();

        for (BigInteger liczba : lista) {
            if (liczba.mod(new BigInteger(String.valueOf(a))).compareTo(new BigInteger(String.valueOf(b))) == 0) {
                koncowa.add(liczba);
            }
        }
        return koncowa;
    }

    // Stworz metode ktora przyjmuje jako parametr liste list big intow :). Z kazdej
    // listy znajdz najwieksza wartosc i oblicz sume najwiekszych wartosci.

    public static BigInteger sumaLiczb(List<List<BigInteger>> listaList) {
        BigInteger suma = BigInteger.ZERO;

        for (List<BigInteger> lista : listaList) {

            BigInteger max = lista.get(0);

            for (BigInteger liczba : lista) {
                if (liczba.compareTo(max) == 1) {
                    max = liczba;
                }
            }

            suma = suma.add(max);   // suma += max
        }

        return suma;
    }
}
